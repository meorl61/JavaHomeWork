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
public class 判斷是否閏年 {

    public static int 西元年;
    public static String 結果;
    public static String 是否繼續查詢;

    public static void 初始設定() {
        //西元年 = (int) (Math.random() * 3000)+1;
        西元年 = 工具.輸入整數資料("請輸入要查詢的西元年");
        結果 = "不是閏年";        
    }

    public static void 判斷並顯示() {

        //簡單寫法        
        /*
        if (西元年 % 4 == 0 && 西元年 % 100 != 0 || 西元年 % 400 == 0) {
            結果 = "閏年";
        }        
        */
        
        //複雜寫法
        
        if (西元年 % 400 == 0) {
            結果="閏年 (可被400整除)";
        } else if (西元年 % 100 == 0) {
            結果="不是閏年 (可被100整除)";
        } else if (西元年 % 4 == 0) {
            結果="閏年 (可被4整除)";
        }              
        
        System.out.println("西元 " + 西元年 + " 年, " + 結果);
                
    }  

    public static void 跑流程() {
        初始設定();
        判斷並顯示();                
        
        是否繼續查詢 = 工具.輸入文字資料("是否繼續查詢?(Y/N)");
        
        //字串比對要用 .equals 用 == 無效
        if (是否繼續查詢.equals("Y") || 是否繼續查詢.equals("y")) {
            System.out.println("~~ 再查一次 ~~");
            跑流程();
        }
    }

}
