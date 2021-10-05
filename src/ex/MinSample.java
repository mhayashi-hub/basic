package ex;

public class MinSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int min = array[0];

        int markL = 0;
        for (int i=0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                markL = i;
            }
        }

        /*
        int i = 0, mark = 0;
        for (int num:array) {
            if (min > num) {
                min = num;
                mark = i;
            }
                i++;
            }
        */

        System.out.println("　配列の最小値：" + min + "　配列の要素の番号：" + markL);
    }
}
