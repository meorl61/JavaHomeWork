/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 華美娟
 */
public class 資料存取 {

    private Model_銀行 A銀行;
    private final String filename; //final 建構子初值後禁止修改    

    public 資料存取() {
        filename = "銀行.data"; //沒指定路徑,預設為專案資料夾
    }

    public void 存檔() throws Exception {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.A銀行);
        oos.close();
        fos.close();
    }

    public void 讀檔() throws Exception {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.A銀行 = (Model_銀行) ois.readObject();
        ois.close();
        fis.close();
    }

    public void set銀行(Model_銀行 c) {
        this.A銀行 = c;
    }

    public Model_銀行 get銀行() {
        return this.A銀行;
    }

}
