package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Jone";
        String citizen = "USA";

        boolean eligible = citizen == "USA";
        System.out.println(name + "eligible to vote for Donald Trump or Joe Biden ? /n/t " + eligible);

        System.out.println("========================================================================");

        String name2 = "Aron";
        boolean isUSACitizen = false;

        boolean eligibleToVote =   isUSACitizen;



    }
}
/*
name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true

 */