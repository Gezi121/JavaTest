package cn.gezi.text;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 2024;
        if ((year % 4) == 0 || (year % 100) == 0 ){
            System.out.println("闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
