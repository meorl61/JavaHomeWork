package 存檔練習_觀音32籤;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class 讀存檔 {
    private HashMap<String,Object> 資料;
    private final String filename="src/存檔練習_觀音32籤/資料檔_觀音靈課32籤";

    public void set資料(HashMap<String,Object> 資料) {
        this.資料 = 資料;
    }

    public HashMap<String,Object> get資料() {
        return 資料;
    }

    public void 存檔() throws Exception{
        FileOutputStream 開檔 = new FileOutputStream(filename);
        ObjectOutputStream 輸出物件 = new ObjectOutputStream(開檔);
        輸出物件.writeObject(this.資料);
        輸出物件.close();
        開檔.close();
    }

    public void 讀檔() throws Exception{
        FileInputStream 開檔 = new FileInputStream(filename);
        ObjectInputStream 讀入物件 = new ObjectInputStream(開檔);
        this.資料 = (HashMap<String,Object>) 讀入物件.readObject();
        讀入物件.close();
        開檔.close();
    }
}
