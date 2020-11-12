package day05_Concatenation;

import javax.jws.soap.SOAPBinding;

public class

EmployeeInfo {
    public static void main(String[] args) {

        String firstName = ("John"); // "" for the texts
        String lastName = ("Daniel");
        String fullName = firstName+" "+lastName;
        char gender = 'M';// for single characters
        int age = 35;
        String companyName = "CapitolOne";
        String jobTitle = "SDET";
        double salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;


        System.out.print("Employee' full name");
        System.out.println(fullName);
        System.out.println("John Daniel' gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print(" ' Age is: ");
        System.out.println(age);
        System.out.println(" Years Old");

        System.out.print(fullName);
        System.out.print("' Works at: ");
        System.out.println(companyName);

        System.out.println(firstName);
        System.out.println(" ' Job Title");
        System.out.println(jobTitle);

        System.out.println(fullName);
        System.out.print("' Salary is: $ ");
        System.out.println(salary);

        System.out.println(fullName);
        System.out.println("' is full time employee");
        System.out.println(isFullTime);

        System.out.println(fullName);
        System.out.println("' is married");
        System.out.println(isMarried);




    }







}
  /*

        1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
   */