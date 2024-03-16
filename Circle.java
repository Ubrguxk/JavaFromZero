public class Circle extends Figure implements Printable {
    double radius;
    final static double pi = 3.14;
    public Circle(double userRadius){
        radius = userRadius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * pi;
    }

    @Override
    public double calculatePerimeter() {
        return pi * 2 * radius;
    }

    @Override
    public void print() {
        System.out.println("Radius " + radius);
        System.out.println("Area  " + this.calculateArea());
        System.out.println("Circumference  " + this.calculatePerimeter());
    }
}
