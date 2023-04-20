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
public class Main_銀行存取 {

    static 銀行範本 銀行 = new 銀行範本();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        銀行範本 新銀行 = 讀檔();        
        新銀行.選擇銀行交易();
        存檔(新銀行);
    }

    public static void 存檔(銀行範本 銀行) {
        AppFileData appData;
        appData = new AppFileData();
        appData.set銀行(銀行);
        try {
            appData.存檔();
            System.out.println("存檔成功");
        } catch (Exception e) {
            System.out.println("存檔失敗");
            System.out.println(e.toString());
            //e.printStackTrace(); //完整錯誤訊息
        }
    }

    public static 銀行範本 讀檔() {
        銀行範本 銀行;
        AppFileData appData;
        appData = new AppFileData();
        try {
            appData.讀檔();
            System.out.println("讀檔成功");
            銀行 = appData.get銀行();
            return 銀行;
            //銀行.顯示資料();
        } catch (Exception e) {
            
            System.out.println("讀檔失敗");
            
            //產生銀行資料
            銀行=new 銀行範本();
            銀行.set銀行名稱("萬年銀行");
            存檔(銀行);
            
            
            //System.out.println(e.toString());
            return null;
        }
    }
}
