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
    static int 班級編號;

    public static void 跑流程() {
        選擇操作項目();

    }

    public static void 選擇操作項目() {
        選擇功能 = 工具.輸入整數資料("0.離開 1.新建班級 2.新增學生 3.輸入分數 4.顯示所有班級 5.顯示所有學生 6.列印所有學生成績");
        if (選擇功能 < 0) {
            System.out.println("輸入錯誤, 請輸入 0～5 的選項!\n");
            選擇操作項目();
        } else {
            switch (選擇功能) {
                case 1:
                    建新班級();
                    break;
                case 2:
                    班級編號 = 選擇班級();
                    新增學生(班級編號);
                    break;
                case 3:
                    班級編號 = 選擇班級();
                    輸入分數(班級編號);
                    break;
                case 4:
                    顯示所有班級();
                    break;
                case 5:
                    班級編號 = 選擇班級();
                    顯示所有學生(班級編號);
                    break;
                case 6:
                    班級編號 = 選擇班級();
                    顯示所有學生分數(班級編號);
                default:
            }
            if (選擇功能 == 0) {
                System.out.println("謝謝使用, 再見!");
            } else {
                選擇操作項目();
            }
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

    public static int 選擇班級() {
        學校.顯示各班級名稱();
        int 班級編號;
        班級編號 = 工具.輸入整數資料("請選擇班級編號:");
        return 班級編號;
    }

    public static int 選擇學生(int 班級編號) {
        學校.各班級.get(班級編號).顯示學生姓名();
        int 學生編號;
        學生編號 = 工具.輸入整數資料("請選擇學生編號:");
        return 學生編號;
    }

    public static void 顯示所有班級() {
        學校.顯示各班級名稱();
    }

    public static void 新增學生(int 班級編號) {
        單一學生 = new S_學生資料範本();
        String 學生名稱;
        學生名稱 = 工具.輸入文字資料("請輸入學生姓名, 輸入 0 結束");
        if (學生名稱.equals("0")) {
            System.out.println("新增結束");
        } else {
            學校.各班級.get(班級編號).set新增學生姓名(學生名稱);
            新增學生(班級編號);
        }

    }

    private static void 輸入分數(int 班級編號) {
        int 學生編號;

        學生編號 = 選擇學生(班級編號);
        學校.各班級.get(班級編號).設定學生分數(學生編號);

        if (工具.輸入01判斷資料1為真("是否繼續輸入" + 學校.各班級.get(班級編號).get班級名稱() + " 成績? 0/1")) {
            輸入分數(班級編號);
        } else {
            System.out.println("新增結束");
        }
    }

    private static void 顯示所有學生(int 班級編號) {
        學校.各班級.get(班級編號).顯示學生姓名();
    }

    private static void 顯示所有學生分數(int 班級編號) {
        學校.各班級.get(班級編號).顯示學生分數();
    }
}
