package cn.gezi.text;

public class Avg {
    public static void main(String[] args) {
        int avg1 = 50;
        if (avg1 > 90) {
            System.out.println("优秀");
        }else if(avg1 > 80){
            System.out.println("良好");
        }else if(avg1 > 70){
            System.out.println("中等");
        }else if(avg1 > 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
