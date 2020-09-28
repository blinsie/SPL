package task6;

import java.util.Scanner;

public class Calc {

    public static final double SM_TO_IN = 2.54;
    public static final double G = 9.81;

    private static void sm_to_in() {
        Scanner sc = new Scanner(System.in);
        double i;
        double x;
        while (true) {
            System.out.print("Введите длину (0 exit) : ");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            } else if (sc.hasNextFloat()) {
                i = sc.nextDouble();
            } else {
                System.out.println("Введено неверное значение");
                break;
            }
            if (i == 0)
                break;
            System.out.print("Введите единицу измерения :");
            String e = sc.next();
            if (e.equals("in")) {
                x = i * SM_TO_IN;
                System.out.printf("%.2f in = %.2f sm\n", i, x);
            } else if (e.equals("sm")) {
                x = i / SM_TO_IN;
                System.out.printf("%.2f sm = %.2f in\n", i, x);

            } else {
                System.out.println("Ошибка единицы измерения in или sm");
            }
        }
    }

    private static double falling_speed() {
        Scanner sc = new Scanner(System.in);
        double h = 0;
        while (true) {
            System.out.print("Введите высоту в метрах (0 exit) : ");
            if (sc.hasNextInt()) {
                h = sc.nextInt();
            } else if (sc.hasNextFloat()) {
                h = sc.nextDouble();
            } else {
                System.out.println("Введено неверное значение");
            }
            if (h <= 0)
                return 0;
            else
                return Math.sqrt(2*h/G);
        }
    }

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("1 - перевод из сантиметров в дюймы и наоборот;\n" +
                "2 - определение времени падения тела с некоторой высоты h без начальной скорости\n" +
                "0 - выход");
        if (text.hasNextInt()) {
            switch (text.nextInt()) {
                case 1:
                    sm_to_in();
                    break;
                case 2:
                    System.out.println(falling_speed());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Введено неверное значение");
            }
        } else {
            System.out.println("Введено неверное значение");
        }
    }
}
