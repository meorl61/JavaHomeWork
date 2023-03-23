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
public class 成績合計平均 {
    public static String 名字;
    public static int 國文;
    public static int 英文;
    public static int 數學;
    public static int 會計;
    public static int 地球科學;
    public static int 總分;
    public static int 平均分數;
    
    public static void 設定初始值() {
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("--- 自我挑戰：設計功能 計算總分()、計算平均() ---");
        System.out.println("=================================================");
        System.out.println("--- 設定初值 ---");
        System.out.println("");
        名字 = "none";
        國文 = -1;
        英文 = -1;
        數學 = -1;
        會計 = -1;
        地球科學 = -1;
        總分 = -1;
        平均分數 = -1;        
    }
    
    public static void 顯示資料(){
        System.out.println("--- 顯示資料 ---");
        System.out.println("姓名:" + 名字);
        System.out.println("各科成績為:");
        System.out.println("國　　文: "+ 國文);
        System.out.println("英　　文: "+ 英文);
        System.out.println("數　　學: "+ 數學);
        System.out.println("會　　計: "+ 會計);
        System.out.println("地球科學: "+ 地球科學);        
        System.out.println("總　　分: "+ 總分);
        System.out.println("平均分數: "+ 平均分數);
        System.out.println("");
    }
    
    public static void 修改資料(){
        System.out.println("--- 修改資料 ---");
        System.out.println("");
        名字     = "Tom";
        國文     = 90;
        英文     = 90;
        數學     = 100;
        會計     = 90;
        地球科學 = 90;       
        
    }
    
    public static void 計算總分() {
        System.out.println("--- 計算總分 ---");
        System.out.println("");
        總分 = 國文 + 英文 + 數學 + 會計 + 地球科學;        
    }
    
    public static void 計算平均() {
        System.out.println("--- 計算平均 ---");
        System.out.println("");
        平均分數 = 總分 / 5;        
    }

}
