package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;


public class UserTempParser {

    List<User> usersList;

    public List<User> unmarshallList() {

        try {
            JAXBContext jc = JAXBContext.newInstance(UsersList.class);
            Unmarshaller um = jc.createUnmarshaller();
            UsersList user = (UsersList) um.unmarshal(new File("src\\usersbase.xml"));
            usersList = user.getListUsers();
            //System.out.println(usersList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usersList;
    }
}