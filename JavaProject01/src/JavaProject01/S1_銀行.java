/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class S1_銀行 {

    static String 銀行名稱;
    static ArrayList<S1_客戶範本> 客戶們 = new ArrayList<S1_客戶範本>();
    
    public static void main(String[] args) {
        銀行名稱= "金讚銀行";
        選擇銀行交易();
    }
    
    private static void 選擇銀行交易() {
        int 銀行交易方式;
                       System.out.println("===================== " + 銀行名稱 + " =====================");
        銀行交易方式 = 工具.輸入整數資料(" 0.離開  1.新增客戶  2.進入客戶交易  3.顯示所有客戶");
        switch (銀行交易方式) {
            case 1:
                建新客戶();
                break;
            case 2:
                進入客戶選單();
                break;
            case 3:
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
        S1_客戶範本 新客戶 = new S1_客戶範本();
        System.out.println("\n ------ 新開戶 ------");
        新客戶.客戶名稱 = 工具.輸入文字資料("請輸入客戶名稱");
        客戶們.add(新客戶);
         System.out.println("新增客戶:" + 新客戶.客戶名稱 + " 成功!\n");
    }

    private static void 顯示所有客戶() {
        for (int i = 0; i < 客戶們.size(); i++) {
            System.out.println(i + ":" + 客戶們.get(i).客戶名稱);
        }
    }

    private static void 進入客戶選單() {
        if (客戶們.size() < 1) {
            System.out.println("** 目前無任何客戶 **\n");
        } else {
            System.out.println("");
            顯示所有客戶();
            int 客戶編號 = 工具.輸入整數資料("請選擇客戶編號");
            if (客戶編號>=0 && 客戶編號<客戶們.size())
            {
            客戶們.get(客戶編號).客戶交易選單();           
            }
            else
            {
                System.out.println("客戶編號輸入錯誤!!");
                進入客戶選單();
            }
        }
    }

}
