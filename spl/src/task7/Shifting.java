package task7;

public class Shifting {

    public static void main(String[] args) {
        int a = -57;
        int b = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Сдвинем влево: " + a + " на " + Math.pow(2,b));
            int c = a << b;
            System.out.println("\tЧисло " + c + " в 16 СС: " + Integer.toString(c, 16));
            a = c;
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Сдвинем влево: " + a + " на " + Math.pow(2,b));
            int c = a >> b;
            System.out.println("\tЧисло " + c + " в 16 СС: " + Integer.toString(c, 16));
            a = c;
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Сдвинем влево: " + a + " на " + Math.pow(2,b));
            int c = a >>> b;
            System.out.println("\tЧисло " + c + " в 16 СС: " + Integer.toBinaryString(c));
            System.out.println("\tЧисло " + c + " в 16 СС: " + Integer.toString(c, 16));
            a = c;
        }
    }
}
