package bites.examples;

public class Quiz {

    String questionOne;
    String questionTwo;
    public Quiz(String questionOne, String questionTwo){
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

    public String getQuestionOne(){
        return questionOne;
    }

    public String getQuestionTwo(){
        return questionTwo;
    }

    public static void main(String[] args){
        Quiz myQuiz = new Quiz("what is the capital of Burkina Faso?", "What is the capital of Bhutan?");
        System.out.println(myQuiz.getQuestionOne());
        System.out.println(myQuiz.getQuestionTwo());
    }
}
