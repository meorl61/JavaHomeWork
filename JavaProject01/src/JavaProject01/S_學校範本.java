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
public class S_學校範本 {

    ArrayList<S_班級範本> 各班級;

    public S_學校範本() {
        各班級 = new ArrayList<S_班級範本>();
    }

    public void 新增班級(S_班級範本 新班) {
        各班級.add(新班);
    }

    public void 顯示各班級名稱() {
        int i = 0;
        for (S_班級範本 單一班 : 各班級) {
            System.out.println(i + "班: " + 單一班.get班級名稱());
            i++;
        }
    }
}
