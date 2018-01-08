package com.mto.common.data;

import android.app.Activity;

/**
 * Created by cpu11843-local on 3/22/17.
 */

public class GlobalData {
    private static Activity mActivity = null;
    /***
     * getStringResource()
     * @param pResourceID
     * @return
     */
    public static String getStringResource(Activity activity,String pResourceID) {
        if (activity == null)
            return null;

        // IF WE HAVE BUNDLE
        // Try to get string from resource sent from before get from local
        String result = ResourceBase.getInstance(activity).getString(pResourceID);

        return (result != null) ? result : null;
    }
    public static String getStringResource(Activity activity,String pResourceID, String text) {
        if (activity == null)
            return null;

        // IF WE HAVE BUNDLE
        // Try to get string from resource sent from before get from local
        String result = ResourceBase.getInstance(activity).getString(pResourceID);

        return (result != null) ? result : null;
    }
    /***
     * getStringResource()
     * @param pResourceID
     * @return
     */
    public static String getConfigResource(Activity activity, String pResourceID) {
        if (activity == null)
            return null;

        // IF WE HAVE BUNDLE
        // Try to get string from resource sent from before get from local
        String result = ResourceBase.getInstance(activity).getConfig(pResourceID);

        return (result != null) ? result : null;
    }

    /***
     * getActivityContext()
     * @return
     */
//    public static Context getActivityContext() {
//        if (mActivity == null)
//            return null;
//        return mActivity.getBaseContext();
//    }

}
