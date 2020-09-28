package task5;

import java.util.Scanner;

public class PrintEnum {

    public static void colorIs(int i)
    {
        if (Num.valueOf(i) == null)
            System.out.println("Choose another number");
        else
            System.out.print(Num.valueOf(i));
            switch (Num.valueOf(i))
            {
                case RED:
                    System.out.println(" is the end of the visible spectrum of light");
                    break;
                case GREEN:
                    System.out.println(" is the color between blue and yellow on the visible spectrum.");
                    break;
                case BLUE:
                    System.out.println(" is one of the three primary colours of pigments in painting and traditional colour theory");
                    break;
                default:
                    System.out.println("Your number color is a mixture of red, green and blue");
                    break;
            }
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner( System.in );
        int i = in.nextInt();
        colorIs(i);
    }
} 