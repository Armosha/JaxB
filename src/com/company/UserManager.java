package com.company;


import java.util.List;



public class UserManager {

    UserTempParser parser = new UserTempParser();
    List<User> usersList = parser.unmarshallList();

    public User getUser(String userId) {

        User user = new User();

        for (User u : usersList) {
            if (u.getUserId().equals(userId)) {
                user = u;
            }
        }
        return user;
    }
}
