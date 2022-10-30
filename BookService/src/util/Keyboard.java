package util;

import java.util.Scanner;

public class Keyboard {

    /**
     * Auxiliary method to request a String to be entered through the keyboard.
     *
     * @param message = request
     * @return keyboard entered string
     */
    public static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    /**
     * Auxiliary method to request an Integer or int number to be entered through the keyboard.
     *
     * @param message = request
     * @return keyboard entered int number
     */
    public static Integer getInteger (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    /**
     * Auxiliary method to request a Double or double number to be entered through the keyboard.
     *
     * @param message = request
     * @return keyboard entered double number
     */
    public static Double getDouble (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }
}
