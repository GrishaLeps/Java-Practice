package com.company;
public class Main {
    public static int binarySearch(int Array[], int number){
        long startTime = System.currentTimeMillis();
        int operations = 0;
        long timeSpent = System.currentTimeMillis() - startTime;
        int i = 0;
        int low = 0;
        int mid = 0;
        int result = -1;
        int high = Array.length - 1;
        while( low <= high ){
            operations++;
            mid = (low + high) / 2;
            if (Array[mid] == number) {
                System.out.println("программа выполнялась " + operations + " действия");
                System.out.println("программа выполнялась " + (float)timeSpent/1000 + " секунд");
                return mid;
            }
            if( Array[mid] < number ){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        System.out.println("программа выполнялась " + operations + " действия");
        System.out.println("программа выполнялась " + (float)timeSpent/1000 + " секунд");

        return -1;
    }
    public static void main(String[] args) {
        int [] Array = {8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 55, 66, 68, 85, 101, 110, 125, 179, 201, 356, 1000};
        int result = binarySearch(Array, 201);
        System.out.println(result);
    }
}