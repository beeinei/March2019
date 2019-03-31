package Planes_And_Trains;

import java.util.Arrays;

public class AirportInfo {

    public static void sortTransport(Comparable[] transport){
        Arrays.sort(transport);
    }

    public static String reportAll(Movable[] movable){
        String output = "";
        for (int i = 0; i < movable.length; i++) {
            if (movable[i] instanceof Plane){
                System.out.println("Movable Type: Plane");
                System.out.println(movable[i].details());
                System.out.println();
            }
            if (movable[i] instanceof Train){

            }
        }
        return output;
    }

}
