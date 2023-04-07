/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author 華美娟 <Maple Hua>
 */
public class 銀行帳戶練習_使用建構子 {

    public static int 交易方式;
    public static int 交易金額;
    public static String 交易方式說明[] = {"存款", "提款"};
    static S_帳戶範本加建構子 客戶;

    public static void 跑流程() {
        開戶();
        操作提款機();
    }
    
    public static void 開戶() {
        
        客戶 = new S_帳戶範本加建構子(工具.輸入文字資料("請輸入開戶者姓名:"),工具.輸入整數資料("請輸入開戶金額: "));
        System.out.println("開戶成功");
        System.out.println("開戶人: " + 客戶.get帳戶名稱() + "  開戶金額: " + 客戶.get餘額());
    }

    public static void 操作提款機() {
        boolean 交易結果;
        交易方式 = 工具.輸入整數資料("\n請選擇交易方式(0/1/2/3): 0.取消操作, 1.存款, 2.提款, 3.查詢帳戶餘額");

        if (交易方式 == 1 || 交易方式 == 2) {
            System.out.println("\n~~~ 操作: 進入" + 交易方式說明[交易方式 - 1] +"交易 ~~~");
            交易金額 = 工具.輸入整數資料("請輸入你要" + 交易方式說明[交易方式 - 1] + "的金額: ");
            交易結果 = 工具.銀行交易結果(交易方式說明[交易方式 - 1], 交易金額, 客戶.get餘額());

            if (交易結果) {
                交易成功流程();
            } else {
                交易失敗流程();
            }

        } else if (交易方式 == 3) {  // 顯示帳戶餘額
            System.out.println("\n~~~ 操作: 顯示帳戶餘額 ~~~");
            顯示帳戶資訊();
        } else if (交易方式 != 0) {  // 操作錯誤提示說明
            System.out.println("\n~~~ 操作錯誤!! ~~~");
            System.out.println("請輸入 0 或 1 或 2 或 3");
        }

        if (交易方式 == 0) { // 取消操作
            System.out.println("謝謝使用, 再見!");
        } else {
            是否要繼續操作提款機();
        }
    }
    
    public static void 交易成功流程() {
        顯示帳戶資訊();
        if (交易方式 == 1) {
            客戶.set餘額(客戶.get餘額()+交易金額) ;
        } else {
            客戶.set餘額(客戶.get餘額()-交易金額) ;
            }
        System.out.println("交易方式: " + 交易方式說明[交易方式 - 1] + " " + 交易金額);
        顯示帳戶餘額();
        System.out.println(交易方式說明[交易方式 - 1] + " 交易成功!");
    }

    public static void 交易失敗流程() {        
        System.out.println(交易方式說明[交易方式 - 1] + ": 交易失敗!");
        if (交易方式 == 2) {
            顯示帳戶餘額();
            System.out.println("說明: 帳戶餘額不足");
        }
    }

    public static void 顯示帳戶資訊() {
        System.out.println("帳 戶 名: " + 客戶.get帳戶名稱());
        System.out.println("帳戶餘額: " + 客戶.get餘額());
    }

    public static void 顯示帳戶餘額() {
        System.out.println("帳戶餘額: " + 客戶.get餘額());
    }
    
    public static void 是否要繼續操作提款機() {
        String 是否要操作;

        是否要操作 = 工具.輸入文字資料("\n是否要繼續操作提款機?(Y/N)");

        if (是否要操作.equals("Y") || 是否要操作.equals("y")) {
            操作提款機();
        } else {
            System.out.println("謝謝使用, 再見!");
        }
    }
}
