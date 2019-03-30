package Toys;

public class TeddyBear extends Toy {

    private boolean isBig;
    private String color;

    public TeddyBear(String name, double basePrice, boolean isBig, String color) {
        super(name, basePrice);
        this.isBig = isBig;
        this.color = color;
    }

    @Override
    public double computePrice(){
        if(isBig){
            return basePrice+30;
        }else{
            return basePrice+15;
        }
    }

    @Override
    public void changeBasePrice(double percent){
        super.changeBasePrice(percent);
    }

    @Override
    public String toString() {
        return this.color + "TeddyBear " + this.name + ": the price is " + this.computePrice();
    }

}
