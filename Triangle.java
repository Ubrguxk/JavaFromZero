public class Triangle extends Figure implements Printable {
    double side1, side2,side3;

    public Triangle(double userSide1, double userSide2, double userSide3){
       side1 = userSide1;
       side2 = userSide2;
       side3 = userSide3;
    }
    
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s-side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public void print(){
        System.out.println("Side 1 " + side1);
        System.out.println("Side 1 " + side2);
        System.out.println("Side 1 " + side3);
        System.out.println("Area  " + this.calculateArea());
        System.out.println("Perimeter  " + this.calculatePerimeter());
    }

}
