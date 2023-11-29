package ExceptionHandling;

public class User {
    public String password;
    String userName;
    String UserPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        UserPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
