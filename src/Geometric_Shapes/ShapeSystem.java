package Geometric_Shapes;

import java.util.Scanner;

public class ShapeSystem {

    static BasicShape[] shapes = new BasicShape[3];

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select a shape:"
                + "\n" + "1. Circle"
                + "\n" + "2. Rectangle"
                + "\n" + "3. Right Angled Triangle");
        int tmp;
        for (int i = 0; i < shapes.length; i++) {
            tmp = reader.nextInt();
            if (tmp == 1){ //Circle
                System.out.println("Insert center x and y, radius and color");
                shapes[i] = new Circle(new Point(reader.nextInt(), reader.nextInt()), reader.nextDouble(), reader.next());
            }else if (tmp == 2){ //Rectangle
                System.out.println("Insert bottomLeft x and y, topRight x and y");
                shapes[i] = new Rectangle(new Point(reader.nextInt(), reader.nextInt()),new Point(reader.nextInt(), reader.nextInt()));
            }else if (tmp == 3){ //Right Angled Triangle
                System.out.println("Insert kodkod x and y, a and b");
                shapes[i] = new RightAngledTriangle(new Point(reader.nextInt(), reader.nextInt()),reader.nextInt(),reader.nextInt());
            }
            System.out.println("-----");
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("shape " + i + " is: " + shapes[i].toString());
            System.out.println("The area is: " + shapes[i].getArea());
            System.out.println("The perimeter is: " + shapes[i].getPerimeter());
        }
    }

}
