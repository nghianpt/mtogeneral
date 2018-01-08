package com.mto.nav;

import android.app.Activity;
import android.app.Application;

import com.mto.common.entity.py.GeneralPaymentInfo;
import com.mto.common.listener.VNGCallbackManager;
import com.mto.common.listener.login.SocialLoginCallback;
import com.mto.common.listener.payment.PyCallback;

/**
 * Created by LAP11100-local on 12/27/2017.
 */

public abstract class AbstractGeneralFeatures implements SDKFeaturesInterface {
    @Override
    public void init(Application application) {

    }

    @Override
    public void login(Activity activity, VNGCallbackManager vngCallbackManager, SocialLoginCallback pListener) {

    }

    @Override
    public void pay(Activity pOwner, GeneralPaymentInfo paymentinfo, PyCallback pListener) {

    }
}
