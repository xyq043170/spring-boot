package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_shoppingcart")
public class PShoppingcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "p_user_id")
    private Integer pUserId;

    @Column(name = "mall_id")
    private String mallId;

    @Column(name = "mall_num")
    private String mallNum;

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