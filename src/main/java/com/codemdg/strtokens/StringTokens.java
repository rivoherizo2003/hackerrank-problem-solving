package com.codemdg.strtokens;

import java.util.ArrayList;
import java.util.List;

public class StringTokens{
    public List<String> getToken(String input){
        String[] results = input.split("(\\W+)");
        List<String> ret = new ArrayList<String>();
        for(String result : results){
            ret.add(result);
        }

        return ret;
    }
}
