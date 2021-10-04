package intro.order;

public class If2 {
    public static void main(String[] args) {
        // init loop param
        int num = 101;
        // nest if sentence example
        if (num >= 0) {
            if (num <= 100) {
                System.out.println(" " + num + " は0-100の範囲内である。");
            } else {
                System.out.println(" " + num + " は100以下の範囲外である。");
            }
        } else {
            System.out.println(" " + num + " は0以上の範囲外である。");
        }
        // if sentence with logic operator
        if (num >= 0 && num <= 100) {
            System.out.println(" " + num + " は0-100の範囲内である。");
        } else {
            System.out.println(" " + num + " は0-100の範囲外である。");
        }
    }
}
