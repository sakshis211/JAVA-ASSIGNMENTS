public class ShapeModel {

    public double calculateArea(double radius) {
        if (radius <= 0) {
            return 0;
        }

        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            return 0;
        }

        return length * width;
    }

    public double calculateArea(double base, double height, String shapeType) {
        if (base <= 0 || height <= 0) {
            return 0;
        }

        return 0.5 * base * height;
    }

    public double calculatePerimeter(double radius) {
        if (radius <= 0) {
            return 0;
        }

        return 2 * Math.PI * radius;
    }

    public double calculatePerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            return 0;
        }

        return 2 * (length + width);
    }

    public double calculatePerimeter(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return 0;
        }

        return side1 + side2 + side3;
    }
}
