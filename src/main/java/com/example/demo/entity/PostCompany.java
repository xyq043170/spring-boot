package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post_company")
public class PostCompany implements Serializable{
	private static final long serialVersionUID = 2120869894112984147L;
	@Id
    @GeneratedValue
	private int id;
	@Column(nullable = false, name="post_name")
	private String postName;
	@Column(nullable = false, name="post_value")
	private int postValue;
	@Column(nullable = false, name="save_time")
	private Date saveTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public int getPostValue() {
		return postValue;
	}
	public void setPostValue(int postValue) {
		this.postValue = postValue;
	}
	public Date getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}
	
	
}
