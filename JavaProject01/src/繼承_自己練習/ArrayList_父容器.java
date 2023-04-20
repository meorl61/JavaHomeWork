/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承_自己練習;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class ArrayList_父容器 {

    ArrayList<Object> 項目s = new ArrayList<Object>();

    public void add項目(Object x) {
        項目s.add(x);
    }

    public ArrayList<Object> get項目s() {
        return 項目s;
    }

    public void show() {
        int i = 0;
        for (Object a : 項目s) {
            System.out.println("\n" + i + ": " + a);
            i++;
        }
    }
}
