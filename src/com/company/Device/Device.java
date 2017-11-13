package com.company.Device;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "device")
public class Device {
    private String deviceName;
    private Capabilities capabilities = new Capabilities();
    private Coordinates coordinates = new Coordinates();

    public Device() {
        super();
    }

    public Device(String deviceName, Capabilities capabilities, Coordinates coordinates) {
        super();
        this.deviceName = deviceName;
        this.capabilities = capabilities;
        this.coordinates = coordinates;
    }

    @XmlElement
    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    @XmlElement
    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @XmlAttribute
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (deviceName != null && !capabilities.toString().isEmpty() && !coordinates.toString().isEmpty()) {
            str = str.append("DeviceName is: " + deviceName)
                    .append("\n")
                    .append("Capabilities are: " + "\n" + capabilities.toString())
                    .append("\n")
                    .append("Coordinates are: " + "\n" + coordinates.toString())
                    .append("\n");
        }
        return str.toString();
    }


    @XmlRootElement(name = "capabilities")
    public static class Capabilities {
        private String udId;
        private String platformName;
        private String bundleId;
        private String automationName;

        public Capabilities() {
        }

        public Capabilities(String udId, String platformName, String bundleId, String automationName) {
            this.udId = udId;
            this.platformName = platformName;
            this.bundleId = bundleId;
            this.automationName = automationName;
        }

        @XmlElement
        public String getUdId() {
            return udId;
        }

        public void setUdId(String udId) {
            this.udId = udId;
        }

        @XmlElement
        public String getPlatformName() {
            return platformName;
        }

        public void setPlatformName(String platformName) {
            this.platformName = platformName;
        }

        @XmlElement
        public String getBundleId() {
            return bundleId;
        }

        public void setBundleId(String bundleId) {
            this.bundleId = bundleId;
        }

        @XmlElement
        public String getAutomationName() {
            return automationName;
        }

        public void setAutomationName(String automationName) {
            this.automationName = automationName;
        }

        @Override
        public String toString() {
            StringBuilder cap = new StringBuilder();
            if (udId != null && platformName != null && bundleId != null && automationName != null) {
                cap = cap.append("Device udId is: " + udId)
                        .append("\n")
                        .append("Device platformName is: " + platformName)
                        .append("\n")
                        .append("Device bundleId is: " + bundleId)
                        .append("\n")
                        .append("Device automationName is: " + automationName);
            }
            return cap.toString();
        }
    }

    @XmlRootElement(name = "coordinates")
    public static class Coordinates {
        private String sectionName;
        private int posX;
        private int posY;
        private String id;

        public Coordinates() {
        }

        public Coordinates(String sectionName, int posX, int posY, String id) {
            this.sectionName = sectionName;
            this.posX = posX;
            this.posY = posY;
        }

        @XmlElement
        public String getSectionName() {
            return sectionName;
        }

        public void setSectionName(String sectionName) {
            this.sectionName = sectionName;
        }

        @XmlElement
        public int getPosX() {
            return posX;
        }

        public void setPosX(int posX) {
            this.posX = posX;
        }

        @XmlElement
        public int getPosY() {
            return posY;
        }

        public void setPosY(int posY) {
            this.posY = posY;
        }

        @XmlAttribute
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {

            StringBuilder coord = new StringBuilder();
            if (sectionName != null) {
                // for (String a : sectionName) {
                coord = coord.append("Coordinates sectionName " + sectionName + " " + id + " is: " + " " + posX + " " + posY)
                        .append("\n");
                //a.toString();
                //System.out.println(a);
            }

            // }

            return coord.toString();
        }
    }
}