package ex1;

import java.util.Scanner;

public class SwitchDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("好きな文章を入力してください。");
        String input = scanner.nextLine();
        System.out.println("選択キー番号を入力してください。");
        String select = scanner.nextLine();

        System.out.println("　入力文章：" + input);
        System.out.println("　選択キー番号：" + select);
    }
}