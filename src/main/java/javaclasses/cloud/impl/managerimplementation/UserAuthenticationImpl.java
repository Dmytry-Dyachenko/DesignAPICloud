package javaclasses.cloud.impl.managerimplementation;

import javaclasses.cloud.UserAuthentication;
import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;

import javax.security.sasl.AuthenticationException;

public class UserAuthenticationImpl implements UserAuthentication {
    @Override
    public SecurityToken authenticate(Credentials credentials) throws AuthenticationException {
        return null;
    }
}
