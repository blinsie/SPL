package task1;

public class Types {

    int test;

    static private void printPrimitive() {
        byte b;
        short dig;
        char symbol;
        int digit;
        long long_digit;
        float float_digit;
        double double_digit;
        boolean flag;
//        System.out.println(b);
//        System.out.println(dig);
//        System.out.println(symbol);
//        System.out.println(digit);
//        System.out.println(long_digit);
//        System.out.println(float_digit);
//        System.out.println(double_digit);
//        System.out.println(flag);

    }

    static private void printInitPrimitive() {
        byte b = 0;
        short dig = 0;
        char symbol = '0';
        int digit = 0;
        long long_digit = 0;
        float float_digit = 0;
        double double_digit = 0;
        boolean flag = false;
        System.out.printf("%d%n", b);
        System.out.printf("%d%n", dig);
        System.out.printf("%s%n", symbol);
        System.out.printf("%d%n", digit);
        System.out.printf("%d%n", long_digit);
        System.out.printf("%f%n", float_digit);
        System.out.printf("%f%n", double_digit);
        System.out.printf("%b%n", flag);

    }

    static private void printInitCountPrimitive() {
        byte b = 0 + 1;
        short dig = 0 + 1;
        char symbol = '0' * 2;
        int digit = 0 + 155;
        long long_digit = 0 - 21;
        float float_digit = 0 + 2;
        double double_digit = 0 + 6.4;
        boolean flag = false && true;
        System.out.println(Integer.parseInt(String.valueOf(b), 16));
        System.out.println(Integer.parseInt(String.valueOf(dig), 16));
        System.out.println(symbol);
        System.out.println(Integer.parseInt(String.valueOf(digit), 16));
        System.out.println(Integer.parseInt(String.valueOf(long_digit), 16));
        System.out.println(float_digit);
        System.out.println(double_digit);
        System.out.println(flag);
    }

    public static void main(String[] args) {
        System.out.println("Calling printPrimitive()...");
        printPrimitive();
        System.out.println("\nCalling printInitPrimitive()...");
        printInitPrimitive();
        System.out.println("\nCalling printInitCountPrimitive()...");
        printInitCountPrimitive();
        System.out.println("\nCalling Types field");
        System.out.println(new Types().test);

    }

}
