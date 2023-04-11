package bites.examples;

public class Announcement {
    public String celebration(){
        return "Yay, well done!";
    }
    public String changeOfPlan(){
        return "Our plans have changed!";
    }

    public String apology(){
        return "I'm sorry but I am enjoying Java";
    }

    public String politeNotice(){
        return "Hello, please be advised.....";
    }

    public String helpNeeded(){
        return "Yo, I need your help!";
    }

    public static void main(String[] args){
        Announcement myAnnouncement = new Announcement();
        System.out.println(myAnnouncement.celebration());
        System.out.println(myAnnouncement.changeOfPlan());
        System.out.println(myAnnouncement.apology());
        System.out.println(myAnnouncement.politeNotice());
        System.out.println(myAnnouncement.helpNeeded());
    }
}
