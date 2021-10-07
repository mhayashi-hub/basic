package intro.sample;

import java.util.Arrays;

public class DoubleLoop {
    public static void main(String[] args) {
        // double dimension arrays
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array[0]));
        System.out.println(array[0][2]);
        System.out.println(array[2][0]);
        System.out.println(array[1][0]);
        System.out.println("\n");

        for (int i =0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i,jの順番の場合："+array[i][j]);
                System.out.println("j,iの順番の場合："+array[j][i]);
            }

        }
    }
}
