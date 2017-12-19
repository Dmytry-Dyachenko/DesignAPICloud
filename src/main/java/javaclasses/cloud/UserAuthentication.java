package javaclasses.cloud;

import javaclasses.cloud.impl.Credentials;
import javaclasses.cloud.impl.SecurityToken;

import javax.security.sasl.AuthenticationException;

/**
 * API for identify the user.
 */
public interface UserAuthentication {
    /**
     * Identification the user before given access.
     *
     * @param credentials for authentication.
     * @return the security token for using by user on the cloud.
     * @throws AuthenticationException when data isn’t valid for authentication.
     */
    SecurityToken authenticate(Credentials credentials) throws AuthenticationException;
}
