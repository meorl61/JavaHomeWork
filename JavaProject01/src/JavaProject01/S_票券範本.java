/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author 華美娟 <Maple Hua>
 */
public class S_票券範本 {

    public static String 票券類型[] = {"", "全票", "優待票", "兒童票", "早鳥票", "愛心票"};
    public static int 票券金額[] = {0, 310, 290, 260, 280, 155};
    public int 購買張數;
    public int 票券種類;

    public void 選擇購票種類() {
        this.票券種類 = (工具.輸入整數資料("請問你要購買何種票券?(0:離開, 1:全票, 2:優待票, "
                + "3:兒童票, 4:早鳥票, 5:愛心票"));

        if (this.票券種類 < 0 || this.票券種類 > 5) {
            System.out.println("輸入錯誤, 請輸入 0～5 的數字!!");
            選擇購票種類();
        }
    }

    public String 購票張數() {

        this.購買張數 = 工具.輸入整數資料(票券類型[this.票券種類] + "一張 " + 票券金額[this.票券種類] + " 元, 請問你要買幾張?");

        if (this.購買張數 < 0) {
            System.out.println("輸入錯誤, 請輸入數字!!");
            this.購買張數=0;
        }

        System.out.println("購買 " + 票券類型[this.票券種類] + ", " + this.購買張數 + " 張, " + 合計金額() + "元");
        return "[" + 票券類型[this.票券種類] + " " + this.購買張數 + " 張]";

    }

    public int 合計金額() {
        return 票券金額[this.票券種類] * this.購買張數;
    }

}
