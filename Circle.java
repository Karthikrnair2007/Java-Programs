package mod1;

import java.util.Scanner;

class Circle {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to display area and circumference
    void displayCircle() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("\nRadius : " + radius);
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
            System.out.print("\nEnter radius of Circle : ");
            double r = sc.nextDouble();

            Circle c = new Circle(r);
        

        System.out.println("\n----- Circle Details -----");

        
            c.displayCircle();
        

        sc.close();
    }
}