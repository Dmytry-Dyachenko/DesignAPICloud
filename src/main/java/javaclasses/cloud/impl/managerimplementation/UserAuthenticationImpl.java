package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.UserAuthentication;
import javaclasses.cloud.impl.SecurityToken;
import sun.security.krb5.Credentials;

import javax.security.sasl.AuthenticationException;

public class UserAuthenticationImpl implements UserAuthentication {
    @Override
    public SecurityToken authenticate(Credentials credentials) throws AuthenticationException {
        return null;
    }
}
