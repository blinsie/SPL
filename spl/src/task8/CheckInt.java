package task8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInt {

    public static final String NUM_OF_FLOORS = "[1-9]";

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        if (text.hasNext()) {
            Pattern pattern = Pattern.compile(NUM_OF_FLOORS);
            System.out.println(pattern.matcher(text.next()).matches());
        } else {
            System.out.println("Введено неверное значение");
        }
    }
}
