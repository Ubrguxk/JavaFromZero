import java.util.Scanner;
import static java.lang.System.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator of area and volume of 2D and 3D Figures");

        while (true) {
            System.out.println("Will it be the flat figure or the prism? 1. Flat 2. Prism");
            int pickOne = scanner.nextInt();
            if (pickOne != 1 && pickOne != 2) {
                System.out.println("Wrong choice");
                exit(1);
            }

            Figure figure = createFigure(scanner);
            ((Printable) figure).print();

            if (pickOne == 2){
                Prism prism = createPrism(scanner, figure);
                ((Printable) prism).print();
            }

            System.out.println("1 - Next Figure, 2 - Exit the software");
            int whatNow = scanner.nextInt();
            if (whatNow == 2){
                exit(0);
            }
        }
    }
    public static boolean ifTrianglePossible(double size1, double size2, double size3){
        if( size1 + size2 > size3 && size2 + size3 > size1 && size1 + size3 > size2 && size1 > 0 && size2>0 && size3>0){
            return true;
        }
        System.out.println("Incorrect triangle sides. Please try again");
        return false;
    }

    private static Figure createFigure(Scanner scanner){
        System.out.println("Choose the figure:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        int pickTwo = scanner.nextInt();

        switch (pickTwo) {
            case 1:
                return createSquare(scanner);

            case 2:
                return createTriangle(scanner);

            case 3:
                return creteCircle(scanner);

            default:
                System.out.println("Wrong choice");
                exit(1);
        }
        return null;
    }
    private static Prism createPrism(Scanner scanner, Figure figure){
        double size = -1;
        while ( size < 0) {
            System.out.println("Please input the Prism height:");
            size = scanner.nextDouble();
        }
        return new Prism(size, figure);
    }
    private static Figure createSquare(Scanner scanner){
        double size = -1;
        while (size < 0) {
            System.out.println("Please input the Figure side length:");
            size = scanner.nextDouble();
        }
        return new Square(size);
    }
    private static Figure createTriangle(Scanner scanner){
        double size = 0.0;
        double size2 = 0.0;
        double size3 = 0.0;
        boolean ifPoss = false;
        while (!ifPoss) {
            System.out.println("Please input the Figure side 1 length:");
            size = scanner.nextDouble();
            System.out.println("Please input the Figure side 2 length:");
            size2 = scanner.nextDouble();
            System.out.println("Please input the Figure side 3 length:");
            size3 = scanner.nextDouble();
            ifPoss = ifTrianglePossible(size,size2,size3);
        }
        return new Triangle(size,size2,size3);
    }
    private static Figure creteCircle(Scanner scanner){
        double size = -1;
        while (size < 0){
            System.out.println("Please input the radius:");
            size = scanner.nextDouble();
        }
        return new Circle(size);
    }
}