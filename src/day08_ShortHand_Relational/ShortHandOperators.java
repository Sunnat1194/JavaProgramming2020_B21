package day08_ShortHand_Relational;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class ShortHandOperators {
    public static void main(String[] args) {
         int a = 10;

         a = 10;
         System.out.println(a);   //10

        a = 30;
        System.out.println(a); //30


        String schoolName = "Cybertek";

            schoolName = "MIT";

        System.out.println(schoolName);

        int x = 100; // 100 - 62 = 38
             x = 38;
        System.out.println(x);

        int salary = 100000;  // 0.28
              salary -= (salary * 0.28);
              // salary -= 28000;
              // salary = salary - 28000;
              // salary = 100000 - 28000 = 72000


        System.out.println(salary);

        int x2 = 999999;
          x2 -=25;
        System.out.println(x2);

           double balance = 2000;
             balance =-450;
             System.out.println(balance);

              balance -= 1000;

        System.out.println(balance);

        balance += 5000;
        System.out.println(balance);


        int y3 = 10;
             y3 /=5;
        System.out.println(y3);

        int house = 500000;
         int month = 240;
         double monthlyPayment = 500000;
              monthlyPayment /= 240;
        System.out.println(monthlyPayment);


    }
}
