package javaclasses.cloud;

import javaclasses.cloud.impl.valueobject.UserVO;
import sun.security.krb5.Credentials;

import javax.security.auth.login.AccountNotFoundException;

/**
 * Registration window API.
 */
public interface UserRegistration {
    /**
     * Creating account using the credentials from social network.
     *
     * @param socialNetworkCredentials the basic information from social network account.
     * @throws AccountNotFoundException in the case when account was not found.
     */
    UserVO createAccountThrowSocialNetwork(Credentials socialNetworkCredentials) throws AccountNotFoundException;

    /**
     * Creating fully new account/
     *
     * @param userVO main information that is necessary for creating an account.
     * @throws AccountCreationException throws when account will unable to create.
     */
    UserVO createNewAccount(UserVO userVO) throws AccountCreationException;

}
