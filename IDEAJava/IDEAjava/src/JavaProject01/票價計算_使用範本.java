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
public class 票價計算_使用範本 {

    private static S_票券範本 客人 = new S_票券範本();
    private static int 購買金額 = 0;
    private static String 購票明細 = "";
    public int 購買張數[] = {0, 0, 0, 0, 0, 0};

    public static void 跑流程() {
        購買();
        列印購票明細();        
    }

    public static void 購買() {
        客人.選擇購票種類();

        if (客人.票券種類 != 0) {

            客人.購票張數();

            if (是否繼續購買()) {
                購買();
            }
        }
    }

    public static boolean 是否繼續購買() {
        return 工具.輸入01判斷資料1為真("目購票金額為: " + 客人.總價 + "  " + 購票明細 + "\n"
                + "是否繼續購買?(0:不要, 1:繼續)");
    }

    public static void 列印購票明細() {
        System.out.println("～ 購票明細 ～");
        for (int i = 1; i < 6; i++) {

            if (客人.購買張數s[i] > 0) {
                System.out.println("購買" + 客人.票券類型[i] + 客人.購買張數s[i] + "張   " + (客人.購買張數s[i] * 客人.票券金額[i]) );
            }
        }        
        System.out.println("========================");
        System.out.println("總計票價: " + 客人.總價);
    }
}
