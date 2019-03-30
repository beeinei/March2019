package Geometric_Shapes;

public class RightAngledTriangle extends BasicShape{

    private Point kodkod;
    private int a;
    private int b;

    public RightAngledTriangle(Point kodkod, int a, int b) {
        super("Green");
        this.kodkod = kodkod;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "RightAngledTriangle:\n"+
                "The kodkod of the Triangle:"+kodkod+
                "The a:"+a+
                "The b:"+b+
                "\n";
    }

    @Override
    public double getArea(){
        return a*b*0.5;
    }

    @Override
    public double getPerimeter(){
        return a + b + (Math.sqrt(a*a + b*b));
    }

}
