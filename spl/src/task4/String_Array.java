package task4;

import java.util.Arrays;

public class String_Array {

    public static void main(String[] args) {
        String[]arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        System.out.println(Arrays.toString(arrayStr));
        Arrays.stream(arrayStr).forEach(System.out::println);

        int[]arrayInt = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arrayInt));
        Arrays.stream(arrayInt).forEach(System.out::println);
    }
}
