/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class Model_銀行 implements Serializable{
        String 銀行名稱;
    ArrayList<Model_客戶> 客戶們;
   
    public void set銀行名稱(String 銀行名稱) {
        this.銀行名稱 = 銀行名稱;
    }

    public void set客戶們(ArrayList<Model_客戶> 客戶們) {
        this.客戶們 = 客戶們;
    }

    public String get銀行名稱() {
        return this.銀行名稱;
    }
    public void 顯示資料(){
        for (int i = 0; i < this.客戶們.size(); i++) {
            System.out.println(i + ":" + this.客戶們.get(i).get客戶名稱() );
        }
    }
    


}
