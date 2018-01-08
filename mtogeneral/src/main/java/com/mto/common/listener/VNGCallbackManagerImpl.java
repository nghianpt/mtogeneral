package com.mto.common.listener;

/**
 * Created by NghiaNPT on 8/6/2017.
 */


import android.content.Intent;

import java.util.HashMap;
import java.util.Map;

public final class VNGCallbackManagerImpl implements com.mto.common.listener.VNGCallbackManager {
    private static Map<Integer, Callback> staticCallbacks = new HashMap<>();
    private static int callbackRequestCodeOffset = 0xface;
    /**
     * If there is no explicit callback, but we still need to call the MTO component,
     * because it's going to update some state, e.g., login, like. Then we should register a
     * static callback that can still handle the response.
     * @param requestCode The request code.
     * @param callback The callback for the feature.
     */
    public synchronized static void registerStaticCallback(
            int requestCode,
            Callback callback) {
        com.mto.common.utils.Validate.notNull(callback, "callback");
        if (staticCallbacks.containsKey(requestCode)) {
            return;
        }
        staticCallbacks.put(requestCode, callback);
    }

    private static synchronized Callback getStaticCallback(Integer requestCode) {
        return staticCallbacks.get(requestCode);
    }

    private static boolean runStaticCallback(
            int requestCode,
            int resultCode,
            Intent data) {
        Callback callback = getStaticCallback(requestCode);
        if (callback != null) {
            return callback.onActivityResult(requestCode,resultCode, data);
        }
        return false;
    }

    private Map<Integer, Callback> callbacks = new HashMap<>();

    public void registerCallback(int requestCode, Callback callback) {
       com.mto.common.utils.Validate.notNull(callback, "callback");
        callbacks.put(requestCode, callback);
    }

    @Override
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        Callback callback = callbacks.get(requestCode);
        if (callback != null) {
            return callback.onActivityResult(requestCode,resultCode, data);
        }
        return runStaticCallback(requestCode, resultCode, data);
    }

    public interface Callback {
        public boolean onActivityResult(int requestCode, int resultCode, Intent data);
    }

    //Should to define request code for each feature which detects the type of callback
    public enum RequestCodeOffset {
        Login(5),
        Payment(1),
        ZaloSocial(2),
        FBSocial(3),
        LineSocial(4),
        FBLogin(0),// Do not change this value, it must be matched with facebook sdk
        ZLLogin(6),
        GGLogin(7),
        ;

        private final int offset;

        RequestCodeOffset(int offset) {
            this.offset = offset;
        }

        public int toRequestCode() {
            return callbackRequestCodeOffset + offset;
        }
    }

    //
    public void handleCallback(int requestCode, int resultCode, Intent data)
    {
       onActivityResult(requestCode, resultCode, data);
    }
}