package javaclasses.cloud.impl.valueobject;

import javaclasses.cloud.impl.tinytype.UserId;

public class UserVO {
    private UserId id;
    private String loginName;
    private String password;

    public UserVO(UserId id, String loginName, String password) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
    }

    public UserId getId() {
        return id;
    }

    public void setId(UserId id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
