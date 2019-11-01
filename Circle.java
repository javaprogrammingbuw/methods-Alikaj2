import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        //Calculate Diameter
        double diameter = calcDiameter(radius);
        System.out.println("Diameter is " + diameter);
        System.out.printf( "Diameter is %.2f\n", diameter );
        //Calculate Circumferemce
        double circumference = calcCircumference(radius);
        System.out.println("Circumference is " + circumference);
        System.out.printf( "Circumference is %.2f\n", circumference );
        //Calculate Area
        double area = calcArea(radius);
        System.out.println("Area is " + area);
        System.out.printf( "Area is %.2f\n", area );


    }

    public static double calcDiameter (double radius) {
        return radius *2;
}

    public static double calcCircumference  (double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calcArea  (double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
