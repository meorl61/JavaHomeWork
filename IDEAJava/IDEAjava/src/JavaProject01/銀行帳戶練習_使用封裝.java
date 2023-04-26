/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import javax.print.DocFlavor;

/**
 *
 * @author 華美娟
 */
public class 銀行帳戶練習_使用封裝 {

    static S_客戶銀行帳戶封裝範本 客戶;

    public static void 跑流程() {
        開戶("阿土伯",100);
        操作提款機();
        
        開戶("錢多多",500);
        操作提款機();
    }

    public static void 開戶(String 客戶名, int 初始金額) {

        //客戶 = new S_帳戶範本加建構子(工具.輸入文字資料("請輸入開戶者姓名:"),工具.輸入整數資料("請輸入開戶金額: "));
        //改使用封裝
        客戶 = new S_客戶銀行帳戶封裝範本();
        客戶.開戶(客戶名,初始金額);
    }

    public static void 操作提款機() {
        int 交易方式;
        交易方式 = 工具.輸入整數資料("\n請選擇交易方式(0/1/2/3): 0.取消操作, 1.存款, 2.提款, 3.查詢帳戶餘額");

        switch (交易方式) {
            case 0: // 取消操作
                System.out.println("謝謝使用, 再見!");
                break;
            case 1:
                客戶.存款();
                break;
            case 2:
                客戶.提款();
                break;
            case 3:  // 顯示帳戶餘額                 
                System.out.println(客戶);
                break;
            default:  // 操作錯誤提示說明
                System.out.println("\n~~~ 操作錯誤!! ~~~");
                System.out.println("請輸入 0 或 1 或 2 或 3");
        }

        if (交易方式 != 0) { // 取消操作            
            是否要繼續操作提款機();
        }
    }

    public static void 是否要繼續操作提款機() {

        switch(工具.輸入文字資料("\n是否要繼續操作提款機?(Y/N)")){
            case "Y":
            case "y":
                操作提款機();
                break;
            default:
                System.out.println("~~ 謝謝使用, 再見! ~~\n");
        }
        
    }
}
