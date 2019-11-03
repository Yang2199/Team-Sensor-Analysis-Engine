package team.ustc.sensor.entity;


/**
 * 传感器实体类
 *
 * @auther wang
 */
public class Censor {
    private String censorID;
    private String censorCompany;
    private int censorType;

    public String getCensorID() {
        return censorID;
    }

    public String getCensorCompany() {
        return censorCompany;
    }

    public void setCensorCompany(String censorCompany) {
        this.censorCompany = censorCompany;
    }

    public void setCensorID(String censorID) {
        this.censorID = censorID;
    }
    public int getCensorType() {
        return censorType;
    }

    public void setCensorType(int censorType) {
        this.censorType = censorType;
    }

}
