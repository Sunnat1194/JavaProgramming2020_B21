package day18_Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        String str ="Today is Monday";
        //

        String day = str.substring(9, 14+1 );

        System.out.println(day);

        String email = "Sunnat1194@gmail.com";
        //              0123456789 101112131415
        String domain = email.substring(9, 14+1);
        System.out.println("Domain of the email " +email+ " is:" +domain);

        String s1 = "I like movies and books";
         //          01234567
        String word1 = s1.substring(7 , 12+1);
        System.out.println(word1);

        System.out.println("========================================================");
        String firstName = "cYbErTeK";
        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1, firstName.length()-1+1);
        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;

        System.out.println(firstName);

        System.out.println("=================================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase() +f.substring(1, f.length()-1+1).toLowerCase();
        System.out.println("Enter your last name");
        String l = scan.nextLine();
        l = l.substring(0, 1).toUpperCase() + l.substring(1, l.length()-1 +1).toLowerCase();
        System.out.println(" first name is: " +f);
        System.out.println(" last name is: " +l);

        String fullName = f + l;
        System.out.println(" full name is: " +fullName);
    }
}
