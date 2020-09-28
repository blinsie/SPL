package task9;

public class Set {
    public static void main(String[] args) {
        int i = 1;
        int mult = 1;
        while(mult < 10000) {
            System.out.print(i + " ");
            i += 2;
            mult *= i;
        }
    }
}
