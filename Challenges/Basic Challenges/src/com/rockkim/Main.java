package com.rockkim;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        disHiScore("ollie", 4);
//        System.out.println(shouldWakeUp(true, -1));
//        System.out.println(hasTeen(11, 12, 13));
        System.out.println(sumDigits(10));

        //parsing string as an interger
        String numberAsString = "2018";
        System.out.println(numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println(number - 2);
        //end of parsing of string to int

    }

    //    public static void disHiScore(String name, int place) {
//        switch (place) {
//            case 1:
//                System.out.println("1st");
//                break;
//            case 2:
//                System.out.println("2nd");
//                break;
//            case 3:
//                System.out.println("3rd");
//                break;
//            default:
//                System.out.println(name + " got " + place + " place, no recognition");
//        }
//    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking == true) {
            if((hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <=23)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if(number >= 10) {
            for(int i = 10; i <= number; i++) {
                sum += i;
                System.out.println(i);
            }
            return sum;
        }
        return -1;
    }
}
