/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author 華美娟
 */
public class NewMain {
    static final String filename = "銀行.data"; //沒指定路徑,預設為專案資料夾
    static 銀行範本 銀行 = new 銀行範本();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        try {
            讀檔();
            System.out.println("讀檔成功");
            //銀行 = appData.get銀行();
            銀行.顯示資料();
        } catch (Exception e){
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
            
        }
        
        /*
        銀行範本 新銀行 = new 銀行範本();
        新銀行.set銀行名稱("鼎泰豐");
        新銀行.選擇銀行交易();
*/
    }
    
    public static void 讀檔() throws Exception {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        銀行 = (銀行範本) ois.readObject();
        ois.close();
        fis.close();
    }
}
