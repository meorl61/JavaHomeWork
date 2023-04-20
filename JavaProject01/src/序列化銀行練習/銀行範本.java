/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class 銀行範本 implements Serializable {

    String 銀行名稱;
    ArrayList<客戶範本> 客戶們;

    public void set銀行名稱(String 銀行名稱) {
        this.銀行名稱 = 銀行名稱;
        this.客戶們 = new ArrayList<客戶範本>();
    }

    public String get銀行名稱() {
        return this.銀行名稱;
    }

    public void 選擇銀行交易() {
        int 銀行交易方式;
        System.out.println("===================== " + 銀行名稱 + " =====================");
        銀行交易方式 = 工具.輸入整數資料(" 0.離開" + this.銀行名稱 + "  1.新增客戶  2.進入客戶交易  3.顯示所有客戶");
        switch (銀行交易方式) {
            case 1:
                System.out.println("\n ------ 新增客戶 ------");
                建新客戶();
                break;
            case 2:
                System.out.println("\n ------ 進入客戶功能 ------");
                進入客戶選單();
                break;
            case 3:
                System.out.println("\n ------ 目前銀行客戶 ------");
                顯示所有客戶();
                break;
        }

        if (銀行交易方式 == 0) {
            System.out.println(this.銀行名稱 + " 謝謝您的光臨!\n");
        } else {
            選擇銀行交易();
        }

    }

    private void 建新客戶() {
        String 輸入客戶名稱;
        輸入客戶名稱 = 工具.輸入文字資料("請輸入客戶名稱");

        if (查詢名稱是否重覆(輸入客戶名稱)) {

            建新客戶();
        } else {
            客戶範本 新客戶 = new 客戶範本(輸入客戶名稱);
            this.客戶們.add(新客戶);
            System.out.println("新增客戶:" + 新客戶.get客戶名稱() + " 成功!\n");
        }

    }

    private boolean 查詢名稱是否重覆(String 要確認的姓名) {

        boolean 查詢結果 = false;
        if (this.客戶們.size() > 0) {
            for (客戶範本 客戶 : this.客戶們) {
                if (要確認的姓名.equals(客戶.get客戶名稱())) {
                    查詢結果 = true;
                    System.out.println("**錯誤!! " + 要確認的姓名 + ", 此登入客戶名稱已存在, 請重新設定!!\n");
                }
            }
        }
        return 查詢結果;
    }

    private void 顯示所有客戶() {
        for (int i = 0; i < this.客戶們.size(); i++) {
            System.out.println(i + ":" + this.客戶們.get(i).get客戶名稱());
        }
    }

    private void 進入客戶選單() {
        顯示所有客戶();
        int 客戶編號 = 工具.輸入整數資料("請選擇客戶");
        if (客戶編號 < 0) {
            System.out.println("輸入錯誤!\n");
            進入客戶選單();
        } else {
            this.客戶們.get(客戶編號).選擇交易方式();
        }
    }

    public void 顯示資料() {
        for (int i = 0; i < this.客戶們.size(); i++) {
            System.out.println(i + ":" + this.客戶們.get(i).get客戶名稱());
        }
    }

    public void set客戶們(ArrayList<客戶範本> 客戶們) {
        this.客戶們 = 客戶們;
    }

}
