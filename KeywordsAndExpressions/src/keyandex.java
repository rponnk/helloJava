public class keyandex {

    public static void main(String[] args) {
        //expressions
        printConversion(0);


    }

    //METHODS
    public static double toMilesPerHour ( double kilometersPerHour) {
        if ( kilometersPerHour < 0) {
            return -1;
        } else {
            double mph = kilometersPerHour / 1.609;
            return mph;
        }
    }
    public static void printConversion (double kilometersPerHour) {
        if ( kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println (kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h" ); }
    }
}
