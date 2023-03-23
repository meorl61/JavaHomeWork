/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author user
 */
public class 攝氏轉華氏 {
    public static int degree;
    public static int wd;
    
    public static void setstartdata(){
        System.out.println("");
        System.out.println("=================================");
        System.out.println("--- 自我挑戰：攝氏 換算 華氏 ---");        
        System.out.println("=================================");
        System.out.println("--- 設定初始值 ---");
        System.out.println("");
        degree = -1;
        wd = -1;
    }
    public static void editandcalcdata() {
        System.out.println("--- 修改及計算 ---");
        System.out.println("");
        degree = 100;
        wd = degree * 9/5 + 32;        
    }
    
    public static void showdata(){
        System.out.println("--- 顯示資料 ---");
        System.out.println("攝氏溫度為: " + degree + " 度");
        System.out.println("華氏溫度為: " + wd + " 度");
        System.out.println("");
    }
}
