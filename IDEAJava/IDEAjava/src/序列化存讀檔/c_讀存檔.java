package 序列化存讀檔;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class c_讀存檔 {
    private final String filename="src/序列化存讀檔/觀音靈課32籤";
    HashMap<String, model_籤詩內容範本> 籤筒;
    public void 存檔() throws Exception{
        FileOutputStream 檔案os = new FileOutputStream(filename);
        ObjectOutputStream 傳輸物件os = new ObjectOutputStream(檔案os);
        傳輸物件os.writeObject(this.籤筒);
        傳輸物件os.close();
        檔案os.close();
    }

    public void set籤筒(HashMap<String, model_籤詩內容範本> 籤筒) {
        this.籤筒 = 籤筒;
    }

    public model_籤詩內容範本 取籤詩(String 抽的爻){
        return this.籤筒.get(抽的爻);
    }

    public HashMap<String, model_籤詩內容範本> get籤筒() {
        return this.籤筒;
    }

    public void 讀檔() throws Exception{
        FileInputStream 檔案os=new FileInputStream(filename);
        ObjectInputStream 傳輸物件os=new ObjectInputStream(檔案os);
        this.籤筒 = (HashMap<String, model_籤詩內容範本>) 傳輸物件os.readObject();
        傳輸物件os.close();
        檔案os.close();
    }
}
