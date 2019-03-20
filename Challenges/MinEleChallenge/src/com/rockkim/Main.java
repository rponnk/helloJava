package com.rockkim;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public ArrayList<String> grocerList = new ArrayList<String>();


        int[] myArray = new int[]{10,2,3,4,5,6,7};

        findMin(myArray);
    }

    public static void readIntegers(int count) {
        System.out.println(count);
    }



    public static void findMin(int[] array) {
        int minVal = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minVal) {
                minVal = array[i];
                System.out.println("the minimum number is..." + minVal);
            }
        }
    }
}
