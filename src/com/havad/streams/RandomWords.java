package com.havad.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: OnJavaStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-01 17:50
 **/

public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);
    RandomWords(String fileName) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        for (String line : lines.subList(1, lines.size())){
            words.addAll(Arrays.asList(line.split("[ .?,]+")));
        }
    }

    @Override
    public String toString() {
        return String.join("", words);
    }

    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }


    public static void main(String[] args) throws IOException {
        System.out.println(
                Stream.generate(new RandomWords("/Users/macmini/IdeaProjects/OnJavaStudy/src/com/havad/streams/Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining())
        );
    }
}
