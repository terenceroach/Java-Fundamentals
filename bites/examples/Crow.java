package bites.examples;

public class Crow implements BirdBehaviours{
    @Override
    public Boolean fly(Boolean canFly) {
        return canFly;
    }

    @Override
    public String sing(String song) {
        return String.format("Crows make a %s sound", song);
    }

    @Override
    public String eat(String food) {
        return String.format("Crows like to eat %s", food);
    }

    public static void main(String[] args) {
        Crow crow = new Crow();
        System.out.println(crow.fly(true));
        System.out.println(crow.sing("caws"));
        System.out.println(crow.eat("plants"));

    }
}
