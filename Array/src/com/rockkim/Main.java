package com.rockkim;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        // write your code here
//        //define an array
//        int[] myIntArray = new int[10];
//        // int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i;
//        }
//        printArray(myIntArray);
//    }
//        public static void printArray(int[] array) {
//            for(int i = 0; i<array.length; i++) {
//                System.out.println(array[i]);
//            }
//
//
        int[] myInt = getIntegers(5);
        for(int i = 0; i < myInt.length; i ++) {
            System.out.println(i + " typed, actual value " + myInt[i]);
        }
        System.out.println(addInts(myInt));
   }

   public static int[] getIntegers(int number) {
       System.out.println("Enter " + number + " numbers here.");
       int[] values = new int[number];
       for(int i = 0; i< values.length; i ++ ) {
           values[i] = scanner.nextInt();
       }
       return values;
   }

   public static double addInts(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i ++) {
            sum += array[i];
        }
        return (double) sum;
   }
}
