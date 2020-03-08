package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InverseCaptcha {

    public static int solveCaptcha(String content) {
        int sum = 0;
        int firstChar=Character.getNumericValue(content.charAt(0));
        for (int i = 0; i <content.length() ; i++) {
            int current = Character.getNumericValue(content.charAt(i));
            int next;
            if(i==content.length()-1){
                next=firstChar;
            }
            else {
            next=Character.getNumericValue(content.charAt(i + 1));
            }
            if(current == next){
                sum=sum+current;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("src/files/PuzzleInput1.txt")));
        System.out.println(solveCaptcha(content.trim()));
    }
}