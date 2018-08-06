package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name = "What is your..name! Hello. I am pratik! Are you going to nepal?";

      /*  String[] arr = name.split("\\. |\\? |\\! ");
        String [] arrn = new String[arr.length];

        for(int i =0; i < arr.length; i ++){

            String []ab = arr[i].split(" ");

            arrn[i] = ab[];

        }

        for(int i =0; i <arrn.length;i++){
            System.out.println(arrn[i]);
        }
*/
        System.out.println(solution2(name));


    }
    public static int solution2(String s) {
        String[] arr = s.split("\\. |\\? |\\! ");
        int maxvalue = 0;


        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].split(" ").length;
            if (maxvalue < len) {
                maxvalue = len;
            }
        }
        return maxvalue;
    }
/*
    public static int getMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int solution2(String s) {
        String[] arr = s.split("\\. |\\? |\\! ");

        int [] a = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            a[i] = arr[i].split(" ").length;
        }

        return getMaximum(a);

    }


    public static int solution(String s) {
        int count = 0;
        int j = 0;
        int []a = new int[s.length()];

        for ( int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            } else if (s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == '.') {
                if (j == 0) {
                    a[j] = count + 1;
                } else {
                    a[j] = count;
                }

                j++;
                count = 0;
            }
        }

        return getMaximum(a);
    }*/
}
