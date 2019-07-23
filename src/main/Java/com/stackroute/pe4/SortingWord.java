package com.stackroute.pe4;

import java.util.Arrays;

public class SortingWord {
    public String[] stringInput(String paragraph) {

        if (paragraph == null) {
        }

        String[] string = paragraph.split("[\\s,]+");
        Arrays.sort(string);
        return string;
    }
}