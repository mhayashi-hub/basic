package ex;

public class ExFor {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        // init sum variable
        int sum = 0;
        double avg = 0;
        for (int i=0; i < array.length; i++) {
            System.out.println("　配列の値：" + array[i]);
            sum += array[i];
        }
        avg = (double)sum / array.length * 1.00;
        System.out.println("　合計値：" + sum);
        System.out.println("　配列の平均値：" + avg);
    }
}
