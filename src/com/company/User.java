package com.company;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User {

    private String userId;
    private String login;
    private String password;

    public User() {
        super();
    }

    public User(String userId, String login, String password) {
        super();
        this.userId = userId;
        this.login = login;
        this.password = password;
    }

    @XmlElement
    public String getUserId() {
        return userId;
    }

    @XmlElement
    public String getLogin() {
        return login;
    }

    @XmlElement
    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (password != null && login != null && userId != null) {
            str = str.append("User userId is: " + userId)
                    .append("\n")
                    .append("User login is: " + login)
                    .append("\n")
                    .append("User password is: " + password);
        }
        return str.toString();
    }
}
