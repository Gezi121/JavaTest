package cn.gezi.l1;

public class Goods {
    public int id;
    public String name;
    public double price;
    public int num;
    public void showInfo(){
        System.out.printf("Id:%d name:%s price:%f num:%d",id,name,price,num);
    }
}
