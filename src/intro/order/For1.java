package intro.order;

public class For1 {
    public static void main(String[] args) {
        // init variable
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(" " + i + "回目：" + sum);
        }
    }
}
