package bites.examples;

public class LeapYear {

    public static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        } else if(year % 100 == 0){
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1970));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(1988));
        System.out.println(isLeapYear(1500));
    }
}
