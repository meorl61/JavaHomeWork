/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class W_存檔 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Model_銀行 A銀行=new Model_銀行();
        A銀行.set銀行名稱("皇家銀行");
        ArrayList<Model_客戶> 皇家客戶們=new ArrayList<Model_客戶>();      
        
        Model_客戶 阿土伯 = new Model_客戶("阿土伯");
        ArrayList<Model_帳本> 阿土伯帳本=new ArrayList<Model_帳本>();
        Model_帳本 阿土伯帳本1 = new Model_帳本("00001");
        阿土伯帳本1.set餘額(500);
        阿土伯帳本.add(阿土伯帳本1);
        Model_帳本 阿土伯帳本2 = new Model_帳本("00002");
        阿土伯帳本2.set餘額(600);
        
        阿土伯帳本.add(阿土伯帳本2);
        
        皇家客戶們.add(阿土伯);
        
        Model_客戶 錢多多 = new Model_客戶("錢多多");
        ArrayList<Model_帳本> 錢多多帳本=new ArrayList<Model_帳本>();
        Model_帳本 錢多多帳本1 = new Model_帳本("00001");
        錢多多帳本1.set餘額(700);
        錢多多帳本.add(錢多多帳本1);
        Model_帳本 錢多多帳本2 = new Model_帳本("00002");
        錢多多帳本2.set餘額(800);
        
        錢多多帳本.add(錢多多帳本2);
        
        皇家客戶們.add(錢多多);
        
        A銀行.set客戶們(皇家客戶們);
        
        
        AppData appData;
        appData = new AppData();
        appData.set銀行(A銀行);
        
        try{
            appData.存檔();
            System.out.println("存檔成功");
        } catch (Exception e){
            System.out.println("存檔失敗");
            System.out.println(e.toString());
            //e.printStackTrace(); //完整錯誤訊息
        }

    }

}
