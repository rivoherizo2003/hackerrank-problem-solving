package com.codemdg.strtokens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringTokens {
    public List<String> getToken(String input) {
        String[] results = input.trim().split("[^a-zA-Z0-9]|\\n|\\t|\\v|\\h|\\u0000");
        List<String> ret = new ArrayList<String>();
        ret.add(0, "0");;
        for (String result : results) {
            if (!result.isEmpty()) {
                ret.add(result);
            }
        }
        ret.set(0, String.valueOf(ret.size()-1));

        return ret;
    }
}
