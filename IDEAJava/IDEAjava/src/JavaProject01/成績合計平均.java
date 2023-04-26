/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author 華美娟
 */
public class 成績合計平均 {

    public static String 名字;
    public static int 國文;
    public static int 英文;
    public static int 數學;
    public static int 會計;
    public static int 地球科學;
    public static int 總分;
    public static double 平均分數;

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

    public static void 顯示資料() {
        System.out.println("--- 顯示資料 ---");
        System.out.println("姓名:" + 名字);
        System.out.println("各科成績為:");
        System.out.println("國　　文: " + 國文);
        System.out.println("英　　文: " + 英文);
        System.out.println("數　　學: " + 數學);
        System.out.println("會　　計: " + 會計);
        System.out.println("地球科學: " + 地球科學);
        System.out.println("總　　分: " + 總分);
        System.out.println("平均分數: " + 平均分數);
        System.out.println("");
    }

    public static void 修改資料() {
        /*
        System.out.println("--- 修改資料 ---");
        名字 = "Tom";
        國文 = (int) (Math.random() * 101);
        英文 = (int) (Math.random() * 101);
        數學 = (int) (Math.random() * 101);
        會計 = (int) (Math.random() * 101);
        地球科學 = (int) (Math.random() * 101);
         */
        //改成輸入方式
        System.out.println("--- 輸入資料 ---");
        名字 = 工具.輸入文字資料("請輸入學生姓名: ");
        國文 = 工具.輸入整數資料("請輸入國文成績: ");
        英文 = 工具.輸入整數資料("請輸入英文成績: ");
        數學 = 工具.輸入整數資料("請輸入數學成績: ");
        會計 = 工具.輸入整數資料("請輸入會計成績: ");
        地球科學 = 工具.輸入整數資料("請輸入地球科學成績: ");

    }

    public static void 計算總分() {
        System.out.println("--- 計算總分 ---");
        System.out.println("");

        //總分 = 國文 + 英文 + 數學 + 會計 + 地球科學
        int score[] = {國文, 英文, 數學, 會計, 地球科學};
        總分 = 工具.加總(score);

    }

    public static void 計算平均() {
        System.out.println("--- 計算平均 ---");
        System.out.println("");
        //平均分數 = 總分 / 5.0;
        int score[] = {國文, 英文, 數學, 會計, 地球科學}; //用陣列方式 匯入
        平均分數 = 工具.平均(score);
    }

    public static void 評語() {
        if (平均分數 >= 90.0) {
            System.out.println("評語: 超棒");
        } else if (平均分數 >= 80.0) {
            System.out.println("評語: 很棒");
        } else if (平均分數 >= 70.0) {
            System.out.println("評語: 棒");
        } else {
            System.out.println("評語: 繼續努力!");
        }
    }

    public static void 跑流程() {
        設定初始值();
        //顯示資料();
        修改資料();
        計算總分();
        計算平均();
        顯示資料();
        評語();
    }
}
