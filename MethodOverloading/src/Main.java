public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Ollie", 500);
        System.out.println("New highscore: " + newScore);
        //overloaded methods will ask you which one you want depending on parameters
        System.out.println(calculateScore(75));
        calculateScore();


        //Switch
        int value = 3;
        switch(value) {
                case 1:
                     System.out.println("value was 1");
                     break;
                case 2: case 3: case 4:
                    System.out.println("value was " + value);
                    break;
                default:
                    System.out.println("invalid");
                    break;
        }

        //day of week challenge
        int day = 1;
        String[] weekDay = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        switch (day) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println("Day is " + weekDay[day]) ;
                break;
            default:
                System.out.println("Day is NOT VALID TRY AGAIN");
                break;
        }

        if(day == 1) {
            System.out.println("Day is Mon");
        } else if ( day == 2) {
            System.out.println("Day is Tue");
        } else if ( day == 3) {
            System.out.println("Day is Wed");
        } else if ( day == 4) {
            System.out.println("Day is Thur");
        } else if ( day == 5) {
            System.out.println("Day is Fri");
        } else if ( day == 6) {
            System.out.println("Day is Sat");
        } else if ( day == 7) {
            System.out.println("Day is Sun");
        } else {
            System.out.println("What are you on about, thats not a day!!");
        }
        
        calcFeetAndInchesToCentimeters(10, 18);
        calcFeetAndInchesToCentimeters(65);

    }

    //METHOD OVERLOADING
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored: " + score + " points!");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unanmed Player Scored: " + score + " points!");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No Player Score ");
        return 0;
    }
    //Start
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 && inches > 12)) {
            return -1;
        } else {
            double ftToCm = feet * 30.48;
            double inToCm = inches * 2.54;
            double total = ftToCm + inToCm;
            System.out.println(feet + " feet, " + inches + " inches = " + total + "cm");
            return total;
        }
    } //End

    public static void calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0 && inches > 12) {
            System.out.println("Invalid value");
        } else {
            System.out.println("Inches in CM = " + inches * 2.54);
        }
    }//END OF METHOD OVERLOADING


}








