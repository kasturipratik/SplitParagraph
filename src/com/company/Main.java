package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String paragraph = "What is your..name! Hello. I am pratik! Are you going to nepal? I am planning to travel " +
                "the world. I don't know if you want to join me or not. Have a safe flight.";

        String[] arr = paragraph.split("\\. |\\? |\\! ");

        int maxvalue = 0;

        String sentence = "";
        System.out.println(paragraph);
        System.out.println("#################################################### \n Divided  Sentences ");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].split(" ").length;
            if (maxvalue < len) {
                maxvalue = len;
                sentence = arr[i];
            }
            System.out.println((i+1) +": "+arr[i]);
        }
        System.out.println("###################################################");
        System.out.println("{ \"" + sentence + "\" } is the longest sentence.");
        System.out.println("It has " + maxvalue + " words.");
    }
}
