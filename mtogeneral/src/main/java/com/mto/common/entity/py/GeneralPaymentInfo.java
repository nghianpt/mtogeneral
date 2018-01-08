package com.mto.common.entity.py;

import com.mto.common.entity.DBaseEntity;

/**
 * Created by cpu11843-local on 5/29/17.
 */

public class GeneralPaymentInfo extends DBaseEntity<GeneralPaymentInfo> {

    public String userID;
    public String serverID;
    public String itemID;
    public String appTransID;
    public String addInfo;
    public String amount;
    public String itemDisplayName;
    public String paymentGateway;
    public String currency;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getServerID() {
        return serverID;
    }

    public void setServerID(String serverID) {
        this.serverID = serverID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getAppTransID() {
        return appTransID;
    }

    public void setAppTransID(String appTransID) {
        this.appTransID = appTransID;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getItemDisplayName() {
        return itemDisplayName;
    }

    public void setItemDisplayName(String itemDisplayName) {
        this.itemDisplayName = itemDisplayName;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getwTransID() {
        return wTransID;
    }

    public void setwTransID(String wTransID) {
        this.wTransID = wTransID;
    }

    private String wTransID;

    public String getEmbeddedData() {
        return embeddedData;
    }

    public void setEmbeddedData(String embeddedData) {
        this.embeddedData = embeddedData;
    }

    private String embeddedData;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

}
