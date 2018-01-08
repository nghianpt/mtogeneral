package mto.com.common.errormng;

/**
 * Created by cpu11843-local on 3/20/17.
 */

public class ErrorCode {


    /*
     Error Code SDK Management Center
     Common: 1000 -> 2999
     Login/Logout: 2000 -> 3999
     Payment: 4000 -> 4999
     Facebook Social: 5000 -> 5999
     Zalo social: 6000 -> 6999
     LINE social: 7000 -> 7999
      */

    //Common error code
    public static final class Common {

        public static final int RESULTCODE_UNKNOW = 1000;
    }

    //Login error code
    public static final class Login {

        public static final int RESULTCODE_UNKNOW = 2000;
    }

    //Payment error code
    public static final class Payment {

        public static final int RESULTCODE_UNKNOW = 4000;
    }

    //Facebook error code
    public static final class Facebook {

        public static final int RESULTCODE_UNKNOW = 5000;
    }

    //Zalo error code
    public static final class Zalo {

        public static final int RESULTCODE_UNKNOW = 6000;
    }

    //Line error code
    public static final class Line {

        public static final int RESULTCODE_UNKNOW = 7000;
    }
}
