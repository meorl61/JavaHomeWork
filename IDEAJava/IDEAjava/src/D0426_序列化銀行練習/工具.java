/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0426_序列化銀行練習;

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
        if (判斷是否為數字(keywordstr)) {
            keyword = Integer.parseInt(keywordstr);
            return keyword;
        } else {
            return -1;
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

}
