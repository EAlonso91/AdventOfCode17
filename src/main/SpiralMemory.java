package main;

import java.awt.*;

public class SpiralMemory {
    public static void main(String[] args) {
        System.out.println(calculateSteps(312051));
    }

    public static int calculateSteps(int squareNum) {
        Point startingPoint = calculateCoordinates(squareNum);
        return manhattanDistance(0,startingPoint.x,0,startingPoint.y);
    }

    private static Point calculateCoordinates(int squareNum) {
        Point p = new Point();
        int sum=0;
        for (int i = 1; sum < squareNum; i++) {
            if(isOdd(i)){
                if(sum+i>=squareNum){
                    p.x+=((squareNum-1)-sum);
                    break;
                }
                else {
                    p.x += i;
                }
                sum+=i;
                if(sum+i>=squareNum){
                    p.y+=((squareNum-1)-sum);
                }
                else {
                    p.y += i;
                }
                sum+=i;
            }
            else{
                if(sum+i>=squareNum){
                    p.x-=((squareNum-1)-sum);
                    break;
                }
                else {
                    p.x -= i;
                }
                sum+=i;
                if(sum+i>=squareNum){
                    p.y-=((squareNum-1)-sum);
                }
                else {
                    p.y -= i;
                }
                sum+=i;
            }

        }
        return p;
    }

    private static boolean isOdd(int i) {
        if((i%2)==0)
            return false;
        else
            return true;
    }

    private static int manhattanDistance(int x0, int x1, int y0, int y1){
        return Math.abs(x1-x0) + Math.abs(y1-y0);
    }
}
