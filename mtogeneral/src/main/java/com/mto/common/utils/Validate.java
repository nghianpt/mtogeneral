package com.mto.common.utils;


import java.util.Collection;


/**
 * Created by cpu11843-local on 6/5/17.
 */

public class Validate implements com.mto.common.interfaces.IValidate {
    private static Validate validate;

    public static Validate getValidate() {
        if (validate == null)
            validate = new Validate();
        return validate;
    }

    // function

//    @Override
//    public boolean paymentInfo(PaymentInfo info, PaymentCallback listener) {
//        if (info != null && listener != null)
//            return true;
//        return false;
//    }
    public static void notNullOrEmpty(String arg, String name) {
        if (isNullOrEmpty(arg)) {
            throw new IllegalArgumentException("Argument '" + name + "' cannot be null or empty");
        }
    }
    public static void notNull(Object arg, String name) {
        if (arg == null) {
            throw new NullPointerException("Argument '" + name + "' cannot be null");
        }
    }

    private <T> boolean isNullOrEmpty(Collection<T> c) {
        return (c == null) || (c.size() == 0);
    }

   private static boolean isNullOrEmpty(String s) {
        return (s == null) || (s.length() == 0);
    }
}
