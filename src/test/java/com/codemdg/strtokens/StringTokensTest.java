package com.codemdg.strtokens;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StringTokensTest {
    @Test
    public void testInput03() throws FileNotFoundException, IOException {
        BufferedReader readerInput = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/strtokens/input03.txt"));
        BufferedReader readerOutput = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/strtokens/output03.txt"));
        StringTokens stringTokens = new StringTokens();
        String lineInput = readerInput.readLine();
        List<String> results = stringTokens.getToken(lineInput);
        String line;
        int i = 0;
        while ((line = readerOutput.readLine()) != null) {
            assertEquals(line, results.get(i));
            i++;
        }
        readerOutput.close();
        readerInput.close();
    }

    @Test
    public void testInput04() throws FileNotFoundException, IOException {
        BufferedReader readerInput = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/strtokens/input04.txt"));
        BufferedReader readerOutput = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/test/java/com/codemdg/strtokens/output04.txt"));
        StringTokens stringTokens = new StringTokens();
        String lineInput = readerInput.readLine();
        List<String> results = stringTokens.getToken(lineInput);
        String line;
        int i = 0;
        while ((line = readerOutput.readLine()) != null) {
            assertEquals(line, results.get(i));
            i++;
        }
        readerOutput.close();
        readerInput.close();
    }

}
