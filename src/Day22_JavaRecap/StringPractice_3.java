package Day22_JavaRecap;

public class StringPractice_3 {
    public static void main(String[] args) {
        String sentence = "Capitol of Canada is Washington";

       sentence = sentence.replace("Canada" , "United States");

        System.out.println(sentence);

        String s = "Cybertek School is Boston, Cybertek Campus is in McLean";
        s = s.replace("Cybertek", "MIT");

        System.out.println(s);

        String r = "cava is cool programming language , I like to learn cava at cybertek school";
        r = r.replace("ca","ja");

        System.out.println(r);
    }
}





