package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public final class Text {
    public static void main(String[] args) throws IOException {
        Path File1 = Files.createFile(Paths.get("D:\\JavaFiles\\File1.txt"));
        System.out.println(Files.exists(Paths.get("D:\\JavaFiles\\File1.txt")));
    }
}
