package day14_Switch_Recap;

public class QualifactionForArmy {
    public static void main(String[] args) {
        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = false;
        int age = 35;
        boolean hasHighSchoolDiploma = false;

        if (citizen == "USA" || isAlien){
          if (age >= 17 &&  age <= 34){
              if (hasHighSchoolDiploma){
                  System.out.println("You are qualified for US Army");
              }else{
                  System.err.println("You must have a high school diploma");

              }

          }else{
              System.err.println("You must be between 17 to 34 years old");
          }
        }else{
            System.out.println("You must be a U.S. citizen or a resident or alien");


        }





    }
}
