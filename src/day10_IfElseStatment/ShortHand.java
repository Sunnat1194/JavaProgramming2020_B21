package day10_IfElseStatment;

import java.security.acl.LastOwnerException;

public class ShortHand {

    public static void main(String[] args) {
        int a =100;

        System.out.println(a);  //100

        System.out.println(++a);  //101

        a = 200;

        System.out.println(a); //200

        System.out.println(++a); //201

        System.out.println(a);   //201

        a=300;

        System.out.println(a); //300

        String name = " Daniel";
        System.out.println(name); //Daniel

             name = " John";
        System.out.println(name);

        //+=:

        int A =200;
         //  A =A + 100;
            A +=100;
        System.out.println(A);

        String school = "Cybertek";
      school =  school +" School";
         // school = school + "school
        school += "School"; // concatenation assignment

        System.out.println(school);

        int savingAccount = 1000;   // october
               savingAccount += 2000;
        System.out.println(savingAccount); // october

        savingAccount += 500;

        System.out.println(savingAccount); // november

        // -=:

        savingAccount -=1000;
        System.out.println(savingAccount);

        savingAccount -= 500;

        System.out.println(savingAccount);

        //*=:

        double salary = 10000;
        salary *= 1.2;

        System.out.println(salary);

        int Y = 10;
        Y *= 10;

        System.out.println(Y);

        // /= :

        double tax = 10000;
        tax /= 2;

        System.out.println(tax);

        int B = 3000;
        // B /=0;
        System.out.println(B);

        //%=:
        int T = 100;
            T %=10;
        System.out.println(T);
        double U = 35;
        U %=9;

        System.out.println(U);
    }
}
