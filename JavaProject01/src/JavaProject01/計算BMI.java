/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class 計算BMI {

    public static double weight;
    public static double height;
    public static double BMI;

    public static void 設定初值() {
        System.out.println("--- 設定初值 ---");
        weight = 55;
        height = 169;
        BMI = -1;

    }

    public static void 計算() {
        System.out.println("--- 計算BMI ---");
        BMI = weight / Math.pow(height / 100, 2);
        BMI = Math.round(BMI * 100.0) / 100.0;  //取小數2位

    }

    public static void 顯示BMI() {
        System.out.println("--- 顯示BMI ---");
        System.out.println("身高: " + height);
        System.out.println("體重: " + weight);
        System.out.println("BMI: " + BMI);
    }

    public static void 評語() {
        //System.out.println("--- 顯示BMI ---");
        //System.out.println(BMI);        
        if (BMI >= 35.0) {
            System.out.println("重度肥胖: BMI≧35");
        } else if (BMI >= 30.0) {
            System.out.println("中度肥胖: 30≦BMI＜35");
        } else if (BMI >= 27.0) {
            System.out.println("輕度肥胖: 27≦BMI＜30");
        } else if (BMI >= 24.0) {
            System.out.println("過重: 24≦BMI＜27");
        } else if (BMI >= 18.5) {
            System.out.println("正常範圍: 18.5≦BMI＜24");
        } else {
            System.out.println("體重過輕: BMI ＜ 18.5");
        }
    }

    public static void 跑流程() {
        設定初值();
        計算();
        顯示BMI();
        評語();
    }
}
