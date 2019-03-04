package com.rockkim;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
        System.out.println(descArray(myIntArray));
    }
    //create a method that allows you to input into the array
    public static int[] getIntegers(int number) {
        int[] val = new int[number];
        System.out.println("Enter numbers");
        for(int i = 0; i < val.length; i++) {
            //accept the inputs
            val[i] = scanner.nextInt();
        }
        return val;
    }
    //print array
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.println(i + " value, equals " + array[i]);
        }
    }

    //desc order of array
    public static int[] descArray(int[] number) {
        int[] val = new int[number.length];
        for(int i = 0; i < number.length; i++) {
            val[i] = number[i];

        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<val.length - 1; i++) {
                if(val[i] < val[i] + 1) {
                    temp = val[i];
                    val[i] = val[i+1];
                    val[i+1] = temp;
                    flag = true;
                }
            }
        }
        return val;
    }
}


//    public static void main(String[] args) {
////        // write your code here
////        //define an array
////        int[] myIntArray = new int[10];
////        // int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
////        for (int i = 0; i < myIntArray.length; i++) {
////            myIntArray[i] = i;
////        }
////        printArray(myIntArray);
////    }
////        public static void printArray(int[] array) {
////            for(int i = 0; i<array.length; i++) {
////                System.out.println(array[i]);
////            }
////
////
//        int[] myInt = getIntegers(5);
//        for(int i = 0; i < myInt.length; i ++) {
//            System.out.println(i + " typed, actual value " + myInt[i]);
//        }
//        System.out.println(addInts(myInt));
//    }
//
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " numbers here.");
//        int[] values = new int[number];
//        for(int i = 0; i< values.length; i ++ ) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static double addInts(int[] array) {
//        int sum = 0;
//        for(int i = 0; i < array.length; i ++) {
//            sum += array[i];
//        }
//        return (double) sum;
//    }
//}

