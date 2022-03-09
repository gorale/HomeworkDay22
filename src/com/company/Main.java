package com.company;

import java.util.Scanner;


public class Main {






    /**
     * Task 01
     *
     * endlessly ask the
     * user for the input(nextLine()), try to convert the
     * input to the number
     * @return
     */
    public static String endlesslyAsk(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            try {
                int k = Integer.parseInt(str);
            }catch (NumberFormatException e){
                System.out.println("Enter only number");
                continue;
            }
            return str;
        }


    }

    public static void main(String[] args) {






//        System.out.println(endlesslyAsk());


    }
}
