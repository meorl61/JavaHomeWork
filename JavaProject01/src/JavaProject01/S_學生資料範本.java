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
public class S_學生資料範本 {

    //宣告
    private String 學生姓名;
    private int 國文成績;
    private int 英文成績;
    private int 數學成績;
    private int 理化成績;
    private int 合計總分;
    private double 平均成績;

    public void 設定初始(String 學生編號) {
        System.out.println("\n~~ 開始輸入_" + 學生編號 + "_資料 ~~");
        this.學生姓名 = 工具.輸入文字資料("請輸入【" + 學生編號 + "】的姓名:");
        this.國文成績 = 工具.輸入整數資料("請輸入【" + 學生編號 + "】的國文成績:");
        this.英文成績 = 工具.輸入整數資料("請輸入【" + 學生編號 + "】的英文成績:");
        this.數學成績 = 工具.輸入整數資料("請輸入【" + 學生編號 + "】的數學成績:");
        this.理化成績 = 工具.輸入整數資料("請輸入【" + 學生編號 + "】的理化成績:");
    }

    public void 輸入分數(String 姓名) {
        System.out.println("\n~~ 開始輸入_" + 姓名 + "_分數 ~~");
        this.國文成績 = 工具.輸入整數資料("請輸入【" + 姓名 + "】的國文成績:");
        this.英文成績 = 工具.輸入整數資料("請輸入【" + 姓名 + "】的英文成績:");
        this.數學成績 = 工具.輸入整數資料("請輸入【" + 姓名 + "】的數學成績:");
        this.理化成績 = 工具.輸入整數資料("請輸入【" + 姓名 + "】的理化成績:");
    }

    public void 列印() {
        System.out.println("\n~~ 列印學生成績 ~~");
        int arr[] = {this.國文成績, this.英文成績, this.數學成績, this.理化成績};
        this.合計總分 = 工具.加總(arr);
        this.平均成績 = 工具.平均(arr);
        System.out.println("學生姓名: " + this.學生姓名);
        System.out.println("國文成績: " + this.國文成績);
        System.out.println("英文成績: " + this.英文成績);
        System.out.println("數學成績: " + this.數學成績);
        System.out.println("理化成績: " + this.理化成績);
        System.out.println("合計總分: " + this.合計總分);
        System.out.println("平均分數: " + this.平均成績);
    }

    public String get學生姓名() {
        return 學生姓名;
    }

    public void set學生姓名(String 學生姓名) {
        this.學生姓名 = 學生姓名;
    }
}
