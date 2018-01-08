/**
 * Copyright © 2015 by VNG Corporation
 * All rights reserved. No part of this publication may be reproduced, distributed,
 * or transmitted in any form or by any means, including photocopying, recording,
 * or other electronic or mechanical methods, without the prior written permission
 * of the publisher, except in the case of brief quotations embodied in critical reviews
 * and certain other noncommercial uses permitted by copyright law.
 * <p>
 * Project: ZingPaySDK
 * File: vn.zing.pay.zmpsdk.data.ResourceBase.java
 * Created date: Dec 21, 2015
 * Owner: YenNLH
 */
package com.mto.common.data;

import android.app.Activity;

import com.mto.common.data.base.SingletonBase;
import com.mto.common.data.config.DConfigFromFile;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author NghiaNPT
 */
public class ResourceBase extends SingletonBase {
    private static ResourceBase mResourceManager;
    private static DConfigFromFile mConfigFromFile;
    private final String CONFIG_FILE = "VNGConfiguration.json";

    /************************************************************************/
    /************************************************************************/
    protected ResourceBase(Activity activity) {
        super();
        // init resource
        initResource(activity);
    }

    public synchronized static ResourceBase getInstance(Activity activity) {
        if (mResourceManager == null)
            mResourceManager = new ResourceBase(activity);
        return mResourceManager;
    }

    /***
     * init resources
     */
    protected void initResource(Activity activity) {
        String json = loadJSONFromAsset(activity);
        mConfigFromFile = (new DConfigFromFile()).fromJsonString(json);
    }

    /***
     * load JSON
     * @return String json
     */
    protected String loadJSONFromAsset(Activity activity) {
        String json;
        try {
            InputStream is = activity.getAssets().open(CONFIG_FILE);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    /**
     * Get string value from map specified by server side. Only for common
     * resource.
     *
     * @param pKey The key of pair
     * @return String value
     */
    public String getConfig(String pKey) {
        if (mConfigFromFile.config != null) {
            return mConfigFromFile.config.get(pKey);
        }
        return null;
    }

    public String getString(String pKey) {
        if (mConfigFromFile.stringMap != null) {
            return mConfigFromFile.stringMap.get(pKey);
        }
        return null;
    }
}
