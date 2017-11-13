package com.company;

import com.company.Device.Unmarshaller;

public class UserJaxBParser {


    public static void main(String[] args) {
       /* User secondUser;
        UserTempParser us = new UserTempParser();
        us.unmarshallList();
        UserManager userManager = new UserManager();
        secondUser = new User();
        secondUser = userManager.getUser("secondUser");
         System.out.println(secondUser.toString());*/

        Unmarshaller unm = new Unmarshaller();
        unm.unmarshallerDevices();

    }

}
