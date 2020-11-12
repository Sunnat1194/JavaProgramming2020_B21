package Day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.println("Which room would like to select?");
        System.out.println("\t\tA.King Bed == $120");
        System.out.println("\t\tQueen Bed == $100");
        System.out.println("\t\tSingle bed == $80");

        String word = scan.nextLine().toLowerCase();

        while (! (word.equals("king bed")||word.equals("queen bed")|| word.equals("single bed"))){

            total += (word.equals("king bed ")) ? 120 : (word.equals("queen bed ")) ? 100 : 80;

            System.out.println("Would do you like to select another room ?");
            String a = scan.nextLine().toLowerCase();

            if(a.equals("no")){
                break;
            }
        }
    }
}
