package com.example.demo.dao;

import java.util.Date;
import javax.persistence.*;

@Table(name = "p_mall")
public class PMall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Integer productPrice;

    @Column(name = "dealer_price")
    private Integer dealerPrice;

    @Column(name = "service_price")
    private Integer servicePrice;

    private Integer follow;

    private Integer sales;

    private Integer brand;

    @Column(name = "product_use")
    private Integer productUse;

    private Integer material;

    private Integer capacity;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_url2")
    private String imageUrl2;

    @Column(name = "image_url3")
    private String imageUrl3;

    @Column(name = "image_url4")
    private String imageUrl4;

    private String remarks;

    @Column(name = "use_status")
    private Integer useStatus;

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
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return product_price
     */
    public Integer getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return dealer_price
     */
    public Integer getDealerPrice() {
        return dealerPrice;
    }

    /**
     * @param dealerPrice
     */
    public void setDealerPrice(Integer dealerPrice) {
        this.dealerPrice = dealerPrice;
    }

    /**
     * @return service_price
     */
    public Integer getServicePrice() {
        return servicePrice;
    }

    /**
     * @param servicePrice
     */
    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }

    /**
     * @return follow
     */
    public Integer getFollow() {
        return follow;
    }

    /**
     * @param follow
     */
    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    /**
     * @return sales
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * @param sales
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * @return brand
     */
    public Integer getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    /**
     * @return product_use
     */
    public Integer getProductUse() {
        return productUse;
    }

    /**
     * @param productUse
     */
    public void setProductUse(Integer productUse) {
        this.productUse = productUse;
    }

    /**
     * @return material
     */
    public Integer getMaterial() {
        return material;
    }

    /**
     * @param material
     */
    public void setMaterial(Integer material) {
        this.material = material;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return image_url2
     */
    public String getImageUrl2() {
        return imageUrl2;
    }

    /**
     * @param imageUrl2
     */
    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    /**
     * @return image_url3
     */
    public String getImageUrl3() {
        return imageUrl3;
    }

    /**
     * @param imageUrl3
     */
    public void setImageUrl3(String imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }

    /**
     * @return image_url4
     */
    public String getImageUrl4() {
        return imageUrl4;
    }

    /**
     * @param imageUrl4
     */
    public void setImageUrl4(String imageUrl4) {
        this.imageUrl4 = imageUrl4;
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