package cn.gezi.l2;

public class Customer {
    public int id;
    public String username;
    public String sex;
    public int age;
    public String tel;

    public void showInfo(){
        System.out.printf("id:%d name:%s sex:%s age:%d tel:%s",id,username,sex,age,tel);
    }
}
