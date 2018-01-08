package com.mto.common.errormng;

/**
 * Created by NghiaNPT on 8/6/2017.
 */

/**
 * Represents an error condition specific to the MTO SDK for Android.
 */
public class VngException extends RuntimeException {
    static final long serialVersionUID = 1;

    /**
     * Constructs a new FacebookException.
     */
    public VngException() {
        super();
    }

    /**
     * Constructs a new FacebookException.
     *
     * @param message the detail message of this exception
     */
    public VngException(String message) {
        super(message);
    }

    /**
     * Constructs a new FacebookException.
     *
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args   the list of arguments passed to the formatter.
     */
    public VngException(String format, Object... args) {
        this(String.format(format, args));
    }

    /**
     * Constructs a new FacebookException.
     *
     * @param message   the detail message of this exception
     * @param throwable the cause of this exception
     */
    public VngException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * Constructs a new FacebookException.
     *
     * @param throwable the cause of this exception
     */
    public VngException(Throwable throwable) {
        super(throwable);
    }

    @Override
    public String toString() {
        // Throwable.toString() returns "FacebookException:{message}". Returning just "{message}"
        // should be fine here.
        return getMessage();
    }
}
