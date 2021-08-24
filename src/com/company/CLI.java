package com.company;

import java.util.Scanner;

public class CLI {

    private static Scanner input = new Scanner(System.in);

    public static int getNum(int min, int max) {
        //System.out.println("Please enter a number.");
        int num;
        while (true)
            try {
                num = Integer.parseInt(input.nextLine());
                if (num > max || num < min){
                    System.out.println("Enter a number between " + min + "-" + max);
                }else {
                    break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Enter a number between " + min + "-" + max);
            }
        return num;
    }

    public static String getStr() {
        String userStr = input.nextLine();
        return userStr;
    }

    public static float getFloat() {
        float f = input.nextFloat();
        return f;
    }

}
