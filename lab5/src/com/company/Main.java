package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws IOException {


        List<String> lines = Files.readAllLines(Paths.get("K:\\JAVAlab\\lab5\\File1.txt"), UTF_8);

        for (String s : lines) {
            System.out.println(s);
        }


        for (String s : lines) {
            int L = s.length();

            String lower = s.toLowerCase();
            char[] c = lower.toCharArray();
            int[] freq = new int[200];
            int[] freq1 = new int[2000];
            int[] a = new int[200];


            for (int i = 0; i < L; i++) {
                char character = s.charAt(i);
                int ascii = (int) character;

                if (ascii >= 65 && ascii <= 241) {

                    freq[(c[i] - 65)]++;

                } else if (ascii >= 1072 && ascii <= 1103) {
                    freq1[(c[i]-65)]++;

                }
            }


            System.out.println("Total chars " + c.length);
            for (int i = 0; i < 200; i++) {
                if (freq[i] != 0)

                    System.out.println(((char) (i + 65)) + "\t" + freq[i]);}

                for (int i = 0; i < 2000; i++) {
                    if (freq1[i] != 0)
                        System.out.println(((char) (i + 65)) + "\t" + freq1[i]);
                }

        }
    }
}


