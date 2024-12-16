package cn.gezi.l1;

public class GoodsBizText {
    public static void main(String[] args) {
        Goods goods = new Goods();
        GoodsBiz goodsBiz = new GoodsBiz();

        goodsBiz.addGoods(goods,0);
        goodsBiz.setGoods(0,32,"abc",2,30);
        goodsBiz.showGoods(0);
    }
}
