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

    static int 選擇功能 = 0;
    static S_學校範本 學校 = new S_學校範本();
    static S_班級範本 單一班級;
    static S_學生資料範本 單一學生;

    public static void 跑流程() {
        選擇操作項目();
        switch (選擇功能) {
            case 1:
                建新班級();
                break;
            case 2:
                建新學生();
            case 4:
                顯示所有班級();
            default:
        }
        if (工具.輸入01判斷資料1為真("是否繼續操作?0:離開 1:繼續")) {
            跑流程();
        } else {
            System.out.println("謝謝使用, 再見!");
        }

    }

    public static void 選擇操作項目() {
        選擇功能 = 工具.輸入整數資料("0.離開 1.新建班級 2.新增學生 3.輸入分數 4.顯示所有班級 5.顯示所有學生成績");
        if (選擇功能 < 0) {
            System.out.println("輸入錯誤, 請輸入 0～5 的選項!\n");
            選擇操作項目();
        }
    }

    public static void 建新班級() {
        String 班級名稱;
        單一班級 = new S_班級範本();
        班級名稱 = 工具.輸入文字資料("請輸入班級名稱:");
        單一班級.set班級名稱(班級名稱);
        學校.新增班級(單一班級);
        System.out.println(班級名稱 + ",新增完成");
    }

    public static void 建新學生() {
        學校.顯示各班級名稱();
        int 班級編號;
        班級編號 = 工具.輸入整數資料("你要建立哪一班的學生");
        輸入班級學生名稱(班級編號);
    }

    public static void 顯示所有班級() {
        學校.顯示各班級名稱();
    }

    public static void 輸入班級學生名稱(int 班級編號) {
        單一學生 = new S_學生資料範本();
        String 學生名稱;
        學生名稱= 工具.輸入文字資料("請輸入學生姓名, 輸入Q結束");
        if (學生名稱.equals("Q") || 學生名稱.equals("q"))
        {System.out.println("新增結束");}
        else{
            
        }
            
    }

}
