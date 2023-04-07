/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 * 自我挑戰
 * 
 * 建立2個帳戶物件
 * 用建構子設定帳戶名稱、餘額
 * 用toString()輸出資料
 * 
 * @author 華美娟
 */
public class 銀行帳戶_建構子練習 {
    static S_帳戶範本加建構子 客戶;

    
    public static void 執行() {        
        //客戶 = new S_帳戶範本加建構子("阿土伯",5000);
        客戶 = new S_帳戶範本加建構子();
        客戶.set帳戶名稱("阿土伯");
        客戶.set餘額(5000);
        System.out.println(客戶);
        
        //客戶 = new S_帳戶範本加建構子("錢多多",10000);
        客戶.set帳戶名稱("錢多多");
        客戶.set餘額(10000);        
        System.out.println(客戶);
        
    }
}
