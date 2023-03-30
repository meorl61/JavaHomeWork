/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author 華美娟
 */
public class 銀行帳戶 {

    public static String 帳戶名稱;
    public static int 餘額;
    public static int 交易金額;
    public static int 次數;
    public static int 異動次數;
    public static int 存款還是提款;

    public static void 設定初始餘額_阿土伯() {
        帳戶名稱 = "阿土伯";
        餘額 = 5000;
        次數 = 0;
        異動次數 = (int) (Math.random() * 5) + 2;
    }

    public static void 設定初始餘額_錢小美() {
        帳戶名稱 = "錢小美";
        餘額 = 5000;
        次數 = 0;
        異動次數 = (int) (Math.random() * 5) + 2;
    }

    public static void 存款() {
        次數 += 1;
        System.out.println("\n--- 操作次數_" + 次數 + " : 存款 ---");
        顯示帳戶資訊();
        交易金額 = ((int) (Math.random() * 10) + 1) * 1000;
        餘額 += 交易金額;
        System.out.println("存款: " + 交易金額);
        System.out.println("存款完成!");
        顯示帳戶餘額();
    }

    public static void 提款() {
        次數 += 1;
        System.out.println("\n--- 操作次數_" + 次數 + " : 提款 ---");
        顯示帳戶資訊();
        交易金額 = (int) (Math.random() * (20001));
        System.out.println("提款: " + 交易金額);
        if (交易金額 <= 餘額) {
            餘額 -= 交易金額;
            System.out.println("提款成功!");
            顯示帳戶餘額();
        } else {
            System.out.println("** 提款失敗, 餘額不足! **");
        }
    }

    public static void 顯示帳戶資訊() {
        System.out.println("帳 戶 名: " + 帳戶名稱);
        System.out.println("帳戶餘額: " + 餘額);
    }

    public static void 顯示帳戶餘額() {
        System.out.println("帳戶餘額: " + 餘額);
    }

    public static void 操作提款機() {
        if (次數 < 異動次數) {
            存款還是提款 = (int) (Math.random() * 2);
            
            if (存款還是提款 == 1) {
                存款();
            } else {
                提款();
            }
            操作提款機();
        } else {
            System.out.println("\n客戶操作 " + 異動次數 + " 次存提款");
            System.out.println("======================================\n");
        }
    }

    public static void 跑流程() {
        設定初始餘額_阿土伯();
        顯示帳戶資訊();
        操作提款機();
        設定初始餘額_錢小美();
        顯示帳戶資訊();
        操作提款機();
    }
}
