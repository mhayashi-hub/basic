package intro.sample;

import java.util.Arrays;

public class Continue {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5,-6,-7,8,9,10,-11};
        System.out.println(Arrays.toString(array));

        //負の数値を発見したらスキップする
        for (int value:array) {
            if (value<0) continue;//負の数ならスキップ
            System.out.println(value);//1 2 4 5
        }
    }
}
