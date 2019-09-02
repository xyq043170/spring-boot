package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_joinus")
public class PJoinus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String proposer;

    private String industry;

    @Column(name = "age_limit")
    private Integer ageLimit;

    @Column(name = "site_scale")
    private String siteScale;

    private Integer numbers;

    private String contacts;

    private String sex;

    private Long phone;

    private String channels;

    private String remarks;

    @Column(name = "save_time")
    private Date saveTime;

    private String address;

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
     * @return proposer
     */
    public String getProposer() {
        return proposer;
    }

    /**
     * @param proposer
     */
    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * @return age_limit
     */
    public Integer getAgeLimit() {
        return ageLimit;
    }

    /**
     * @param ageLimit
     */
    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    /**
     * @return site_scale
     */
    public String getSiteScale() {
        return siteScale;
    }

    /**
     * @param siteScale
     */
    public void setSiteScale(String siteScale) {
        this.siteScale = siteScale;
    }

    /**
     * @return numbers
     */
    public Integer getNumbers() {
        return numbers;
    }

    /**
     * @param numbers
     */
    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    /**
     * @return contacts
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * @param contacts
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return phone
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * @return channels
     */
    public String getChannels() {
        return channels;
    }

    /**
     * @param channels
     */
    public void setChannels(String channels) {
        this.channels = channels;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}