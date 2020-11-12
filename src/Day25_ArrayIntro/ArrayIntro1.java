package Day25_ArrayIntro;

public class ArrayIntro1 {
    public static void main(String[] args) {
        String[] names = {"Sunnat",  "Ayse",  "Inna"};

        System.out.println(names[2]);


        String str1 = names [0];
        System.out.println(str1);

        int[] score = {80, 85, 90, 70, 75};

        System.out.println("========================================================");

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]+":"+score[i]);

        }
    }
}
