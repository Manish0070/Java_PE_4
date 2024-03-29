package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFrequencyIndex {
        public String sortingFunction(String inputString,String givenString) {
            if (inputString == null) {
                return "Should Not Be Null";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Pattern pattern = Pattern.compile(givenString);
                Matcher matcher = pattern.matcher(inputString);
                while (matcher.find()) {
                    stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
                }
                return stringBuffer.toString().trim();
            }
        }
    }
