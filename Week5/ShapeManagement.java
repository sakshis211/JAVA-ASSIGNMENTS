public class ShapeManagementApp {

    public static void main(String[] args) {

        ShapeModel shape = new ShapeModel();

        double circleArea = shape.calculateArea(5);
        double circlePerimeter = shape.calculatePerimeter(5);

        double rectangleArea = shape.calculateArea(10, 4);
        double rectanglePerimeter = shape.calculatePerimeter(10, 4);

        double triangleArea = shape.calculateArea(8, 6, "Triangle");
        double trianglePerimeter = shape.calculatePerimeter(3, 4, 5);

        System.out.println("----- CIRCLE -----");
        System.out.println("Area: " + circleArea);
        System.out.println("Perimeter: " + circlePerimeter);

        System.out.println("\n----- RECTANGLE -----");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);

        System.out.println("\n----- TRIANGLE -----");
        System.out.println("Area: " + triangleArea);
        System.out.println("Perimeter: " + trianglePerimeter);
    }
}
