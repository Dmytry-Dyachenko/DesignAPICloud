package javaclasses.cloud;

import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;

import javax.security.sasl.AuthenticationException;

public interface UserAuthentication {

    SecurityToken authenticate(Credentials credentials) throws AuthenticationException;
}
