package com.stackroute.pe4;

public class NamePrescence {
    public String nameChecker(String inputString){
        if(inputString.contains("Harry")){
            return "Is Harry Here? " +inputString.contains("Harry");
        }
        else{
            boolean result=inputString.contains("Harry");
            return "Is Harry Here?"+result;
        }
    }
}
