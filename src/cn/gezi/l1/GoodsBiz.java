package cn.gezi.l1;

public class GoodsBiz {
    Goods[] goods = new Goods[50];

    public void addGoods(Goods goods,int i){
        this.goods[i] = goods;
    }
    public void setGoods(int i,int id,String name,int num,int price){
        goods[i].id = id;
        goods[i].name = name;
        goods[i].num = num;
        goods[i].price = price;

    }
    public void showGoods(int i){
        goods[i].showInfo();
    }

}
