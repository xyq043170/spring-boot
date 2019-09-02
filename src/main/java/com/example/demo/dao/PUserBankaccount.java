package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "p_user_bankaccount")
public class PUserBankaccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "bank_account_name")
    private String bankAccountName;

    private BigDecimal balance;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return bank_account
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * @param bankAccount
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * @return bank_account_name
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * @param bankAccountName
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    /**
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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