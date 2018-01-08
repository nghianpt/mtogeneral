package com.mto.common.entity.login;

import com.mto.common.entity.DBaseEntity;

/**
 * Created by NghiaNPT on 9/14/2017.
 */

public class SocialInfo extends DBaseEntity<SocialInfo> {
    public String sUserName;
    public String sUserID;
    public String sPw;
    public String sDisplayName;
    public String sSocialType;
    public String sOauthcode;
    public String sAccessToken;
    public String sIDToken;
    public String sGGServerAuthCode;
    public String sPhotoUrl;
}
