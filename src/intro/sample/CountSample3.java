package intro.sample;

import java.util.Arrays;

public class CountSample3 {
    public static void main(String[] args) {
        // init array variables
        int[] array = {-10,15,0,30,-20, -5, -11, 12, 34};

        // init count variable
        int count = 0;
        int countZ = 0;
        int countM = 0;

        //反復処理をしつつ０以上の数の個数を数える
        //for (int i = 0; i < array.length; i++) {
            //配列の要素が正の数ならカウントを増やす
        //    if (array[i] >= 0) count++;
        //}
        // init i value
        int i = 0;
        // while loop
        while (array.length - i > 0) {
            if (array[i] >= 0) {
                count++;
            } else if (array[i] < 0) {
                countM++;
            };
            if (array[i] == 0) {
             countZ++;
            };
            i++;
        }

        // output contents of array
        System.out.println(Arrays.toString(array));

        // display count value
        System.out.println("0以上のデータの個数:" + count);
        System.out.println("0の個数:" + countZ);
        System.out.println("0未満のデータの個数:" + countM);
    }
}
