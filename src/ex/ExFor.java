package ex;

public class ExFor {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        // init sum variable
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            System.out.println("　配列の値：" + array[i]);
            sum += array[i];
        }
        System.out.println("　合計値：" + sum);
    }
}
