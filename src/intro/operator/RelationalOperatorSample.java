package intro.operator;

public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = 54;
        // num > 0
        System.out.println("numが0より大きな数であるか： " + (num > 0));
        // num >= 10
        System.out.println("numが10以上であるか： " + (num >= 10));
        // num <= -20
        System.out.println("numが-20以下であるか： " + (num <= -20));
        // num <= 100
        System.out.println("numが100以下であるか： " + (num <= 100));
        // is num odd? or even?
        System.out.println("numが奇数であるか： " + (num % 2 != 0));
        // is num multiple of 3?
        System.out.println("numが3の倍数であるか： " + (num % 3 == 0));
        // is num >= 0 and <=100
        System.out.println("numが0以上かつ100以下か： " + (num <= 100 && num >= 0));
    }
}
