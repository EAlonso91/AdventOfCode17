package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CorruptionChecksum {

    public static void main(String[] args) throws IOException {


        System.out.println(calculateChecksum("src/files/PuzzleInput2.txt"));
    }

    public static int calculateChecksum(String file) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(file));
        List<String[]> list = new ArrayList<>();
        list = stream
                .map(String::trim)
                .map(s -> s.split("\t"))
                //.forEach(s -> System.out.println(s.length));
                .collect(Collectors.toList());
        int sum = 0;
        for (String[] row:list) {
            int max=-1;
            int min=Integer.MAX_VALUE;
            for (String num:row) {
                if (Integer.parseInt(num) > max) {
                    max=Integer.parseInt(num);
                }
                if (Integer.parseInt(num) < min) {
                    min=Integer.parseInt(num);
                }
            }
            sum+=(max-min);
        }
        return sum;
    }
}
