package javaclasses.cloud;

import javaclasses.cloud.impl.SecurityToken;
import sun.security.krb5.Credentials;

import javax.security.sasl.AuthenticationException;

public interface UserAuthentication {

    SecurityToken authenticate(Credentials credentials) throws AuthenticationException;
}
