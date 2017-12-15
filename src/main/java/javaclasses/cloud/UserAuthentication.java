package javaclasses.cloud;

import sun.security.krb5.Credentials;

import javax.security.sasl.AuthenticationException;

public interface UserAuthentication {

    SecurityToken authenticate(Credentials credentials) throws AuthenticationException;
}
