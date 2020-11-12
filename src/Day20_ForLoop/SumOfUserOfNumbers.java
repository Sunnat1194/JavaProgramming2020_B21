package Day20_ForLoop;

import java.util.Scanner;

public class SumOfUserOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int times = scan.nextInt();
        int result = 0;  // to contain the sum of each user entered number
        for (int i = 1; i <= times ; i++) {
            System.out.println("Enter a number");
             result += scan.nextInt();
        }
        System.out.println("result = " + result);

    }
}
