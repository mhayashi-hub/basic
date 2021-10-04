package data;

public class Literal {
    public static void main(String[] args) {
        // integer literal
        int num1 = 10;
        // decimal number
        int num2 = 012;
        // octal number
        int num3 = 0xA;
        // hexadecimal number
        int num4 = 0b1010;
        // binary number
        // output function
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);

        // literal type explicit
        long num5 = 1L;
        // long type
        float num6 = 3.14f;
        float num7 = 3f;
        // float type
        double num8 = 3.335d;
        // double type

        // output function
        System.out.println("num5:" + num5);
        System.out.println("num6:" + num6);
        System.out.println("num7:" + num7);
        System.out.println("num8:" + num8);

        // float e expression
        double num9 = 0.123e+2;
        // 0.123*10^2
        double num10 = 0.123e-2;
        // 0.123*10^-2

        // output function
        System.out.println("num9:" + num9);
        System.out.println("num10:" + num10);

        // character literal
        char c1 = 'A';
        // one character in ''(single quot)
        char c2 = '\u0041';
        // unicode expression in '' with "\\u"
        char c3 = 65;
        // character code number in unicode as literal integer

        // output function
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);

        // string type
        String str1 = "abc";
        // string type set in ""(double quot)
        String str2 = "あいうえを";
        // quot and special expression and description
        String str3 = "\"猫\"\n\"    犬\"\n\t\t\"狼\"";
        // output function
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
    }
}
