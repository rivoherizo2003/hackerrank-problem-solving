package com.codemdg.dupliwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRemover{
    public String removeDuplicateWords(String input) {
        Pattern p = Pattern.compile("\\b(\\w+)\\s+\\1\\b");

        Matcher m = p.matcher(input);

        System.out.println("input="+input);

        if(m.matches()){
            System.out.println("group " + m.group(1));
        }
        return "";
    } 
}
