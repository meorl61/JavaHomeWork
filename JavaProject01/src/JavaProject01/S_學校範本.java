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

    ArrayList<S_班級範本> 各班級 = new ArrayList<S_班級範本>();

    public  void 新增班級() {
        S_班級範本 單一班級 = new S_班級範本();
        String 班級名稱;
        班級名稱 = 工具.輸入文字資料("請輸入班級名稱:");
        單一班級.set班級名稱(班級名稱);
        this.各班級.add(單一班級);
        System.out.println(班級名稱 + ",新增完成");
    }

    public void 顯示各班級名稱() {
        int i = 0;
        for (S_班級範本 單一班 : this.各班級) {
            System.out.println(i + ": " + 單一班.get班級名稱() + "班");
            i++;
        }
    }
 
    public int 選擇班級() {
        顯示各班級名稱();
        int 班級編號;
        班級編號 = 工具.輸入整數資料("請選擇班級編號:");
        return 班級編號;
    }

    public  int 選擇學生(int 班級編號) {
        各班級.get(班級編號).顯示班級學生姓名();
        int 學生編號;
        學生編號 = 工具.輸入整數資料("請選擇學生編號:");
        return 學生編號;
    }

    public  void 新增學生(int 班級編號) {      
        各班級.get(班級編號).set新增學生();
    }

    public  void 輸入分數(int 班級編號) {
        int 學生編號;

        學生編號 = 選擇學生(班級編號);
        各班級.get(班級編號).設定學生分數(學生編號);

        if (工具.輸入01判斷資料1為真("是否繼續輸入" + 各班級.get(班級編號).get班級名稱() + " 成績? 0/1")) {
            輸入分數(班級編號);
        } else {
            System.out.println("新增結束");
        }
    }

    public  void 顯示所有學生(int 班級編號) {
        各班級.get(班級編號).顯示班級學生姓名();
    }

    public  void 顯示所有學生分數(int 班級編號) {
        各班級.get(班級編號).顯示學生分數();
    }
}
