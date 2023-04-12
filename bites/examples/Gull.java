package bites.examples;

public class Gull implements BirdBehaviours{
    @Override
    public Boolean fly(Boolean canFly) {
        return canFly;
    }

    @Override
    public String sing(String song) {
        return String.format("Gulls make a %s sound", song);
    }

    @Override
    public String eat(String food) {
        return String.format("Gulls like to eat %s", food);
    }

    public static void main(String[] args) {
        Gull gull = new Gull();
        System.out.println(gull.fly(true));
        System.out.println(gull.sing("huoh-houh-houh"));
        System.out.println(gull.eat("fish"));

    }
}
