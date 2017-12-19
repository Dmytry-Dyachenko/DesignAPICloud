package javaclasses.cloud;

import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;
import javaclasses.cloud.impl.valueobject.UserVO;

import javax.security.auth.login.AccountNotFoundException;

/**
 * API that will appear first at welcome screen.
 */
public interface WelcomeWindow {
    /**
     * For users, that already have an account on the cloud.
     *
     * @param credentials for logging in.
     * @return the security token for using by user on the cloud.
     * @throws AccountNotFoundException in the case when account was not found.
     */
    SecurityToken singIn(Credentials credentials) throws AccountNotFoundException;

    /**
     * For users, that don’t have an account on the cloud.
     *
     * @param user main information that is necessary for creating an account.
     * @throws AccountCreationException that will throw when account will unable to create.
     */
    UserVO createAccount(UserVO user) throws AccountCreationException;

}
