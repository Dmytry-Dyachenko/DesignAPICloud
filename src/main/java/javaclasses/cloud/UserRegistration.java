package javaclasses.cloud;

import sun.security.krb5.Credentials;

public interface UserRegistration {

    User createAccountThrowSocialNetwork(Credentials socialNetworkCredentials);

    User createNewAccount(User user);

}
