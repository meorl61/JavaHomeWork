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
public class 猜密碼 {

    public static int 密碼答案;
    public static int 電腦答案;
    public static int 猜次數;
    public static int 最小數;
    public static int 最大數;

    public static void 設定答案() {
        密碼答案 = (int) (Math.random() * 900) + 100;
        System.out.println("設定的密碼是: " + 密碼答案);
        猜次數 = 0;
        最小數 = 100;
        最大數 = 999;
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
                System.out.println("\n太厲害了, 1次就猜中了!! ");
            } else if (猜次數 <= 3) {
                System.out.println("\n不錯喔, 猜 " + 猜次數 + " 次就猜對了!!");
            } else {
                System.out.println("\n猜了 " + 猜次數 + " 次, 猜對了!!");
            }
        } else {  //繼續猜
            if (電腦答案 > 密碼答案) {
                最大數 = 電腦答案;
                System.out.println("電腦第" + 猜次數 + "次猜的密碼是: " + 電腦答案 + " (不對, 太大, 在 " + 最小數 + " ~ " + 最大數 + " 之間)");
                最大數--;
            } else {
                最小數 = 電腦答案;
                System.out.println("電腦第" + 猜次數 + "次猜的密碼是: " + 電腦答案 + " (不對, 太小, 在 " + 最小數 + " ~ " + 最大數 + " 之間)");
                最小數++;
            }
            電腦猜密碼();
        }
    }

    public static void 跑流程() {
        設定答案();
        電腦猜密碼();
    }
}
