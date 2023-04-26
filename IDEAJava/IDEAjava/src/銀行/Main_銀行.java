/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 銀行;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class Main_銀行 {

    static ArrayList<S3_銀行範本> 我家附近銀行 = new ArrayList<S3_銀行範本>();

    public static void main(String[] args) {
        設立銀行();
        選銀行();
    }

    private static void 設立銀行() {
        S3_銀行範本 金讚銀行 = new S3_銀行範本();
        金讚銀行.set銀行名稱("金讚銀行");
        我家附近銀行.add(金讚銀行);

        S3_銀行範本 皇家銀行 = new S3_銀行範本();
        皇家銀行.set銀行名稱("皇家銀行");
        我家附近銀行.add(皇家銀行);

    }
    
    private static void 選銀行() {
        System.out.println("\n請問你要去哪一家銀行\n");
        顯示附近銀行名稱();
        System.out.println("\n9:離開系統");
        
        int 選一家銀行 = 工具.輸入整數資料("\n請選擇:");

        if (選一家銀行 == 9) {
            System.out.println("謝謝使用, 再見!");
        } else {
            if (選一家銀行 >= 0 && 選一家銀行 < 我家附近銀行.size()) {
                
                我家附近銀行.get(選一家銀行).選擇銀行交易();
                
                //交易結束後
                int 是否繼續 = 工具.輸入整數資料("是否繼續找銀行?(1:繼續, 0:結束)");
                if (是否繼續 == 1) {
                    選銀行();
                } else {
                    System.out.println("謝謝使用, 再見");
                }
            } else {
                System.out.println("** 輸入錯誤, 請重新選擇! **\n");
                選銀行();
            }
        }
    }

    private static void 顯示附近銀行名稱() {
        for (int i = 0; i < 我家附近銀行.size(); i++) {
            System.out.println(i + ":" + 我家附近銀行.get(i).get銀行名稱());
        }
    }

}
