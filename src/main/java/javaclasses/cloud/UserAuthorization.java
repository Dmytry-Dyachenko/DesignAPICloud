package javaclasses.cloud;

import javaclasses.cloud.impl.SecurityToken;

public interface UserAuthorization {
    SecurityToken authorize(UserVO userVO) throws AuthorizationException;
}
