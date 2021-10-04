package intro.operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // binary operator test
        // init variable : a,b
        int a=5, b=3;
        // arithmetic operation and output function
        System.out.println("算術演算子(二項)");
        System.out.println(a + " + " + b + " = " + (a + b));
        // result : 8
        System.out.println(a + " - " + b + " = " + (a - b));
        // result : 2
        System.out.println(a + " * " + b + " = " + (a * b));
        // result : 15
        System.out.println(a + " / " + b + " = " + (a / b));
        // result : 1
        System.out.println(a + " % " + b + " = " + (a % b));
        // result : 2
        // unary operator test
        // init variable : e,f
        int e = 1, f = 2;
        // unary operation and output function
        System.out.println("算術演算子(単項)");
        System.out.println("-e:" + -e);
        // result : -1
        System.out.println("e:" + e++);
        // result : 1
        System.out.println("f:" + ++f);
        // result : 3
        System.out.println("e++ + ++f:" + (e++ + ++f));
        // result : 6
        System.out.println("e:" + e);
        // result : 3
        System.out.println("f:" + f);
        // result : 4

        // widening test
        // init variable : c,d
        double c=5;
        int d=3;
        // widening operation and output function
        System.out.println(c + " + " + d + " = " + (c + d));
        // result : 8, type double -> 8.0
        System.out.println(c + " - " + d + " = " + (c - d));
        // result : 2, type double -> 2.0
        System.out.println(c + " * " + d + " = " + (c * d));
        // result : 15, type double -> 15.0
        System.out.println(c + " / " + d + " = " + (c / d));
        // result : 1.66, type double -> 1.66666...
        System.out.println(c + " % " + d + " = " + (c % d));
        // result : 2, type double -> 2.0

        // narrowing test
        // int variable : g,h
        int g;
        double h = 10;
        // g=h;
        g=(int)h;
        // explicit cast(type conversion)
        System.out.println("h:" + h);
        // result : 10.0 (type double)
        System.out.println("g:" + g);
        // result : 10 (type int)

        // assignment operator test
        // init variable : i,j
        int i,j;
        i=j=10;
        System.out.println("i:" + i);
        // result : 10
        System.out.println("j:" + j);
        // result : 10

        // compound assignment operator test
        // init variable : x
        int x = 1;
        System.out.println(x += 1);
        // result : 2 (type int)
        System.out.println(x *= 10);
        // result : 20
        System.out.println(x -= 2);
        // result : 18
        System.out.println(x /= 9);
        // result : 2
        System.out.println(x %= 3);
        // result : 2

    }
}
