package com.rockkim;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntVal = 10;
        int anotherIntVal = myIntVal;

        System.out.println("my int val = " + myIntVal);
        System.out.println("anotherIntVal = " + anotherIntVal);

        anotherIntVal ++;

        System.out.println("my int val = " + myIntVal);
        System.out.println("anotherIntVal = " + anotherIntVal);

        //arrays and strings references
        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("myInt = " + Arrays.toString(myArray));
        System.out.println("my anotherInt = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myInt = " + Arrays.toString(myArray));
        System.out.println("my anotherInt = " + Arrays.toString(anotherArray));

        modifyArray(anotherArray);

        System.out.println("myInt = " + Arrays.toString(myArray));
        System.out.println("my anotherInt = " + Arrays.toString(anotherArray));

        //dereference - otherwise it will call from memory of the one array
        anotherArray = new int[] {4,5,6,7,8};

        System.out.println("myInt = " + Arrays.toString(myArray));
        System.out.println("my anotherInt = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
