package intro.sample;

import java.util.Arrays;

public class MaxMinSample3 {
    public static void main(String[] args) {
        // init array variables as int array type
        int[] array = {20,30,10,50,40};

        // set max and min value as temporal value
        int max = array[0];//仮の最大値として配列の最初の要素を代入
        int min = array[0];

        //判定処理をしつつ最大値を探す
        // for (int value:array) {
            //変数maxの値より比較した配列の要素が大きければ最大値を更新
        //    if (max < value) max = value;
        //}

        // init i variable
        int i = 0;
        // while loop and judge min, max
        while (array.length - i > 0) {
            if (max > array[i]) {
                max = array[i];
            } else if (min < array[i]) {
                min = array[i];
            }
            i++;
        }

        // output contents of array
        System.out.println(Arrays.toString(array));

        // display min and max value
        System.out.println("配列の最大値:" + max);
        System.out.println("配列の最小値:" + min);
    }
}
