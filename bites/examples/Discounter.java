package bites.examples;

public class Discounter {

    public Integer discount;

    public int applyTo(int amount){
        return amount - this.discount;
    }

    public Discounter(int discount){
        this.discount = discount;
    }
    public static void main(String[] args) {
        Discounter discounter = new Discounter(15);
        System.out.println(discounter.applyTo(50));
        System.out.println((discounter.applyTo(400)));
    }
}
