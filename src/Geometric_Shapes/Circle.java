package Geometric_Shapes;

public class Circle extends BasicShape {

    protected Point center;
    protected double radius;

    public Circle(Point center ,double radius, String color){
        super(color);
        this.center = new Point(center);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public String toString(){
        return "The Circle:\n"+
                "The center of the circle:"+this.center+
                "The radius:"+this.radius+
                "The color:"+super.getColor()+
                "\n";
    }


}