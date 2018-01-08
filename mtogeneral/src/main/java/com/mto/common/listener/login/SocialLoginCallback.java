package com.mto.common.listener.login;


import com.mto.common.entity.login.SocialInfo;
import com.mto.common.errormng.VngException;
import com.mto.common.listener.ZAbstractListener;

/**
 * Created by NghiaNPT on 3/22/17.
 */

public interface SocialLoginCallback extends ZAbstractListener {
    void onSuccess(SocialInfo data);
    void onFailure(VngException error);
    void onCancel();
}
