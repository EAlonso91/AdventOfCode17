package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InverseCaptcha2 {



    public static int solveCaptcha(String content) {
        int sum = 0;
        int step = content.length()/2;
        for (int i = 0; i <content.length() ; i++) {
            int current = Character.getNumericValue(content.charAt(i));
            int nextPos = goThroughList(i, step);
            int next=Character.getNumericValue(content.charAt(nextPos));
            if(current == next){
                sum=sum+current;
            }
        }

        return sum;
    }

    private static int goThroughList(int origin, int step) {
        int listLength = step*2;
        int destination=origin+step;
        if(destination<listLength){
            return destination;
        }
        else{
            return destination-listLength;
        }


    }

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("src/files/PuzzleInput1.txt")));
        System.out.println(solveCaptcha(content.trim()));
    }
}