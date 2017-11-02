package com.company;

public class UserJaxBParser {

    public static void main(String[] args) {

        //UserTempParser us = new UserTempParser();
       // us.unmarshallList();
        UserManager user = new UserManager();
        User firstUser = user.getUser("firstUser");
        System.out.println(firstUser.toString());

    }

}
