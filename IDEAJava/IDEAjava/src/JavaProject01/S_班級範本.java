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

    private ArrayList<S_學生資料範本> 學生們 = new ArrayList<S_學生資料範本>();
    private String 班級名稱;

    public ArrayList<S_學生資料範本> get學生們() {
        return this.學生們;
    }

    public void set班級名稱(String 班級名稱) {
        this.班級名稱 = 班級名稱;
    }

    public String get班級名稱() {
        return this.班級名稱;
    }
    public void set新增學生() {
       
        String 新學生姓名;
        新學生姓名 = 工具.輸入文字資料("請輸入學生姓名, 輸入 0 結束");
        if (新學生姓名.equals("0")) {
            System.out.println("新增結束");
        } else { 
            S_學生資料範本 新學生= new S_學生資料範本();
            新學生.set學生姓名(新學生姓名);
            this.學生們.add(新學生);
            set新增學生();
        }
        
    }

    public void 顯示班級學生姓名() {
        int i = 0;
        System.out.println("班級: " + this.get班級名稱() + " 的學生名單如下:");
        for (S_學生資料範本 單一學生 : this.學生們) {
            System.out.println(i + ": " + 單一學生.get學生姓名());
            i++;
        }
    }

    public void 設定學生分數(int 學生編號) {
        this.學生們.get(學生編號).輸入分數();
    }

    public void 顯示學生分數() {
        System.out.println("班級: " + this.班級名稱 + " 的學生成績如下:");
        for (S_學生資料範本 單一學生 : this.學生們) {
            單一學生.列印();
        }
    }
}
