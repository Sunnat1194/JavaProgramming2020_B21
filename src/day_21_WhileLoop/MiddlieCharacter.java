package day_21_WhileLoop;

public class MiddlieCharacter {
    public static void main(String[] args) {

        String word = "cybertek"; // 3/2 = 1
        //            "javav" // 5/2=2

        if (word.length() % 2 != 0) {

            // first req
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else {  // sec rqu
                System.out.println(word + word + word);
            }

        } else { // even number of characters
            // "java" ==> av ==> 1, 2
            // "apples" ==> pl ==> 2, 3
            // "cybertek"==>er ==> 3, 4(length/2)

            if (word.length() >= 4) {
                int m = word.length() / 2;
                System.out.println(word.charAt(m - 1) + "" + word.charAt(m));
            } else {
                System.out.println(word + word);
            }
        }
    }

}
