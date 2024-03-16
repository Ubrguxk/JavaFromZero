public class Prism extends Figure implements Printable {
    double height;
    Figure base;

    public Prism(double userHeight, Figure userBase){
        height = userHeight;
        base = userBase;
    }
    @Override
    public double calculateArea() {
        return base.calculateArea() * 2 + height * base.calculatePerimeter();
    }

    @Override
    public double calculatePerimeter() {
        return base.calculatePerimeter() * 2 + 4 * height;
    }

    public double calculateVolume() {
        return base.calculateArea() * height;
    }

    @Override
    public void print(){
        System.out.println("Height  " + height);
        System.out.println("Area  " + this.calculateArea());
        System.out.println("Perimeter  " + this.calculatePerimeter());
        System.out.println("Volume  " + this.calculateVolume());
    }
}
