package Toys;

public class Main {

    public static void main(String[] args) {
        Toy[] toys = new Toy[5];
        toys[0] = new Dolly("Barbie", 30, 5, 3);
        toys[1] = new Dolly("Ken", 20, 2, 7);
        toys[2] = new TeddyBear("Teddy", 29, true, "Blue");
        toys[3] = new Dolly("Dolly", 35, 8, 2);
        toys[4] = new TeddyBear("Paddington", 45, false, "Brown");
        for (int i = 0; i < toys.length; i++) {
            System.out.println(toys[i].toString());
        }
    }

}
