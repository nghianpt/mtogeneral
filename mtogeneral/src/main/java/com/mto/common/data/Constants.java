package com.mto.common.data;


/**
 * Created by cpu11843-local on 3/20/17.
 */

public class Constants {
    // @formatter:off
    public static final boolean IS_RELEASE = false;
    public static final boolean IS_DEV = (!IS_RELEASE);
    public static final boolean IS_SWITCHABLE = (!IS_RELEASE);
    public static final String PLATFORM = "android";
    public static final String GENERAL_SKK_VERSION = "1.0.0";

    public static final String ENVIROMENT_KEY="mto_sdk_android_enviroment_key";
    public static final String PRODUCTION_ENV="mto_sdk_android_production_env";
    public static final String DEVELOPMENT_ENV="mto_sdk_android_development_env";


    //log
    public static final String THIRD_PARTY_SDK = "ThirdPartySDK";

    // init id string for load file VNGConfiguration.json
    public static final String z_gameID = "z_gameID";
    public static final String z_paymentID = "z_paymentID";
    public static final String z_paymentKey = "z_paymentKey";
    public static final String z_walletKey = "z_walletKey";
    public static final String z_zaloID = "z_zaloID";
    public static final String z_zaloKey = "z_zaloKey";
    public static final String z_fbID = "z_fbID";
    public static final String z_ggID = "z_ggID";



}