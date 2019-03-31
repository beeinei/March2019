package Planes_And_Trains;

public class Train implements Comparable, Movable {

    private String license;
    private String source;
    private String destination;
    private int maxPassengers;

    public Train(String license, String source, String destination, int maxPassengers) {
        this.license = license;
        this.source = source;
        this.destination = destination;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Train){
            return ((Train)o).maxPassengers - this.maxPassengers;
        }
        return -1;
    }

    public static void swap(String a, String b){
        a = a + b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        //System.out.println(a + "|" + b);
    }

    public String getSource(){
        return source;
    }

    public String getDestination(){
        return destination;
    }

    public void move(){
        swap(source, destination);
    }

    public String getType(){
        return "Train";
    }

    public String details(){
        return getType() + ": " + "\n"
                + "Train Number: " + license + "\n"
                + "Passengers: " + maxPassengers + "\n"
                + "source: " + source + "\n"
                + "destination: " + destination;
    }

}
