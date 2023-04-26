package 存檔練習_觀音32籤;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class 讀存檔 {
    private 觀音靈課_Model_Data 資料;
    private final String filename="src/存檔練習_觀音32籤/觀音靈課32籤";

    public void set資料(觀音靈課_Model_Data 資料) {
        this.資料 = 資料;
    }

    public 觀音靈課_Model_Data get資料() {
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
        this.資料 = (觀音靈課_Model_Data) 讀入物件.readObject();
        讀入物件.close();
        開檔.close();
    }
}
