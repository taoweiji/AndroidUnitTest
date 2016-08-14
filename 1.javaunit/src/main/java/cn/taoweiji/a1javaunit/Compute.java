package cn.taoweiji.a1javaunit;

/**
 * Created by Wiki on 16/8/13.
 */
public class Compute {
    public static int add(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int ride(int arg0, int arg1) {
        return arg0 * arg1;
    }

    /*保留两位小数,不能四舍五入*/
//    public static String keep2Decimal(double arg0) {
//        return String.format("%.2f", arg0);
//    }

    public static String keep2Decimal(double arg0) {
        return String.format("%.2f", (int) (arg0 * 100) /100.0);
    }

}
