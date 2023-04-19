/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化教學檔;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 華美娟
 */
public class AppData {

    private 班級 c;
    private final String filename; //final 建構子初值後禁止修改    

    public AppData() {
        filename = "app.data"; //沒指定路徑,預設為專案資料夾
    }

    public void 存檔() throws Exception {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.c);
        oos.close();
        fos.close();
    }

    public void 讀檔() throws Exception {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.c = (班級) ois.readObject();
        ois.close();
        fis.close();
    }

    public void set班級(班級 c) {
        this.c = c;
    }

    public 班級 get班級() {
        return c;
    }

}
