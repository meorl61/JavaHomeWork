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
public class S_日期範本 {

    private int v年;
    private int v月;
    private int v日;

    //建構子 
    public void S_日期範本(int k年, int k月, int k日) {
        set年(k年);
        set月(k月);
        set日(k日);
        System.out.println(this);
    }

    public void set年(int k年) {
        if (k年 < 0 || k年 > 3000) {
            System.out.println("*** 轉換錯誤, 年: " + k年 + ", 資料異常!\n");
        }
        this.v年 = k年;
    }

    public void set月(int k月) {
        if (k月 < 1 || k月 > 12) {
            System.out.println("*** 轉換錯誤, 月: " + k月 + ", 資料異常!\n");
        }
        this.v月 = k月;
    }

    public void set日(int k日) {
        if (k日 < 1 || k日 > 31) {
            System.out.println("*** 轉換錯誤, 日: " + k日 + ", 資料異常!\n");
        }
        this.v日 = k日;
    }

    public String toString() {
        System.out.println("轉換：" + this.v年 + " " + this.v月 + " " + this.v日);
        String 回傳資料 = null;
        switch (this.v月) {
            case 2:
                if (v年 % 400 == 0 || (v年 % 100 != 0 && v年 % 4 == 0)) {
                    if (this.v日 > 29) {
                        回傳資料 = "*** 轉換錯誤, 日: " + this.v日 + "錯誤, 閏月2月不可超過29日n";
                    }
                } else {
                    if (this.v日 > 28) {
                        回傳資料 = "*** 轉換錯誤, 日: " + this.v日 + " 錯誤, 2月不可超過28日\n";
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.v日 > 30) {
                    回傳資料 = "*** 轉換錯誤, 日: " + this.v日 + " 錯誤, " + this.v月 + "月為小月, 不可大於30日!\n";
                }
                break;
            default:
                System.out.println("轉換成功!");
                回傳資料 = "西元 " + this.v年 + "年 " + this.v月 + "月 " + this.v日 + "日\n";
        }

        return 回傳資料;
    }
}
