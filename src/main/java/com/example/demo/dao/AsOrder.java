package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "as_order")
public class AsOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "as_user_id")
    private Long asUserId;

    @Column(name = "order_num")
    private Long orderNum;

    private Long handler;

    private Long publisher;

    @Column(name = "product_info")
    private String productInfo;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "dispatch_time")
    private Date dispatchTime;

    @Column(name = "upload_time")
    private Date uploadTime;

    @Column(name = "end_time")
    private Date endTime;

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
     * @return as_user_id
     */
    public Long getAsUserId() {
        return asUserId;
    }

    /**
     * @param asUserId
     */
    public void setAsUserId(Long asUserId) {
        this.asUserId = asUserId;
    }

    /**
     * @return order_num
     */
    public Long getOrderNum() {
        return orderNum;
    }

    /**
     * @param orderNum
     */
    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * @return handler
     */
    public Long getHandler() {
        return handler;
    }

    /**
     * @param handler
     */
    public void setHandler(Long handler) {
        this.handler = handler;
    }

    /**
     * @return publisher
     */
    public Long getPublisher() {
        return publisher;
    }

    /**
     * @param publisher
     */
    public void setPublisher(Long publisher) {
        this.publisher = publisher;
    }

    /**
     * @return product_info
     */
    public String getProductInfo() {
        return productInfo;
    }

    /**
     * @param productInfo
     */
    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
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
     * @return file_url
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * @param fileUrl
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return dispatch_time
     */
    public Date getDispatchTime() {
        return dispatchTime;
    }

    /**
     * @param dispatchTime
     */
    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    /**
     * @return upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * @param uploadTime
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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