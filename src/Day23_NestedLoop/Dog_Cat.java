package Day23_NestedLoop;

public class Dog_Cat {
    public static void main(String[] args) {
        String sentence = "dog Dog dog Dog cat Cat cat Cat cat";
        String temp = sentence.toLowerCase();

        int countDog =0;
        while (temp.contains("dog")){
            temp = temp.replaceFirst("dog","");
            countDog++;
        }
        System.out.println(" Number of dog:"+countDog);

        int countCat =0;
        while (temp.contains("cat")){
            temp = temp.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(" Number of cat:"+countCat);

    }
}
