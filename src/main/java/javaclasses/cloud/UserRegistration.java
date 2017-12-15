package javaclasses.cloud;

import javaclasses.cloud.impl.valueobject.UserVO;
import sun.security.krb5.Credentials;

import javax.security.auth.login.AccountNotFoundException;

public interface UserRegistration {

    UserVO createAccountThrowSocialNetwork(Credentials socialNetworkCredentials) throws AccountNotFoundException;

    UserVO createNewAccount(UserVO userVO) throws AccountCreationException;

}
