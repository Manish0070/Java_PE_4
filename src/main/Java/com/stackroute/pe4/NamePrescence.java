package com.stackroute.pe4;

import java.util.regex.Pattern;

public class NamePrescence {
    public String stringMatcher(String inputString) {
        String result="";
        result = "Is Harry here ? "+inputString.matches(".*Harry.*");
        return result;
    }
}
