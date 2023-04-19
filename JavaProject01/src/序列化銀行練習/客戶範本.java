/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 華美娟
 */
public class 客戶範本 implements Serializable{

    String 客戶名稱;
    ArrayList<帳本範本> 客戶的帳本們;
    static Scanner 輸入文字 = new Scanner(System.in, "Big5");

    public 客戶範本(String 客戶名稱) {
        this.客戶名稱 = 客戶名稱;
        this.客戶的帳本們 = new ArrayList<帳本範本>();
    }

        public CharSequence get客戶名稱() {
        return 客戶名稱;
    }
        
    public void 建新帳本() {
        System.out.println("請輸入帳號");
        String 新帳號 = 輸入文字.next();
        帳本範本 新帳本 = new 帳本範本(新帳號);
        this.客戶的帳本們.add(新帳本);
        System.out.println("新帳本:" + 新帳號 + ", 建立完成!");
    }

    public void 選擇交易方式() {
        int 帳本index;
        int 交易金額;
        System.out.println("請選擇交易項目: 0.返回銀行選單 1.建新帳戶 2.存款 3.提款 4.顯示帳戶金額");
        CharSequence 選擇項目 = 輸入文字.next();
        
        switch ((String) 選擇項目) {
            case "0":
                break;
            case "1":
                建新帳本();
                break;
            case "2":                
                帳本index = 選擇帳本();
                交易金額=輸入交易金額();
                客戶的帳本們.get(帳本index).存提款("存款", 交易金額);
                break;
            case "3":
                帳本index = 選擇帳本();
                交易金額=輸入交易金額();
                客戶的帳本們.get(帳本index).存提款("提款", 交易金額);
                break;
            case "4":
                for(帳本範本 各帳本:客戶的帳本們){
                    各帳本.show();
                }
                break;
            default:
                System.out.println("請輸入 0 ～ 4 數字");
        }
        if (選擇項目.equals("0")) {
            System.out.println("謝謝使用, 返回銀行選單!");
        } else {
            System.out.println("\n");
            選擇交易方式();
        }
    }

    public int 選擇帳本() {
        System.out.println("請選擇要交易的帳本:");
        顯示帳本();
        int 帳號index = 輸入整數資料("請選擇要交易的帳本:");
        if (帳號index >= 0 && 帳號index < this.客戶的帳本們.size()) {
            return 帳號index;
        } else {
            System.out.println("錯誤, 請重新選擇");
            return 選擇帳本();
        }
    }

        public int 輸入交易金額() {
     
        int 交易金額 = 輸入整數資料("請輸入交易金額:");
        if (交易金額 >= 0) {
            return 交易金額;
        } else {
            System.out.println("輸入錯誤, 請重新輸入");
            return 輸入交易金額();
        }
    }
        
    public void 顯示帳本() {
        for (int i = 0; i < 客戶的帳本們.size(); i++) {
            System.out.println(i + " : " + 客戶的帳本們.get(i).get帳號());
        }
    }

    public static int 輸入整數資料(String 訊息) {
        String keywordstr;
        int keyword;
        System.out.println(訊息);
        //keyword = sc.nextInt();   // 避免輸入字串錯誤, 
        keywordstr = 輸入文字.next();     // 先用字串接
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
