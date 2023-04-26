/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0427_映射容器Map_老師範例;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 華美娟
 */
public class TestMap_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //key 字串類型
        // value 任意物件類型
        String key;
        Object value;
        
        //Map 映射容器 (透過 key 管理 value)
        HashMap<String, Object> map;
        map = new HashMap();
        
        //放資料 put()
        key="Tom";
        value= new Student("Tom",100,99);
        map.put(key, value);
        
        key="100";
        value="中正區";
        map.put(key, value);
        
        key="list";
        value=new ArrayList();  // 即 ArrayList<Object>
        map.put(key, value);
        
        key = "map2";
        value=new HashMap(); //即 HashMap<Object, Object>
        map.put(key, value);
        
        //取資料 get()
        //可能需要資料轉型, 當得到的贠料與變數類型不同時)
        //例如 HashMap 的 value 宣告為 Object(抽象類型),可能是任何東西
        Student st;
        st=(Student) map.get("Tom");
        
        String area;
        area = (String) map.get("100");
        
        ArrayList<Object> list;
        list=(ArrayList<Object>) map.get("list");
        
        HashMap<Object, Object> map2;
        map2 = (HashMap<Object, Object>) map.get("map2");
    }
    
}
