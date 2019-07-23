package com.stackroute.pe4;

public class CharacterCount {
    public String countCharacter(String inputCharacter, String inputString) {
        if (inputString == null) {
            return "Should Not Be Null";
        } else {
            System.out.println("Length Of String:" + inputString.length());
            System.out.println("Length Of String Without a :" + inputString.replace("a", "").length());
            int characterCount = inputString.length() - inputString.replaceAll(inputCharacter, "").length();
            System.out.println("Occurrence Of A Char In String: " + characterCount);
            return "count is "+characterCount;
        }
    }

}


