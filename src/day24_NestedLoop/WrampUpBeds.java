package day24_NestedLoop;

import day_21_WhileLoop.While_Loop_Practice;

import java.util.Scanner;

public class WrampUpBeds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalPrice =0;

        System.out.println("Do you want to reserve a room? ");
        String yesOrNo = scan.next();

        while (yesOrNo.equalsIgnoreCase("yes"));


        System.out.println(" Which bed type do you want?" );
        String bedType = scan.next();

        switch (bedType){
            case "king":
                totalPrice += 120;
                break;
            case "queen":
                totalPrice += 100;
                break;
            case "single":
                totalPrice += 80;
                break;
            default:
                System.out.println("Invalid room type");

        }
        System.out.println("Do you want reserve another room");
        yesOrNo = scan.next();

        System.out.println("total:"+totalPrice);

    }

}
