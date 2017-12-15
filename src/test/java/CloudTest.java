import javaclasses.cloud.AccountCreationException;
import javaclasses.cloud.FileWorkException;
import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.managerimplementation.FileManagementImpl;
import javaclasses.cloud.impl.managerimplementation.UserAuthenticationImpl;
import javaclasses.cloud.impl.managerimplementation.UserRegistrationImpl;
import javaclasses.cloud.impl.managerimplementation.WelcomeWindowImpl;
import javaclasses.cloud.impl.tinytype.FileId;
import javaclasses.cloud.impl.tinytype.UserId;
import javaclasses.cloud.impl.valueobject.FileVO;
import javaclasses.cloud.impl.valueobject.UserVO;
import org.junit.Test;

import javax.security.sasl.AuthenticationException;
import java.io.ByteArrayInputStream;

import static javaclasses.cloud.impl.FileType.TXT;

public class CloudTest {

    private final WelcomeWindowImpl welcomeWindow = new WelcomeWindowImpl();
    private final UserRegistrationImpl userRegistration = new UserRegistrationImpl();
    private final UserAuthenticationImpl userAuthentication = new UserAuthenticationImpl();
    private final FileManagementImpl fileManagement = new FileManagementImpl();

    @Test
    public void testAddingFileAfterRegistration() throws AccountCreationException, AuthenticationException, FileWorkException {
        final byte[] someInputArray = new byte[10];
        final UserVO user = new UserVO(new UserId((long) 1), "Vasya", "pass");
        final UserVO account = welcomeWindow.createAccount(user);
        final UserVO newAccount = userRegistration.createNewAccount(account);
        final SecurityToken token = userAuthentication.authenticate(new Credentials(newAccount.getLoginName(), newAccount.getPassword()));
        final FileVO file = new FileVO(new FileId((long) 1), "name", TXT);
        fileManagement.createFile(token, new ByteArrayInputStream(someInputArray), file);
    }
}
