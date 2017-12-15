package javaclasses.cloud;

import sun.security.krb5.Credentials;

import javax.security.auth.login.AccountNotFoundException;

public interface WelcomeWindow {

    SecurityToken singIn(Credentials credentials) throws AccountNotFoundException;

    UserVO createAccount(User user) throws AccountCreationException;

}
