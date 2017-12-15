package javaclasses.cloud;

public interface UserAuthorization {
    UserVO authorize(UserVO userVO) throws AuthorizationException;
}
