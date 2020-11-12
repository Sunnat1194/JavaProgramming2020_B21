package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {
        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;
        boolean isEligible = isUSACitizen == true && age >=18;
        System.out.println(name + " is eligible to vote: " +isEligible);

    }
}
