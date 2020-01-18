package com.company;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int [] Array = {5, 4, 3, 2, 1};
        int z = 2;
        int temp;
        int operations = 0;


            for (int i = 0; i < Array.length; i++) {
                operations++;
                if (Array[i] == z) {

                    System.out.println(Array[i]);
                    break;

                }

            }

        long timeSpent = System.currentTimeMillis() - startTime;

        System.out.println("программа выполнялась " + operations + " действия");
        System.out.println("программа выполнялась " + (float)timeSpent/1000 + " секунд");



    }
}
