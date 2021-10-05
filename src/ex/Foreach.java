package ex;

public class Foreach {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0;
        double avg = 0.0;
        for (int num:array) {
            sum += num;
        }

        avg = (double)sum / array.length;
        System.out.println("　合計値：" + sum);
        System.out.println("　配列の平均値：" + avg);
    }
}
