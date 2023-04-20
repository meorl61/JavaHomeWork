/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0426_序列化教學檔;

/**
 *
 * @author 華美娟
 */
public class Test讀檔 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        班級 c1;
        AppData appData ;
        appData = new AppData();
        try {
            appData.讀檔();
            System.out.println("讀檔成功");
            c1 = appData.get班級();
            c1.顯示資料();
        } catch (Exception e){
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
            
        }
    }
    
}
