package javaclasses.cloud;

import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;

import javax.security.auth.login.AccountNotFoundException;

public interface WelcomeWindow {

    SecurityToken singIn(Credentials credentials) throws AccountNotFoundException;

    UserVO createAccount(UserVO user) throws AccountCreationException;

}
