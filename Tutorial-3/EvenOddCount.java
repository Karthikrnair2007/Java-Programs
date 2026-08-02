package tutorial3;

import java.util.Scanner;

class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of Even elements = " + even);
        System.out.println("Number of Odd elements = " + odd);

        sc.close();
    }
}