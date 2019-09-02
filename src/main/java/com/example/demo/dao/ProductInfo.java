package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_info")
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "param_id")
    private Integer paramId;

    @Column(name = "sub_id")
    private Integer subId;

    private String info;

    private String remarks;

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
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return param_id
     */
    public Integer getParamId() {
        return paramId;
    }

    /**
     * @param paramId
     */
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    /**
     * @return sub_id
     */
    public Integer getSubId() {
        return subId;
    }

    /**
     * @param subId
     */
    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
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
}