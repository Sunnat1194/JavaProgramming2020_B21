package day14_Switch_Recap;

import javax.jws.soap.SOAPBinding;

public class If_Practice {
    public static void main(String[] args) {
        // if & else: 2 options
        int n =10000;

        if (n % 2 != 0){      // for odd
            System.out.println(n+ "is odd number");
        }else{
            System.out.println(n+ " is even number");
        }

           int age = 14;

           if (age >= 18){
               System.out.println("You are eligible to get license");
           }else{
               System.out.println("You are not eligible to get license");
           }

            char grade = 'A';

            if (grade == 'A' || grade == 'B' || grade == 'C'){
                System.out.println("You passed the class");
            }else{
                System.out.println("You did not to pass the calss");
            }
        System.out.println("========================================================================");
         // else if: 3 or more options

        int n1 = 100;
        int n2 = 200;
         if (n1 > n2 ) {
             System.out.println(n1 + " is greater than" + n2);

         }else if (n2 > n1){
             System.out.println(n2 + " is greater than " +n1);
         }else{
             System.out.println(n1 + " is greater than " + n2);
         }

            int num = 7;      // 1~7

        if (num ==1){
            System.out.println("Today is Monday");
        }else if (num == 2){
            System.out.println("Today is Tuesday");
        }else if (num == 3){
            System.out.println("Today is Wednesday");
        }else if (num ==4){
            System.out.println("Today is Thursday");
        }else if (num == 5){
            System.out.println("Today is Friday");
        }else if (num == 6){
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is Sunday");
        }

        int Age = 35;

        if (Age < 21){
            System.out.println("Teenager");
        }else if (Age >= 21 && Age <= 55){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
        System.out.println("====================================================================");
        // nested if:

        int AGE = -2;

        if (AGE >= 1 && AGE <=150){
            if (AGE < 21){
                System.out.println("Teenager");
            }else if (AGE >= 21 && AGE <= 55){
                System.out.println("Adult");
            }else {
                System.out.println("Senior");
            }

        }else{
            System.out.println("Invalid Age");
        }




    }
}
