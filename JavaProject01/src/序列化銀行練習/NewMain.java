/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

/**
 *
 * @author 華美娟
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        銀行範本 新銀行 = new 銀行範本();
        AppData appData ;
        appData = new AppData();
        try {
            appData.讀檔();
            System.out.println("讀檔成功");
            皇家銀行 = appData.get銀行();
            皇家銀行.顯示資料();
        } catch (Exception e){
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
            
        }
        
        
        銀行範本 新銀行 = new 銀行範本();
        新銀行.set銀行名稱("鼎泰豐");
        新銀行.選擇銀行交易();
    }
    
}
