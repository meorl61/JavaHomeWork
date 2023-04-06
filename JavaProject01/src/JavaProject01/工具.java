/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.util.Scanner;

/**
 *
 * @author 華美娟
 */
public class 工具 {

    private static Scanner sc = new Scanner(System.in, "BIG5");

    public static String 輸入文字資料(String 訊息) {
        String keyword;
        System.out.println(訊息);
        keyword = sc.next();
        return keyword;
    }

    public static int 輸入整數資料(String 訊息) {
        String keywordstr;
        int keyword;
        System.out.println(訊息);
        //keyword = sc.nextInt();   // 避免輸入字串錯誤, 
        keywordstr = sc.next();     // 先用字串接
        if(判斷是否為數字(keywordstr)){
            keyword=Integer.parseInt(keywordstr);
             return keyword;
        } else {
             return -1;
        }        
    }

    public static boolean 輸入01判斷資料1為真(String 訊息) {
        System.out.println(訊息);
        if (sc.next().equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean 判斷是否為數字(String 字串) {
        for (int i = 字串.length(); --i >= 0;) {
            if (!Character.isDigit(字串.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int 加總(int arr[]) {
        int c;
        c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += arr[i];
        }
        return c;
    }

    public static double 平均(int arr[]) {
        double avg;
        avg = 加總(arr) / (arr.length * 1.0);
        return avg;
    }

    public static boolean 銀行交易結果(String 交易方式, int 交易金額, int 客戶餘額) {
        if (交易方式 == "存款") {
            客戶餘額 += 交易金額;
            return true;
        }

        if (交易方式 == "提款") {
            if (客戶餘額 >= 交易金額) {
                客戶餘額 -= 交易金額;
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

}
