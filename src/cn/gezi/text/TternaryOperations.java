package cn.gezi.text;

import java.util.Scanner;

public class TternaryOperations {

    public static void main(String[] args) {

        int a = 4,b=3;
        System.out.println(a < b ? 3 : 2);

        Scanner input = new Scanner(System.in);

        a = input.nextInt();

        System.out.println(a <= 5?"是工作日":"不是工作日");


    }
}
