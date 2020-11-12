package day_21_WhileLoop;

import java.util.Scanner;

public class String_Practice_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();


       int lastIndex = word.length()-1;
       char f = word.charAt(0);
       char l = word.charAt(lastIndex);

        System.out.println(f + l);

        System.out.println();

        System.out.println("===============================================================");

        System.out.println("Enter building number");
        String buildingNumber = scan.next();

        System.out.println("Enter street number");
        String streetNumber = scan.nextLine();

        System.out.println("Apartment number");
        String apartmentNumber = scan.next();

        scan.nextLine();

        System.out.println("City name");
        String city = scan.nextLine();

        System.out.println("Enter your State");
        String state = scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();

        String fullAddress = buildingNumber+" "+streetNumber+" Apr# "+apartmentNumber+"\n"+city+","+state+" "+zipCode;





    }
}
