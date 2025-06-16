package com.codemdg.dupliwords;

import java.io.BufferedReader;
import java.io.FileReader;
import com.codemdg.dupliwords.DuplicateWordsRemover;
import org.junit.Test;

public class DuplicateWordsTest {

    @Test
    public void testInput01() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/test/java/com/codemdg/dupliwords/input01.txt"));

        int q = Integer.parseInt(reader.readLine().trim());
String s = "";
    DuplicateWordsRemover remover = new DuplicateWordsRemover();        
        for (int i = 1; i <= q; i++) {
            String line = reader.readLine().trim();
            s = remover.removeDuplicateWords(line);
            System.out.println("s="+s);
        }

        reader.close();
    }
}
