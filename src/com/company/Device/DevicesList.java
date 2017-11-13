package com.company.Device;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "devices")
public class DevicesList {

    private List<Device> devicesList;

    @XmlElement(name = "device")
    public List<Device> getDevicesList() {
        return devicesList;
    }

    public void setDevicesList(List<Device> devicesList) {
        this.devicesList = devicesList;
    }

    @Override
    public String toString() {
        return "DevicesList{" +
                "devicesList=" + devicesList +
                '}';
    }
}