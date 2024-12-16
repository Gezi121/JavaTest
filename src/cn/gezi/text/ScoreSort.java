package cn.gezi.text;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreSort {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5位学员的成绩");

        for(int i = 0; i < scores.length;i++){
            scores[i] = input.nextInt();
        }
        Arrays.sort(scores);
        System.out.println("学员成绩升序排序:");
        for(int a : scores){
            System.out.println(a);
        }

    }
}
