package ex;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

//じゃんけん
public class Rps {
    public static void main(String[] args) {
        //乱数の発生
        Random random = new Random(LocalDateTime.now().getSecond());
        int cpu = random.nextInt(3);//0,1,2の三種類の値が発生する

        //プレイヤーの手の入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの手を選んでください");
        System.out.println("0.グー 1.チョキ 2.パー");
        int player = scanner.nextInt();

        //CPUの手を表示
        switch (cpu) {
            case 0:
                System.out.println("CPU:グー");
                break;
            case 1:
                System.out.println("CPU:チョキ");
                break;
            case 2:
                System.out.println("CPU:パー");
                break;
        }

        //CPUの手を表示
        switch (player) {
            case 0:
                System.out.println("あなた:グー");
                break;
            case 1:
                System.out.println("あなた:チョキ");
                break;
            case 2:
                System.out.println("あなた:パー");
                break;
        }

        //勝敗の結果表示
        /*
        if (player == cpu) {
            System.out.println("あいこ");
        } else if (player == 0) {
            if (cpu == 1) {
                System.out.println("あなたの勝ちです");
            } else if (cpu == 2) {
                System.out.println("あなたの負けです");
            }
        } else if (player == 1) {
            if (cpu == 2) {
                System.out.println("あなたの勝ちです");
            } else if (cpu == 0) {
                System.out.println("あなたの負けです");
            }
        } else if (player == 2) {
            if (cpu == 0) {
                System.out.println("あなたの勝ちです");
            } else if (cpu == 1) {
                System.out.println("あなたの負けです");
            }
        } else {
            System.out.println("処理エラー");
        }
        */
        /*
        if (player == cpu) {
            System.out.println("あいこです");
        } else if (player == 0 && cpu == 1
                || player == 1 && cpu == 2
                || player == 2 && cpu == 0) {
                System.out.println("あなたの勝ちです");
        } else if (player == 0 && cpu == 2
                || player == 1 && cpu == 0
                || player == 2 && cpu == 1) {
                System.out.println("あなたの負けです");
        } else {
            System.out.println("処理エラー");
        }
         */
        if (player == cpu) {
            System.out.println("あいこです");
        } else if ((cpu - player == 1)||(cpu - player == -2)) {
            System.out.println("あなたの勝ちです");
        } else if ((cpu - player == -1)||(cpu - player == 2)) {
            System.out.println("あなたの負けです");
        } else {
            System.out.println("処理エラー");
        }
    }
}