package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_shop_allot_order")
public class PShopAllotOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_number")
    private Long orderNumber;

    private Integer creator;

    private Integer allocator;

    private Integer handler;

    @Column(name = "process_status")
    private Integer processStatus;

    @Column(name = "creat_time")
    private Date creatTime;

    @Column(name = "allot_time")
    private Date allotTime;

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
     * @return creator
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
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
     * @return creat_time
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * @return allot_time
     */
    public Date getAllotTime() {
        return allotTime;
    }

    /**
     * @param allotTime
     */
    public void setAllotTime(Date allotTime) {
        this.allotTime = allotTime;
    }
}