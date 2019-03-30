package Toys;

public abstract class Toy {

    protected String name;
    protected double basePrice;

    public Toy(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double computePrice();

    public void changeBasePrice(double percent){
        this.basePrice = basePrice*(percent/100);
    }

    public abstract String toString();

}
