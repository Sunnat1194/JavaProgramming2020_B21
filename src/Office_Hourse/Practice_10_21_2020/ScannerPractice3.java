package Office_Hourse.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your gender:");
        String gander = scan.next();


        System.out.println("Whats your age :");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Whats your full name:");
        String fullName = scan.nextLine();


        System.out.println("Whats your zip code:");
        String zipCode = scan.next();

        System.out.println("Where are you from:");
        String from = scan.nextLine();




    }
}
