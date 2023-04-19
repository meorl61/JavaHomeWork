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
public class Model_客戶 implements Serializable {

    String 客戶名稱;
    ArrayList<帳本範本> 客戶的帳本們;

    public Model_客戶(String 客戶名稱) {
        this.客戶名稱 = 客戶名稱;
        this.客戶的帳本們 = new ArrayList<帳本範本>();
    }

    public void set客戶名稱(String 客戶名稱) {
        this.客戶名稱 = 客戶名稱;
    }

    public CharSequence get客戶名稱() {
        return 客戶名稱;
    }

    public void 顯示帳本() {
        for (int i = 0; i < 客戶的帳本們.size(); i++) {
            System.out.println(i + " : " + 客戶的帳本們.get(i).get帳號());
        }
    }

}
