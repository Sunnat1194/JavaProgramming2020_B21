package Office_Hourse.Practice_10_28_2020;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Cybertek School";

        String result = scan.nextLine();
        scan.close();
        for (int i = name.length()-1; i >= 0 ; i--) {
            result+=name.charAt(i);
        }
        System.out.println(result);


        }
    }