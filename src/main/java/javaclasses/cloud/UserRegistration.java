package javaclasses.cloud;

import sun.security.krb5.Credentials;

import javax.security.auth.login.AccountNotFoundException;

public interface UserRegistration {

    UserVO createAccountThrowSocialNetwork(Credentials socialNetworkCredentials) throws AccountNotFoundException;

    UserVO createNewAccount(User user) throws AccountCreationException;

}
