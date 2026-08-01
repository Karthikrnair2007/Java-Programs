package mod1;

import java.util.Scanner;

class Marks {
    int mark1, mark2, mark3;

    // Constructor
    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Method to calculate and display total and average
    void calculateMarks() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Marks student = new Marks(m1, m2, m3);

        student.calculateMarks();

        sc.close();
    }
}