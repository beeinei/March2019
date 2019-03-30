package Geometric_Shapes;

public class Rectangle extends BasicShape {
    private Point bottomLeft;
    private Point topRight;
    private int width, height;

    public Rectangle(Point bottomLeft, Point topRight) {
        super("Red");
        this.bottomLeft = new Point(bottomLeft);
        this.topRight = new Point(topRight);
        this.width = topRight.getX() - bottomLeft.getX();
        this.height= topRight.getY() - bottomLeft.getY();
    }

    public Rectangle(Point bottomLeft, int width, int height) {
        super("Red");
        this.bottomLeft = new Point(bottomLeft);
        this.topRight = new Point(bottomLeft.getX()+width, bottomLeft.getY()+height);
        this.width=width;
        this.height=height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    public String toString() {
        return "The Rectangle:\nPoint bottom-left:"+
                this.bottomLeft.toString()+
                "Point top-right:"+
                this.topRight.toString()+
                "Color:"+
                super.getColor();
    }

    public void move(int deltaX, int deltaY) {
        int bottomLeftX = this.bottomLeft.getX();
        int bottomLeftY = this.bottomLeft.getY();
        this.bottomLeft.setX(bottomLeftX+deltaX);
        this.bottomLeft.setY(bottomLeftY+deltaY);
        int topRightX = this.topRight.getX();
        int topRightY = this.topRight.getY();
        this.topRight.setX(topRightX + deltaX);
        this.topRight.setY(topRightY + deltaY);
    }
}
