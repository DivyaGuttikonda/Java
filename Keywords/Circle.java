package Keywords;

public class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius; // 'this' distinguishes between the instance variable and the constructor parameter
        }

        double calculateArea(double radius) {
            return Math.PI * this.radius * this.radius; // 'this' distinguishes between instance variable and method parameter
        }

    public static class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            System.out.println("Area of the circle: " + circle.calculateArea(3.0));
        }
    }

}
