package com.mto.nav;

/**
 * Created by LAP11100-local on 12/21/2017.
 */

public class NavManager {

    private static NavManager navManager;

    public static NavManager getInstance() {
        if (navManager == null)
            navManager = new NavManager();
        return navManager;
    }
    public boolean isClass(String className) {
        try  {
            Class.forName(className);
            return true;
        }  catch (ClassNotFoundException e) {
            return false;
        }
    }

    public SDKFeaturesInterface specify(String whichClass) {
        try {
            Class clazz = Class.forName(whichClass);
            return (SDKFeaturesInterface) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
