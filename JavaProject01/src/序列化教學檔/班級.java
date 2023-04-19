/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化教學檔;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class 班級 implements Serializable{
    public String 名稱;
    public ArrayList<學生> 學生們;
    
    //建構子
    public 班級() {
        this.學生們 = new ArrayList();
        System.out.println("班級 建構完成");
    }
    
    public void 加入學生(學生 x) {
        this.學生們.add(x);
        System.out.println("加入學生 "+x.name);
    }
    
    public void 顯示資料() {
        System.out.println("------ " + this.名稱 + " 顯示資料 -----");
        for (學生 x : 學生們){
            System.out.println(x.toString());
        }
    }
}
