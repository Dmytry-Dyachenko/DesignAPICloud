import javaclasses.cloud.AccountCreationException;
import javaclasses.cloud.FileWorkException;
import javaclasses.cloud.LinkGenerationException;
import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.managerimplementation.*;
import javaclasses.cloud.impl.tinytype.FileId;
import javaclasses.cloud.impl.tinytype.UserId;
import javaclasses.cloud.impl.valueobject.FileVO;
import javaclasses.cloud.impl.valueobject.UserVO;
import org.junit.Test;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.sasl.AuthenticationException;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

import static javaclasses.cloud.impl.FileType.TXT;

public class CloudTest {

    private final WelcomeWindowImpl welcomeWindow = new WelcomeWindowImpl();
    private final UserRegistrationImpl userRegistration = new UserRegistrationImpl();
    private final UserAuthenticationImpl userAuthentication = new UserAuthenticationImpl();
    private final FileManagementImpl fileManagement = new FileManagementImpl();
    private final FileSharingManagementImpl fileSharer = new FileSharingManagementImpl();

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

    @Test
    public void testEditingFolderAfterLoggingIn() throws AuthenticationException, AccountNotFoundException, FileWorkException {
        final UserVO user = new UserVO(new UserId((long) 1), "Petya", "passw");
        final FileVO file = new FileVO(new FileId((long) 1), "text1", TXT);
        final SecurityToken token = welcomeWindow.singIn(new Credentials(user.getLoginName(), user.getPassword()));
        fileManagement.editFile(token, file.getId());
    }

    @Test
    public void testRegistrationThrowSocialNetworkAndRemoveFile() throws AuthenticationException, AccountCreationException, FileNotFoundException {
        final UserVO user = new UserVO(new UserId((long) 1), "Jenya", "passwo");
        final FileVO file = new FileVO(new FileId((long) 1), "text2", TXT);
        final UserVO account = welcomeWindow.createAccount(user);
        final Credentials credentials = new Credentials(account.getLoginName(), account.getPassword());
        final SecurityToken token = userAuthentication.authenticate(credentials);
        fileManagement.removeFile(token, file.getId());
    }

    @Test()
    public void testCreatingFileAndSharingIt() throws AccountNotFoundException, FileWorkException, FileNotFoundException, LinkGenerationException {
        final byte[] someInputArray = new byte[10];
        final UserVO user = new UserVO(new UserId((long) 1), "Max", "passwor");
        final FileVO file = new FileVO(new FileId((long) 1), "text1", TXT);
        final FileVO fileVO = new FileVO(new FileId((long) 1), "name", TXT);
        final SecurityToken token = welcomeWindow.singIn(new Credentials(user.getLoginName(), user.getPassword()));
        fileManagement.createFile(token, new ByteArrayInputStream(someInputArray), fileVO);
        fileSharer.generateLinkForShareFile(token, file.getId());
    }

    @Test
    public void testEditingFileAndSharingIt() throws AccountNotFoundException, FileWorkException, LinkGenerationException {
        final UserVO user = new UserVO(new UserId((long) 1), "Den", "password");
        final FileVO file = new FileVO(new FileId((long) 1), "texter", TXT);
        final SecurityToken token = welcomeWindow.singIn(new Credentials(user.getLoginName(), user.getPassword()));
        final FileId fileId = file.getId();
        fileManagement.editFile(token, fileId);
        fileSharer.generateLinkForShareFile(token, fileId);

    }


}
