package com.company;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
public class UsersList {

    private List<User> usersList;

    @XmlElement(name = "user")
    public List<User> getListUsers() {
        return usersList;
    }

    public void setListUsers(List<User> listUsers) {
        this.usersList = listUsers;
    }

    @Override
    public String toString() {
        return "UsersList{" +
                "usersList=" + usersList +
                '}';
    }
}
