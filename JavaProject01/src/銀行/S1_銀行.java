/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 銀行;

import JavaProject01.工具;
import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class S1_銀行 {

    static String 銀行名稱;
    static ArrayList<S1_客戶範本> 客戶們 = new ArrayList<S1_客戶範本>();

    public static void main(String[] args) {
        銀行名稱 = "金讚銀行";
        選擇銀行交易();
    }

    private static void 選擇銀行交易() {
        int 銀行交易方式;
        System.out.println("===================== " + 銀行名稱 + " =====================");
        銀行交易方式 = 工具.輸入整數資料(" 0.離開  1.新增客戶  2.進入客戶交易  3.顯示所有客戶");
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
            System.out.println("謝謝使用, 再見");
        } else {
            選擇銀行交易();
        }
    }

    private static void 建新客戶() {
        String 輸入客戶名稱;
        輸入客戶名稱 = 工具.輸入文字資料("請輸入客戶名稱");
        if (查詢名稱是否重覆(輸入客戶名稱)) {
            建新客戶();
        } else {
            設定客戶帳密(輸入客戶名稱);
        }
    }

    private static void 設定客戶帳密(String 客戶名稱) {
        String 輸入登入帳號;
        String 輸入登入密碼;
        輸入登入帳號 = 工具.輸入文字資料("請設定 登入帳號");
        輸入登入密碼 = 工具.輸入文字資料("請設定 登入密碼");
        if (查詢帳號是否重覆(輸入登入帳號)) {
            設定客戶帳密(客戶名稱);
        } else {
            S1_客戶範本 新客戶 = new S1_客戶範本();
            新客戶.set客戶名稱(客戶名稱);
            新客戶.set帳號(輸入登入帳號);
            新客戶.set密碼(輸入登入密碼);
            客戶們.add(新客戶);
            System.out.println("新增客戶:" + 新客戶.get客戶名稱() + " 成功!\n");
        }
    }

    private static boolean 查詢名稱是否重覆(String 要確認的姓名) {
        boolean 查詢結果 = false;
        for (S1_客戶範本 客戶 : 客戶們) {
            if (要確認的姓名.equals(客戶.get客戶名稱())) {
                查詢結果 = true;
                System.out.println("**錯誤!! " + 要確認的姓名 + ", 此登入客戶名稱已存在, 請重新設定!!\n");
            }
        }
        return 查詢結果;
    }

    private static boolean 查詢帳號是否重覆(String 要確認的登入帳號) {
        boolean 查詢結果 = false;
        for (S1_客戶範本 客戶 : 客戶們) {
            if (要確認的登入帳號.equals(客戶.get帳號())) {
                查詢結果 = true;
                System.out.println("**錯誤!! " + 要確認的登入帳號 + ", 此登入帳號已存在, 請重新設定!!");
            }
        }
        return 查詢結果;
    }

    private static void 顯示所有客戶() {
        for (int i = 0; i < 客戶們.size(); i++) {
            System.out.println(i + ":" + 客戶們.get(i).get客戶名稱() + " (" + 客戶們.get(i).get帳號() + "/" + 客戶們.get(i).get帳號() + ")");
        }
    }

    private static void 進入客戶選單() {
        String 登入帳號;
        String 登入密碼;
        int 客戶編號;
        登入帳號 = 工具.輸入文字資料("請輸入登入帳號:");
        登入密碼 = 工具.輸入文字資料("請輸入登入密碼:");
        客戶編號 = 查詢客戶編號(登入帳號, 登入密碼);
        if (客戶編號 < 0) {
            System.out.println("帳號或密碼錯誤, 請重新輸入");
            進入客戶選單();
        } else {
            客戶們.get(客戶編號).客戶交易選單();
        }
    }

    private static int 查詢客戶編號(String 登入帳號, String 登入密碼) {
        int 查詢結果 = -1;
        for (int i = 0; i < 客戶們.size(); i++) {
            if (登入帳號.equals(客戶們.get(i).get帳號()) && 登入密碼.equals(客戶們.get(i).get密碼())) {
                查詢結果 = i;
            }
        }
        return 查詢結果;
    }
}
