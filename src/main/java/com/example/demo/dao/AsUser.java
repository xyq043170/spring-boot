package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "as_user")
public class AsUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "role_id")
    private Integer roleId;

    private String password;

    @Column(name = "franchisee_name")
    private String franchiseeName;

    private String industry;

    @Column(name = "age_limit")
    private Integer ageLimit;

    private String address;

    private String province;

    private String city;

    private String district;

    private String local;

    private Integer numbers;

    private String contacts;

    private Long phone;

    private String email;

    @Column(name = "use_status")
    private Integer useStatus;

    @Column(name = "save_time")
    private Date saveTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return franchisee_name
     */
    public String getFranchiseeName() {
        return franchiseeName;
    }

    /**
     * @param franchiseeName
     */
    public void setFranchiseeName(String franchiseeName) {
        this.franchiseeName = franchiseeName;
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

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local
     */
    public void setLocal(String local) {
        this.local = local;
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
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return use_status
     */
    public Integer getUseStatus() {
        return useStatus;
    }

    /**
     * @param useStatus
     */
    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
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