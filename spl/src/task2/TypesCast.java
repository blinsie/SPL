package task2;

public class TypesCast {

    public static void main(String[] args) {
        byte b = 120;
        short sh = b;
        int dig = sh;
        long lng = dig;
        System.out.println("lnd = " + lng);
        float f = dig;
        double d = lng;
        System.out.println("f = " + f + " and d = " + d);
        d = dig;
        f = lng;
        System.out.println("f = " + f + " and d = " + d);

        d = 14.9283;
        f = (float) d;
        dig = (int) f;
        System.out.println("f = " + f + " and dig = " + dig);
    }

}
