/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.util.Scanner;

/**
 *
 * @author 華美娟 <Maple Hua>
 */
public class 票價計算練習 {

    private static S_票券範本 客人;
    private static int 購買金額;
    private static String 購票明細;
    private static boolean 是否繼續買票;
    
    public static void 跑流程() {
        客人 = new S_票券範本();
        購買金額 = 0;
        購票明細 = "";
        購買();
        System.out.println("您的購票總金額為: " + 購買金額 + "\n" + 購票明細);
  
    }

    public static void 購買() {
        客人.選擇購票種類();
        購票明細 += 客人.購票張數() + " ";
        購買金額 += 客人.合計金額();

        是否繼續買票 = 工具.輸入01判斷資料1為真("目購票金額為: " + 購買金額 + "  " + 購票明細 + "\n"
                                           + "是否繼續購買?(0:不要, 1:繼續)");
        if (是否繼續買票) {
            購買();
        }
    }
}
