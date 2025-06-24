package com.codemdg.strtokens;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.codemdg.dupliwords.DuplicateWordsRemover;

public class StringTokensTest {
    @Test
    public void testInput01() throws FileNotFoundException,IOException {
        BufferedReader readerInput = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/strtokens/input03.txt"));
        BufferedReader readerOutput = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/strtokens/output03.txt"));

        int q = Integer.parseInt(readerInput.readLine().trim());

        String lineOutput, lineInput, lineInputDupliWordsRemoved;
        DuplicateWordsRemover remover = new DuplicateWordsRemover();
        for (int i = 1; i <= q; i++) {
            lineInput = readerInput.readLine().trim();
            lineOutput = readerOutput.readLine().trim();

            lineInputDupliWordsRemoved = remover.removeDuplicateWords(lineInput);
            assertEquals(lineOutput, lineInputDupliWordsRemoved);
        }
        readerOutput.close();
        readerInput.close();

    }
}
