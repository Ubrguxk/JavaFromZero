public class Square extends Figure implements Printable{
    double sideSize;

    public Square(double userSideSize){
        sideSize = userSideSize;
    }

    @Override
    public double calculateArea() {
        return sideSize * sideSize;
    }

    @Override
    public double calculatePerimeter() {
        return sideSize * 4;
    }

    public void print(){
        System.out.println("Side " + sideSize);
        System.out.println("Area  " + this.calculateArea());
        System.out.println("Perimeter  " + this.calculatePerimeter());
    }
}
