package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int [] Array = {5, 4, 3, 2, 1};

        int temp;
        System.out.println(Arrays.toString(Array));




            for (int j = 0; j < Array.length - 1; j++) {


                for (int i = 0; i < Array.length - 1 - j; i++) {
                    if (Array[i] > Array[i + 1]) {

                        temp = Array[i];
                        Array[i] = Array[i + 1];
                        Array[i + 1] = temp;
                    }

                }
            }
        System.out.println(Arrays.toString(Array));


    }
}




//    public static void main (String[] args) {
//
//        int [] Array = {11, 3, 14, 16, 7};
//       boolean isSorted = false;
//        int temp;
//        System.out.println(Arrays.toString(Array));
//
//
//
//
//        while (!isSorted) {
//          isSorted = true;
//
//            for (int i = 0; i < Array.length-1; i++) {
//                if (Array[i] > Array[i+1]) {
//                    isSorted = false;
//                     temp = Array[i];
//                    Array[i] = Array[i + 1];
//                    Array[i + 1] = temp;
//                }
//             //   System.out.println(Array[i]);
//            }
//        }
//        System.out.println(Arrays.toString(Array));
//
//
//    }
//}
