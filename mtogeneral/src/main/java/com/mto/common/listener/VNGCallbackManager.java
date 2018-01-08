package com.mto.common.listener;

import android.content.Intent;

/**
 * Created by NghiaNPT on 8/6/2017.
 */
/**
 * The CallbackManager manages the callbacks into the FacebookSdk from an Activity's or
 * Fragment's onActivityResult() method.
 */
public interface VNGCallbackManager {

    /**
     * The method that should be called from the Activity's or Fragment's onActivityResult method.
     * @param requestCode The request code that's received by the Activity or Fragment.
     * @param resultCode  The result code that's received by the Activity or Fragment.
     * @param data        The result data that's received by the Activity or Fragment.
     * @return true If the result could be handled.
     */
    public boolean onActivityResult(int requestCode, int resultCode, Intent data);

    /**
     * The factory class for the {@link VNGCallbackManager}.
     */
    public static class Factory {
        /**
         * Creates an instance of {@link VNGCallbackManager}.
         * @return an instance of {@link VNGCallbackManager}.
         */
        public static VNGCallbackManager create() {
            return new VNGCallbackManagerImpl();
        }
    }
}