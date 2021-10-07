package intro.sample;

import java.util.Arrays;

public class SumSample3 {
    public static void main(String[] args) {
        // init array variables
        int[] array = {20, 30, 10, 50, 40};

        // init sum variable
        int sum = 0;

        // while loop for sum
        // for (int i = 0; i < array.length; i++) {
        //    sum += array[i];//合計に加算
        //}

        // init i variable
        int i = 0;
        while (array.length - i > 0) {
            sum += array[i];
            i++;
        }

        // output array contents
        System.out.println(Arrays.toString(array));

        // display sum value
        System.out.println("　配列の合計:" + sum);
    }
}
