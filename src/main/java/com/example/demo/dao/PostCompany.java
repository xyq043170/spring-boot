package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "post_company")
public class PostCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "post_value")
    private Integer postValue;

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
     * @return post_name
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * @return post_value
     */
    public Integer getPostValue() {
        return postValue;
    }

    /**
     * @param postValue
     */
    public void setPostValue(Integer postValue) {
        this.postValue = postValue;
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