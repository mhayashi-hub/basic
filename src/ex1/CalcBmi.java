package ex1;

import java.util.Scanner;

public class CalcBmi {
    /**
     * @param message
     * @return double
     */
    // add request : input value from keybord/standard input
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        // request : set variable body height and weight in program source
        // request : output body height(m), weight(kg), BMI, Appropriate weight(kg) to console
        // BMI formula : (body weight) / (body height)^2
        // Appropriate weight formula : 22 * (body height)^2

        // init variable : bodyHeight, bodyWeight, bmi, appropWeight
        double bodyHeight = 0, bodyWeight =0;
        double bmi=0, appropWeight=0;
        // internal variable : appropParam
        double appropParam = 22.0;
        // set variable : bodyHeight, bodyWeight
        // bodyHeight = 1.621;
        // bodyWeight = 88.6;
        // set value from stdin input
        bodyHeight = inputDouble("身長を入力してください(単位：m)：");
        bodyWeight = inputDouble("体重を入力してください(単位；kg)：");

        // calculation and internal variable : bodyHeightSquare
        double bodyHeightSq = 0;
        // bodyHeightSquare = (bodyHeight * bodyHeight);
        bodyHeightSq = Math.pow(bodyHeight,2);
        bmi = bodyWeight / bodyHeightSq;
        appropWeight =  appropParam * bodyHeightSq;

        // additional functions
        double bmiRTwoDc = Math.round(bmi*100.0)/100.0;
        double appropWeightRTwoDc = Math.round(appropWeight*100.0)/100.0;

        // output function
        System.out.println("入力情報：");
        System.out.println("身長：" + bodyHeight + " m : " + (bodyHeight * 100) + " cm");
        System.out.println("体重：" + bodyWeight + " kg");
        //
        System.out.println("\n出力情報：");
        // System.out.println("BMI：" + bmi);
        System.out.println("BMI：" + bmiRTwoDc);
        // System.out.println("適正体重：" + appropriateWeight + "kg");
        System.out.println("適正体重：" + appropWeightRTwoDc + " kg");
        // percentage with Two decimal point calculation
        System.out.println("適正体重と実体重の比率：" + Math.round(bodyWeight*10000.0/appropWeightRTwoDc)/100.0 + " %");

        // test param
        // bmiRTwoDc = 40.00 ;

        // add function at later
        // show function of fat/thin renge from BMI
        if (bmiRTwoDc >= 40) {
            System.out.println(" BMI " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(4度)");
        } else if (bmiRTwoDc >= 35) {
            System.out.println(" BMI " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(3度)");
        } else if (bmiRTwoDc >= 30) {
            System.out.println(" BMI " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(2度)");
        } else if (bmiRTwoDc >= 25) {
            System.out.println(" BMI " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(1度)");
        } else if (bmiRTwoDc >= 18.5) {
            System.out.println(" BMI " + bmiRTwoDc + "  日本肥満学会判定基準：普通体重");
        } else {
            System.out.println(" BMI " + bmiRTwoDc + "  日本肥満学会判定基準：低体重(痩せ型)");
        }
        // another-1
        if (bmiRTwoDc < 18.5) {
            System.out.println(" BMI  " + bmiRTwoDc + "  日本肥満学会判定基準：低体重(痩せ型)");
        } else {
            if (bmiRTwoDc < 25) {
                System.out.println(" BMI  " + bmiRTwoDc + "  日本肥満学会判定基準：普通体重");
            } else if (bmiRTwoDc < 30) {
                System.out.println(" BMI  " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(1度)");
            } else if (bmiRTwoDc < 35) {
                System.out.println(" BMI  " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(2度)");
            } else if (bmiRTwoDc < 40) {
                System.out.println(" BMI  " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(3度)");
            } else {
                System.out.println(" BMI  " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(4度)");
            }
        }
        // another-2
        if (bmiRTwoDc >= 40) {
            System.out.println(" BMI   " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(4度)");
        } else {
            if (bmiRTwoDc < 18.5) {
                System.out.println(" BMI   " + bmiRTwoDc + "  日本肥満学会判定基準：低体重(瘦せ型)");
            } else {
                if (bmiRTwoDc < 25) {
                    System.out.println(" BMI   " + bmiRTwoDc + "  日本肥満学会判定基準：普通体重");
                } else {
                    if (bmiRTwoDc < 30) {
                        System.out.println(" BMI   " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(1度)");
                    } else {
                        if (bmiRTwoDc < 35) {
                            System.out.println(" BMI   " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(2度)");
                        } else {
                            System.out.println(" BMI   " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(3度)");
                        }
                    }
                }
            }
        }
        // another-3
        if (bmiRTwoDc < 18.5) {
            System.out.println(" BMI    " + bmiRTwoDc + "  日本肥満学会判定基準：低体重(痩せ型)");
        } else if (bmiRTwoDc >= 40.0) {
            System.out.println(" BMI    " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(4度)");
        } else if (bmiRTwoDc < 40.0 && bmiRTwoDc >= 35.0) {
            System.out.println(" BMI    " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(3度)");
        } else if (bmiRTwoDc < 35.0 && bmiRTwoDc >= 30.0) {
            System.out.println(" BMI    " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(2度)");
        } else if (bmiRTwoDc < 30.0 && bmiRTwoDc >= 25.0) {
            System.out.println(" BMI    " + bmiRTwoDc + "  日本肥満学会判定基準：肥満(1度)");
        } else if (bmiRTwoDc < 25.0 && bmiRTwoDc >= 18.5){
            System.out.println(" BMI    " + bmiRTwoDc + "  日本肥満学会判定基準：普通体重");
        }
    }
}
