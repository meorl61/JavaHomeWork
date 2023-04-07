/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class S_班級範本 {
    private ArrayList<S_學生資料範本> 學生們;
    private String 班級名稱;
    
    public S_班級範本() {
        學生們=new ArrayList<S_學生資料範本>();        
    }

    public ArrayList<S_學生資料範本> get學生們() {
        return 學生們;
    }

    public void set學生們(ArrayList<S_學生資料範本> 學生們) {
        this.學生們 = 學生們;
    }

    public String get班級名稱() {
        return 班級名稱;
    }

    public void set班級名稱(String 班級名稱) {
        this.班級名稱 = 班級名稱;
    }
    
}
