package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.AccountCreationException;
import javaclasses.cloud.UserRegistration;
import javaclasses.cloud.impl.valueobject.UserVO;
import sun.security.krb5.Credentials;

import javax.security.auth.login.AccountNotFoundException;

public class UserRegistrationImpl implements UserRegistration {
    @Override
    public UserVO createAccountThrowSocialNetwork(Credentials socialNetworkCredentials) throws AccountNotFoundException {
        return null;
    }

    @Override
    public UserVO createNewAccount(UserVO userVO) throws AccountCreationException {
        return null;
    }
}
