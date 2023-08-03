package com.havad.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-03 11:15
 **/

public class FileToWords {
    public static Stream<String> stream(String fileName) throws Exception{
        return Files.lines(Paths.get(fileName))
                .skip(1)
                .flatMap(line ->
                        Pattern.compile("\\W+").splitAsStream(line));
    }
}
