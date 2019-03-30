package Toys;

public class Dolly extends Toy {

    private int accessories;
    private double accPrice;

    public Dolly(String name, double basePrice, int accessories, double accPrice) {
        super(name, basePrice);
        this.accessories = accessories;
        this.accPrice = accPrice;
    }

    @Override
    public double computePrice(){
        return basePrice + (accPrice*accessories);
    }

    @Override
    public void changeBasePrice(double percent){
        this.basePrice = basePrice*(percent/100);
    }

    @Override
    public String toString() {
        return "Dolly " + this.name + ": the price is " + this.computePrice();
    }
}
