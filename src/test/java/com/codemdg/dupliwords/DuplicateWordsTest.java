package com.codemdg.dupliwords;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.Test;

public class DuplicateWordsTest {

    @Test
    public void testInput01() throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/dupliwords/input01.txt"));
        BufferedReader readerOutput = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/test/java/com/codemdg/dupliwords/output01.txt"));

        int q = Integer.parseInt(reader.readLine().trim());
        
        String lineOutput, lineInput, lineInputDupliWordsRemoved;
        DuplicateWordsRemover remover = new DuplicateWordsRemover();
        for (int i = 1; i <= q; i++) {
            lineInput = reader.readLine().trim();
            lineOutput = readerOutput.readLine().trim();

            lineInputDupliWordsRemoved = remover.removeDuplicateWords(lineInput);
            assertEquals(lineOutput, lineInputDupliWordsRemoved);
        }
        readerOutput.close();
        reader.close();
    }
}
