package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_address_info")
public class PAddressInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "p_user_id")
    private Integer pUserId;

    @Column(name = "address_type")
    private Integer addressType;

    private String recipients;

    private String province;

    private String city;

    private String district;

    private Integer postcode;

    private Long phone;

    @Column(name = "save_time")
    private Date saveTime;

    @Column(name = "address_info")
    private String addressInfo;

    private String local;

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
     * @return p_user_id
     */
    public Integer getpUserId() {
        return pUserId;
    }

    /**
     * @param pUserId
     */
    public void setpUserId(Integer pUserId) {
        this.pUserId = pUserId;
    }

    /**
     * @return address_type
     */
    public Integer getAddressType() {
        return addressType;
    }

    /**
     * @param addressType
     */
    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    /**
     * @return recipients
     */
    public String getRecipients() {
        return recipients;
    }

    /**
     * @param recipients
     */
    public void setRecipients(String recipients) {
        this.recipients = recipients;
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
     * @return postcode
     */
    public Integer getPostcode() {
        return postcode;
    }

    /**
     * @param postcode
     */
    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
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
     * @return address_info
     */
    public String getAddressInfo() {
        return addressInfo;
    }

    /**
     * @param addressInfo
     */
    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
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
}