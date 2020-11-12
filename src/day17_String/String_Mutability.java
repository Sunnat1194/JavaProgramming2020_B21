package day17_String;
import java.util.Scanner;
public class String_Mutability {
    public static void main(String[] args) {
      String wordOne ="Friday";
      String wordTwo = wordOne;
      String wordThree = "Friday";

        System.out.println(wordTwo);
        System.out.println(wordOne);
        System.out.println(wordOne==wordThree);



    }
}
