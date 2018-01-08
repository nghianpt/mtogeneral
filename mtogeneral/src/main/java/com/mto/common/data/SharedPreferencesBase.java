package com.mto.common.data;

import android.app.Activity;
import android.content.SharedPreferences;

import com.mto.common.data.base.SingletonBase;


public class SharedPreferencesBase extends SingletonBase {

    public static final String SHARE_PREFERENCES_NAME = "c8108c1cb47a24bc23b7c423375793a4"; //SDK_VNG_MTO_CONFIG
    private static SharedPreferencesBase mSharePreferencesManager = null;
    private SharedPreferences mCommonSharedPreferences = null;

    public SharedPreferencesBase() {
        super();
    }

    public static synchronized SharedPreferencesBase getInstance() {
        if (mSharePreferencesManager == null)
            mSharePreferencesManager = new SharedPreferencesBase();

        return mSharePreferencesManager;
    }

    private synchronized SharedPreferences getSharedPreferences(Activity activity) {
        if (activity == null) {
            return null;
        }

        if (mCommonSharedPreferences != null)
            return mCommonSharedPreferences;

        mCommonSharedPreferences = activity.getSharedPreferences(SHARE_PREFERENCES_NAME, 0);
        return mCommonSharedPreferences;
    }

    /**
     * Retrieve a String value from the preferences.
     *
     * @param pKey The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not a String.
     */
    public String getString(Activity activity, String pKey) {
        SharedPreferences sharedPreferences = getSharedPreferences(activity);

        if (sharedPreferences != null)
            return sharedPreferences.getString(pKey, null);

        return null;
    }

    public boolean setString(Activity activity, String pKey, String pValue) {
        SharedPreferences sharedPreferences = getSharedPreferences(activity);

        if (sharedPreferences != null) {
            return sharedPreferences.edit().putString(pKey, pValue).commit();
        }

        return false;
    }
}
