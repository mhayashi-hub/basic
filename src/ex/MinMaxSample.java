package ex;

public class MinMaxSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int max = array[0];
        int min = array[0];

        int markL = 0, markS = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                markL = i;
            } else if (min > array[i]) {
                min = array[i];
                markS = i;
            }
            System.out.println("　　配列の値：" + array[i] + "　配列要素の番号：" + i);
        }

        /*
        int i = 0, markL = 0, markS = 0;
        for (int num:array) {
            if (max < num) {
                max = num;
                markL = i;
            }
            if (min > num) {
                min = num;
                markS = i;
            }
            System.out.println("　　配列の値：" + num + "　配列要素の番号：" + i);
            i++;
        }
        */

        System.out.println("　配列の最大値：" + max + "　配列要素の番号：" + markL);
        System.out.println("　配列の最小値：" + min + "　配列要素の番号：" + markS);
    }
}
