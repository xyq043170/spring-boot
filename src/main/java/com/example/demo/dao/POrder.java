package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_order")
public class POrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_number")
    private Long orderNumber;

    private Integer handler;

    private Integer allocator;

    @Column(name = "p_user_id")
    private Integer pUserId;

    @Column(name = "mall_id")
    private String mallId;

    @Column(name = "mall_num")
    private String mallNum;

    @Column(name = "address_info")
    private String addressInfo;

    private String recipients;

    private Integer postcode;

    private Long phone;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "process_status")
    private Integer processStatus;

    @Column(name = "order_total")
    private Integer orderTotal;

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
     * @return order_number
     */
    public Long getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber
     */
    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @return handler
     */
    public Integer getHandler() {
        return handler;
    }

    /**
     * @param handler
     */
    public void setHandler(Integer handler) {
        this.handler = handler;
    }

    /**
     * @return allocator
     */
    public Integer getAllocator() {
        return allocator;
    }

    /**
     * @param allocator
     */
    public void setAllocator(Integer allocator) {
        this.allocator = allocator;
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
     * @return mall_id
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * @param mallId
     */
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    /**
     * @return mall_num
     */
    public String getMallNum() {
        return mallNum;
    }

    /**
     * @param mallNum
     */
    public void setMallNum(String mallNum) {
        this.mallNum = mallNum;
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
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return process_status
     */
    public Integer getProcessStatus() {
        return processStatus;
    }

    /**
     * @param processStatus
     */
    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    /**
     * @return order_total
     */
    public Integer getOrderTotal() {
        return orderTotal;
    }

    /**
     * @param orderTotal
     */
    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
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