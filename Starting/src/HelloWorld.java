public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World! My Name is Rock, Im learning JAVA");

        //DATA TYPES//

        //INT
        int age = 27;
        int birthMonth = 05;
        int birthYear = 1991;
        int birthDay = 27;


        int minIntValue = -2147483648;
        int maxIntValue = 2147483647;

        //can also type S O U T in intellij and it will print out
        System.out.println("My birthdate: " + birthMonth + "/" + birthDay + "/" + birthYear);

        //BYTE
        byte minByteValue = -128;
        byte maxByteValue =  127;
        byte newByteValue = (byte) (maxByteValue/2);
        System.out.println(newByteValue);


        //SHORT
        short minShortValue = -32768;
        short maxShortValue = 32767;
        short newShortValue = (short) (maxShortValue/2);
        System.out.println(newShortValue);

        //LONG
        long minLongValue = -9223372036854775808L;
        long maxLongValue = 9223372036854775807L;

        //FLOAT - decimal point numbers, single precision has 7 digits after decimal
        float myFloatValue = 5.4f;
        System.out.println(myFloatValue);

        //DOUBLE - double precision has 16 digits after decimal
        double myDoubleValue = 5d;
        System.out.println(myDoubleValue);

        //Combine float and double
        System.out.println(myFloatValue + myDoubleValue);

        //NUMBER CHALLENGE
        int challangeInt  = 50;
        byte challengeByte = 50;
        short challengeShort = 50;
        long challengeOne = 50000L + 10L * (challengeByte + challengeShort + challangeInt);
        System.out.println(challengeOne);

        //CONVERT LBS to Kilograms
        float pounds = 18f;
        double kilograms = 0.45359237d;
        System.out.println("Kilogram to Pounds " + pounds / kilograms);
        System.out.println("Pounds to Kilograms " + pounds * kilograms);

        //CHAR
        char myChar = '\u00AE';
        System.out.println(myChar);

        //BOOLEAN - only true or false
        boolean isHuman = false;
        if(isHuman == true) {
            System.out.println("Wow youre human!!");
        } else {
            System.out.println("Not human!");
        }

        //STRING
        String myString = ("This is a string");
        System.out.println(myString);

        //OPERATORS
        /*
        * operators include +,\, - , *, %, >, <, >=, !<, ! etc...
        *
        * */
    }
}
