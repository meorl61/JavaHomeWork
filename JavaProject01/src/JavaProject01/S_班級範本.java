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
    S_學生資料範本 新學生;

    public S_班級範本() {
        學生們 = new ArrayList<S_學生資料範本>();
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

    private String 新增學生姓名;

    /**
     * Get the value of 新增學生姓名
     *
     * @return the value of 新增學生姓名
     */
    public String get新增學生姓名() {
        return 新增學生姓名;
    }

    /**
     * Set the value of 新增學生姓名
     *
     * @param 新增學生姓名 new value of 新增學生姓名
     */
    public void set新增學生姓名(String 新增學生姓名) {
        新學生 = new S_學生資料範本();
        新學生.set學生姓名(新增學生姓名);
        this.學生們.add(新學生);

    }

    public void 顯示學生姓名() {
        int i = 0;
        System.out.println("班級: " + this.get班級名稱() + " 的學生名單如下:");
        for (S_學生資料範本 單一學生 : 學生們) {
            System.out.println(i + ": " + 單一學生.get學生姓名());
            i++;
        }
    }

    public void 顯示學生分數() {
        System.out.println("班級: " + this.get班級名稱() + " 的學生成績如下:");
        for (S_學生資料範本 單一學生 : 學生們) {
            單一學生.列印();
        }
    }

    public void 設定學生分數(int 學生編號) {
        String 學生姓名;
        學生姓名 = 學生們.get(學生編號).get學生姓名();
        學生們.get(學生編號).輸入分數(學生姓名);
    }
}
