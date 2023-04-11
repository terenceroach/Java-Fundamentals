package bites.examples;

import java.util.ArrayList;

public class Queue {

    ArrayList<String> people = new ArrayList<String>();

    public void add(String person){
        people.add(person);
    }
    public void next(){
        people.remove(0);
    }
    public void state(){
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add("Terry");
        queue.add("Sarah");
        queue.add("Samuel");
        queue.state();
        queue.next();
        queue.state();
    }
}
