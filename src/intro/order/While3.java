package intro.order;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("パスワードを入力してください。");
        String str = in.nextLine();

        String passkey = "abcdd";
        // String passkey = null;

        while (!passkey.equals(str)) {
            System.out.println("パスワードが違います。");
            str = in.nextLine();
        }
        System.out.println("パスワードはOKです。");
    }
}
