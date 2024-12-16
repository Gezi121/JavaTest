package cn.gezi.Whilefor;

public class GoldenSectionpPoint {
    public static void main(String[] args) {
        int[] a = {0,0};
        double b = 0,h=0;
        for (int i = 1;i <= 20;i++){
            for (int j = 1;j  <= 20;j++){
                if (i % 2 ==0 && j % 2 ==0){
                    continue;

                }
                double c = (double) i / j;
                double e = Math.abs(c - 0.618);

                if(b == 0){
                    b = c;
                }else {
                    if (e < b){
                        b = e;
                        h = c;
                        a[0] = i;
                        a[1] = j;




                    }
                }


            }


        }
        System.out.printf("最接近:%f i=%d j=%d",h,a[0],a[1]);
    }
}
