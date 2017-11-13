package com.company.Device;

import javax.xml.bind.JAXBContext;
import java.io.File;
import java.util.List;

public class Unmarshaller {

    List<Device> devicesList;

    public List<Device> unmarshallerDevices() {
        try {
            JAXBContext jc = JAXBContext.newInstance(DevicesList.class);
            javax.xml.bind.Unmarshaller um = jc.createUnmarshaller();
            DevicesList device = (DevicesList) um.unmarshal(new File("src\\divecesbase.xml"));
            devicesList = device.getDevicesList();
            System.out.println(devicesList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return devicesList;
    }
}

