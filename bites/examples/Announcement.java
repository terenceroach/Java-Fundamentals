package bites.examples;

public class Announcement {
    public static String celebration(){
        return "Yay, well done!";
    }
    public static String changeOfPlan(){
        return "Our plans have changed!";
    }

    public static String apology(){
        return "I'm sorry but I am enjoying Java";
    }

    public static String politeNotice(){
        return "Hello, please be advised.....";
    }

    public static String helpNeeded(){
        return "Yo, I need your help!";
    }

    public static void main(String[] args){
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }
}
