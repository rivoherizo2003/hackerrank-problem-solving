package com.codemdg.dupliwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRemover {
    public String removeDuplicateWords(String input) {
        Pattern pattern = Pattern.compile("\\b(\\w+)(?:\\s+\\1\\b)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            input = input.replaceAll(matcher.group(0), matcher.group(1));
        }

        return input;
    }
}
