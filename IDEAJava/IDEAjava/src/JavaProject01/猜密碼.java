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
public class 猜密碼 {

    public static int 密碼答案;
    public static int 電腦答案;
    public static int 猜次數;
    public static int 最小數;
    public static int 最大數;
    public static int 挑戰位數;
    public static int 挑戰次數 = 0;

    public static void 設定答案() {

        if (挑戰位數 <= 1) {
            挑戰位數 = 1;
            最小數 = 0;
        } else {
            最小數 = (int) (Math.pow(10, 挑戰位數 - 1));  //10的N-1次方 , Math.pow(a,b); 次方函式 a 的 b 次方
        }
        最大數 = (int) (Math.pow(10, 挑戰位數)) - 1;  // 10的N次方 -1

        密碼答案 = (int) (Math.random() * (最大數 - 最小數 + 1)) + 最小數;

        System.out.println("~~第" + 挑戰次數 + "次, 開始挑戰猜 " + 挑戰位數 + " 位數密碼~~");
        System.out.println("設定的密碼是: " + 密碼答案);

        猜次數 = 0;
    }

    public static void 電腦猜密碼() {
        猜次數++;
        電腦答案 = (int) (Math.random() * (最大數 - 最小數 + 1)) + 最小數;
        顯示是否猜中();
    }

    public static void 顯示是否猜中() {
        if (密碼答案 == 電腦答案) {
            System.out.println("電腦第" + 猜次數 + "次猜的密碼是: " + 電腦答案 + " (答對了)");
            //評語
            if (猜次數 == 1) {
                System.out.println("太厲害了, 1次就猜中了!!\n ");
            } else if (猜次數 <= 3) {
                System.out.println("不錯喔, 猜 " + 猜次數 + " 次就猜對了!!\n");
            } else {
                System.out.println("猜了 " + 猜次數 + " 次, 猜對了!!\n");
            }
        } else {
            if (電腦答案 > 密碼答案) {
                最大數 = 電腦答案 - 1;
                System.out.println("電腦第" + 猜次數 + "次猜的密碼是: " + 電腦答案 + " (不對, 太大, 在 " + 最小數 + " ~ " + 最大數 + " 之間)");
            } else {
                最小數 = 電腦答案 + 1;
                System.out.println("電腦第" + 猜次數 + "次猜的密碼是: " + 電腦答案 + " (不對, 太小, 在 " + 最小數 + " ~ " + 最大數 + " 之間)");
            }
            //繼續猜
            電腦猜密碼();
        }
    }

    public static void 跑流程() {

        if (挑戰次數 < 3) {
            挑戰次數++;
            挑戰位數 = (int) (Math.random() * 5) + 1;
            設定答案();
            電腦猜密碼();
            跑流程();
        }
    }
}
