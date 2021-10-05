package ex1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchDisplay {
    /**
     * @param message setmessage
     * @return String
     */
     public static String inputStr(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }

    public static void main(String[] args) {
        String inputMessage = "";
        String selectKeyDisplay = "";

        inputMessage = new inputStr("好きな文章を入力してください。");
        selectKeyDisplay = new inputStr("選択キー番号を入力してください。");
    }
}