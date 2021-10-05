package ex;

public class MaxSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        // set temporal max variable
        int max = array[0];

        int markS = 0;
        for (int i=0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                markS = i;
            }
        }

        /*
        int i = 0, markS = 0;
        for (int num:array) {
            if (max < num) {
                max = num;
                mark = i;
            };
                i++;
            }
        */

        System.out.println("　配列の最大値：" + max + "　配列の要素の番号："+ markS );
    }
}
