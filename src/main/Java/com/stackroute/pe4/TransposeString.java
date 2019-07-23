package com.stackroute.pe4;

public class TransposeString {
    public static String reverseWord(String inputString) {
        if (inputString == null) {
            return "Should Not Be Null";
        } else {
            String words[] = inputString.split(" ");
            String reverseWord = "";
            for (String w : words) {
                StringBuilder sb = new StringBuilder(w);
                sb.reverse();
                reverseWord = reverseWord + sb.toString() + " ";
            }
            return reverseWord.trim();
        }
    }
}
