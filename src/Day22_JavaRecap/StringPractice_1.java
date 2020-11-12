package Day22_JavaRecap;

import java.util.Scanner;

public class StringPractice_1 {
    public static void main(String[] args) {

        String sentence = "My name is Sunnat";
        String name1 = sentence.substring(11, sentence.length());

        System.out.println(name1);

        String name2= sentence.substring(11);
        System.out.println(name2);

        String str1 = "Monday is cool it is a fun day";

        String day1 = str1.substring(0,6);
        System.out.println(day1);

        String s1 = "https://www.amazon.com";
        String domain = s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);


        System.out.println("========================================================");

        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine().toLowerCase();
        String lastName = scan.nextLine().toLowerCase();

        scan.close();

       firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
       lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String fullName = firstName+" "+lastName;
        System.out.println("fullName = " + fullName);
    }
}
