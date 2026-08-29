public class Rectanglemodel {
    public static void main(String[] args) {

        System.out.println("Creating rectangle using no-argument constructor:");
        Rectangle r1 = new Rectangle();

        System.out.println("\nCreating rectangle using one-argument constructor:");
        Rectangle r2 = new Rectangle(5);

        System.out.println("\nCreating rectangle using two-argument constructor:");
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("\nObjects:");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("\nScaling r3 by 2:");
        r3.scale(2);
        System.out.println(r3);
    }
}
