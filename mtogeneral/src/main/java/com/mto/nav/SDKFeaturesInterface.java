package com.mto.nav;

import android.app.Activity;
import android.app.Application;

import com.mto.common.entity.py.GeneralPaymentInfo;
import com.mto.common.listener.VNGCallbackManager;
import com.mto.common.listener.login.SocialLoginCallback;
import com.mto.common.listener.payment.PyCallback;

/**
 * Created by LAP11100-local on 12/20/2017.
 */

public interface SDKFeaturesInterface {

    void init(Application application);
    void login(Activity activity, VNGCallbackManager vngCallbackManager,SocialLoginCallback pListener);
    void pay(Activity pOwner, GeneralPaymentInfo paymentinfo, PyCallback pListener);

}
