package bites.examples;

public class Penguin implements BirdBehaviours{

    @Override
    public Boolean fly(Boolean canFly) {
        return canFly;
    }

    @Override
    public String sing(String song) {
        return String.format("Penguins make a %s sound", song);
    }

    @Override
    public String eat(String food) {
        return String.format("Penguins like to eat %s", food);
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        System.out.println(penguin.fly(false));
        System.out.println(penguin.sing("chirp"));
        System.out.println(penguin.eat("fish"));

    }
}
