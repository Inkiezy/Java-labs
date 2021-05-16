package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws IOException {


        List<String> lines = Files.readAllLines(Paths.get("D:\\JAVAlab\\lab5\\File1.txt"), UTF_8);
        // double lat = 0;
        // double rus = 0;

        for (String s : lines) {
            System.out.println(s);
        }


        for (String s : lines) {
            int L = s.length();

            String lower = s.toLowerCase();
            char[] c = lower.toCharArray();
            //char[] d = lower.toCharArray();
            int[] freq = new int[200];
            //int[] freqr = new int[200];


            for (int i = 0; i < L; i++) {
                char character = s.charAt(i);
                int ascii = (int) character;

                if (ascii >= 65 && ascii <= 241) {
                    //++lat;
                    freq[(c[i] - 65)]++;
                }
                else
                    {

                }
            }
            System.out.println("Total chars " + c.length);
            //Arrays.sort(freq);
            for (int i = 0; i < 200; i++)
            {
                if (freq[i] != 0)
                    System.out.println(((char) (i + 65)) + "\t" + freq[i]);
            }

            // System.out.println(lat);
            // System.out.println(rus);
        }
        //String name = "admin";
        // int ascii = name.charAt(2);
        //System.out.println(ascii);

    }
}


