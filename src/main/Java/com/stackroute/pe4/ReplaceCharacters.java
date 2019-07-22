package com.stackroute.pe4;

public class ReplaceCharacters {
    public String characterReplace(String inputString,char inputCharacter) {
        if (inputString == null) {
            return "Not Null";
        } else {
            String required;
            required = inputString.replace('M', 'm');
            return required;
        }
    }
}
