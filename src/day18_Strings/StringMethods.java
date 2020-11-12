package day18_Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cybertek";
        str = str.concat("School"); // "Cybertek School"
        System.out.println(str);
        String str2 = " Cybertek";

        str2 = str2 +123;
        System.out.println(str2);

        System.out.println("===============================================================");
        String name = "Bank Of America";
        
        name = name.toUpperCase();              //"BANK OF AMERICA";
        System.out.println("name = " + name);
        
        name = name.toLowerCase();          //"bank off america"
        System.out.println("name = " + name);

        System.out.println("=================================================================");
        String t1 = "                             Hello                    ";
                     t1=t1.trim();   ///"Hello"
        System.out.println(t1);
        String t2 = "Hello          Everyone";
        t2=t2.trim();
        System.out.println(t2);
        System.out.println("==================================================================");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your firts name: ");
        String firstName =   scan.next();
            firstName = firstName.trim();

            String lastName = scan.next();
            lastName = lastName.trim();

        System.out.println("firstName : " + firstName);

        System.out.println("lastNmae: " + lastName);



    }
}
