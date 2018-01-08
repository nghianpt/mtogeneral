package com.mto.common.entity.py;

import com.google.gson.Gson;
import com.mto.common.entity.DBaseEntity;

/**
 * Created by LAP11100-local on 12/27/2017.
 */

public class GeneralPaymentResult extends DBaseEntity<GeneralPaymentResult> {


    private String channelID;
    private String channelDetail;
    private String amount;
    private String itemID;

    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    public String getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(String channelDetail) {
        this.channelDetail = channelDetail;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public static GeneralPaymentResult fromJson(String pJson) {
        return (new Gson()).fromJson(pJson, GeneralPaymentResult.class);
    }
}
