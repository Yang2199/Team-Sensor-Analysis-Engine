package team.ustc.sensor.entity;


/**
 * 传感器实体类
 *
 * @auther wang
 */
public class Sensor {
    private String sensorID;
    private String sensorCompany;
    private int sensorType;

    public String getSensorID() {
        return sensorID;
    }

    public String getSensorCompany() {
        return sensorCompany;
    }

    public void setSensorCompany(String sensorCompany) {
        this.sensorCompany = sensorCompany;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }
    public int getSensorType() {
        return sensorType;
    }

    public void setSensorType(int sensorType) {
        this.sensorType = sensorType;
    }

}
