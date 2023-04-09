/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author 華美娟
 */
public class 班級_ArrayList練習 {

    static S_學校範本 學校 = new S_學校範本();
    static int 班級編號;

    public static void 跑流程() {
        選擇操作項目();
    }

    public static void 選擇操作項目() {
     int 選擇功能 = 工具.輸入整數資料("\n0.離開 1.新建班級 2.新增學生 3.輸入分數 4.顯示所有班級 5.顯示所有學生 6.列印所有學生成績");
        switch (選擇功能) {
            case 0:
                System.out.println("謝謝使用, 再見!");
                break;
            case 1:
                學校.新增班級();
                break;
            case 2:
                班級編號 = 學校.選擇班級();
                學校.新增學生(班級編號);
                break;
            case 3:
                班級編號 = 學校.選擇班級();
                學校.輸入分數(班級編號);
                break;
            case 4:
                學校.顯示各班級名稱();
                break;
            case 5:
                班級編號 = 學校.選擇班級();
                學校.顯示所有學生(班級編號);
                break;
            case 6:
                班級編號 = 學校.選擇班級();
                學校.顯示所有學生分數(班級編號);
                break;
            default:
                System.out.println("輸入錯誤, 請輸入 0～5 的選項!\n");
                break;
        }
        if (選擇功能 != 0) {
            選擇操作項目();
        }
    }

}
