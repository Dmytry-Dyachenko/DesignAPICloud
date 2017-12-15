package javaclasses.cloud;

import sun.security.krb5.Credentials;

public interface WelcomeWindow {

    SecurityToken singIn(Credentials credentials);

    User createAccount(User user);

}
