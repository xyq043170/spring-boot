package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "as_remotedata")
public class AsRemotedata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "battry_num")
    private Integer battryNum;

    private Integer voltage;

    private Integer current;

    private Integer soc;

    private Integer soh;

    private Integer temp;

    @Column(name = "save_time")
    private Date saveTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return battry_num
     */
    public Integer getBattryNum() {
        return battryNum;
    }

    /**
     * @param battryNum
     */
    public void setBattryNum(Integer battryNum) {
        this.battryNum = battryNum;
    }

    /**
     * @return voltage
     */
    public Integer getVoltage() {
        return voltage;
    }

    /**
     * @param voltage
     */
    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    /**
     * @param current
     */
    public void setCurrent(Integer current) {
        this.current = current;
    }

    /**
     * @return soc
     */
    public Integer getSoc() {
        return soc;
    }

    /**
     * @param soc
     */
    public void setSoc(Integer soc) {
        this.soc = soc;
    }

    /**
     * @return soh
     */
    public Integer getSoh() {
        return soh;
    }

    /**
     * @param soh
     */
    public void setSoh(Integer soh) {
        this.soh = soh;
    }

    /**
     * @return temp
     */
    public Integer getTemp() {
        return temp;
    }

    /**
     * @param temp
     */
    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    /**
     * @return save_time
     */
    public Date getSaveTime() {
        return saveTime;
    }

    /**
     * @param saveTime
     */
    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }
}