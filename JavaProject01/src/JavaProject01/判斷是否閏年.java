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
public class 判斷是否閏年 {

    public static int 西元年;
    public static String 結果;

    public static void 初始設定(int 輸入年) {
        //西元年 = (int) (Math.random() * 3000)+1;
        西元年 = 輸入年;
        結果 = "不是閏年";
    }

    public static void 判斷並顯示() {

        //簡單寫法        
        if (西元年 % 4 == 0 && 西元年 % 100 != 0 || 西元年 % 400 == 0) {
            結果 = "閏年";
        }
        
        //複雜寫法
        /*
        if (西元年 % 400 == 0) {
            結果="閏年 (可被400整除)";
        } else if (西元年 % 100 == 0) {
            結果="不是閏年 (可被100整除)";
        } else if (西元年 % 4 == 0) {
            結果="閏年 (可被4整除)";
        }      
         */
        
        System.out.println("西元 " + 西元年 + " 年, " + 結果);
    }

    

    public static void 跑流程() {
        初始設定(12);
        判斷並顯示();
        
        初始設定(100);
        判斷並顯示();
        
        初始設定(1200);
        判斷並顯示();
        
        初始設定(400);
        判斷並顯示();
        
        初始設定(500);
        判斷並顯示();
        
        初始設定(800);
        判斷並顯示();
        
        初始設定( (int)(Math.random() * 3000)+1 );
        判斷並顯示();
        
    }

}
