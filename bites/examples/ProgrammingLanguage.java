package bites.examples;

public class ProgrammingLanguage {

    String name;
    int yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, int yearOfCreation, String creator){
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName(){
        return name;
    }
    public int getYearOfCreation(){
        return yearOfCreation;
    }
    public String getCreator(){
        return creator;
    }

    public static void main(String[] args){
        ProgrammingLanguage programmingLanguage1 = new ProgrammingLanguage("Java", 1995, "James Gosling");
        ProgrammingLanguage programmingLanguage2 = new ProgrammingLanguage("Python", 1991, "Guido van Rossum");
        ProgrammingLanguage programmingLanguage3 = new ProgrammingLanguage("JavaScript", 1995, "Brendan Eich");
        System.out.println(programmingLanguage1.getName());
        System.out.println(programmingLanguage1.getYearOfCreation());
        System.out.println(programmingLanguage1.getCreator());
        System.out.println(programmingLanguage2.getName());
        System.out.println(programmingLanguage2.getYearOfCreation());
        System.out.println(programmingLanguage2.getCreator());
        System.out.println(programmingLanguage3.getName());
        System.out.println(programmingLanguage3.getYearOfCreation());
        System.out.println(programmingLanguage3.getCreator());
    }
}
