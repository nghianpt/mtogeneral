package com.mto.common.listener.payment;

import com.mto.common.entity.py.GeneralPaymentResult;

/**
 * Created by cpu11843-local on 4/21/17.
 */

public interface PyCallback {

    /**
     * This method will be invoke when user completes the Pt
     *
     * @param pPtResult
     *  The entity held all the information about this transaction
     */
    public void onComplete(GeneralPaymentResult pPtResult);

    /**
     * This method will be invoke when user cancels the Pt
     */
    public void onCancel();

    public void onSMSCallBack(String appTransID);
}
