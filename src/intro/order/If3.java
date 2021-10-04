package intro.order;

public class If3 {
    public static void main(String[] args) {
        // multiple branch example
        // request: judge rank by point, 80 or over : A, 70-79 : B, 60-69 : C, 0-59 : D
        // sample score set
        int score = 74;
        // judge function with if sentence
        if (score >= 80) {
            System.out.println(" " + score + " rank : A");
        } else if (score >= 70) {
            System.out.println(" " + score + " rank : B");
        } else if (score >= 60) {
            System.out.println(" " + score + " rank : C");
        } else {
            System.out.println(" " + score + " rank : D");
        }
    }
}
