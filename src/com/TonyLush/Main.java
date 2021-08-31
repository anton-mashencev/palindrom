package com.TonyLush;

public class Main {

     static boolean isPalindrom = false;
    static String word = "6546564";

    public static void main(String[] args) {

        long beginTime = System.nanoTime();

        int lengthWord = word.length();
        String leftPart  = "";
        String rightPart = "";

        if (lengthWord == 1)
            return;

        if (lengthWord % 2 > 0) {
          int c = ((lengthWord + 1) / 2) ;
          String str = word.substring(c, lengthWord);
          rightPart = word.substring(0, c -1);

          for (int i = 0; i < str.length(); i++){
              leftPart = str.charAt(i) + leftPart;
          }
          if (rightPart.equals(leftPart)) {
              isPalindrom = true;
          }
        }
        else {
            String str = word.substring(lengthWord/2, lengthWord);
            rightPart = word.substring(0, lengthWord/2);
            for (int i = 0; i < str.length(); i++){
                leftPart = str.charAt(i) + leftPart;
            }
            if (rightPart.equals(leftPart)) {
                isPalindrom = true;
            }
        }

        System.out.println(isPalindrom);
        System.out.println(System.nanoTime() - beginTime);


    }
}
