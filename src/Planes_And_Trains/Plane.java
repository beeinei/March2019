package Planes_And_Trains;

public class Plane implements Comparable, Movable {

    private String license;
    private String source;
    private String destination;
    private int maxHeight;

    public Plane(String license, String source, String destination, int maxHeight) {
        this.license = license;
        this.source = source;
        this.destination = destination;
        this.maxHeight = maxHeight;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Plane){
            return ((Plane)o).maxHeight - this.maxHeight;
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
        return "Plane";
    }

    public String details(){
        return getType() + ": " + "\n"
                + "Plane Number: " + license + "\n"
                + "Altitude: " + maxHeight + "\n"
                + "source: " + source + "\n"
                + "destination: " + destination;
    }

}
