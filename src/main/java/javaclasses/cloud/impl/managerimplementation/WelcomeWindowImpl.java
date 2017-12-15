package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.AccountCreationException;
import javaclasses.cloud.WelcomeWindow;
import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.valueobject.UserVO;

import javax.security.auth.login.AccountNotFoundException;

public class WelcomeWindowImpl implements WelcomeWindow {
    @Override
    public SecurityToken singIn(Credentials credentials) throws AccountNotFoundException {
        return null;
    }

    @Override
    public UserVO createAccount(UserVO user) throws AccountCreationException {
        return null;
    }
}
