package intro.sample;

import java.util.Arrays;

public class AveSample3 {
    public static void main(String[] args) {
        // init array variables
        int[] array = {20,30,10,50,40,25,32};

        // init sum variable
        int sum = 0;

        // init ave variable
        double ave = 0;

        //反復処理をしつつ合計を求める
        // for (int i = 0; i < array.length; i++) {
        //    sum += array[i];//合計に加算
        //}
        // init i variable
        int i = 0;
        // while lopp to calcurate sum
        while (array.length - i > 0) {
            sum += array[i];
            i++;
        }

        // output contents of array
        System.out.println(Arrays.toString(array));

        // calcurate average
        ave = (double) sum / array.length;//double型へキャストしないと整数になります
        // round average at Two decimal
        double aveRt = Math.round((double)sum*100.0/array.length)/100.0;

        // display ave value
        System.out.println("平均:" + ave);
        System.out.println("平均(小数点第三位以下四捨五入):" + aveRt);
    }
}
