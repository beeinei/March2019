package Geometric_Shapes;

public abstract class BasicShape {

    protected String color;

    public BasicShape(String color){
        this.color = color;
    }

    protected String getColor(){
        return color;
    }

    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();

}
