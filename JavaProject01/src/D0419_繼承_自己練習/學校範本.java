/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0419_繼承_自己練習;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class 學校範本 extends ArrayList_父容器 {

    private String 學校名稱;
    private ArrayList_父容器 學校班級s = new ArrayList_父容器();
    private 班級範本 新班級;

    public void 新增班級(String 班級名稱) {
        新班級 = new 班級範本();

        //每班三人, 隨機產生分數
        新班級.新增學生(班級名稱 + "_A君", (int) (Math.random() * 101), (int) (Math.random() * 101));
        新班級.新增學生(班級名稱 + "_B君", (int) (Math.random() * 101), (int) (Math.random() * 101));
        新班級.新增學生(班級名稱 + "_C君", (int) (Math.random() * 101), (int) (Math.random() * 101));
        新班級.set班級名稱(班級名稱);
        學校班級s.add項目(新班級);
    }

    public void set學校名稱(String 學校名稱) {
        this.學校名稱 = 學校名稱;
    }

    @Override   //重寫 ArrayList_父容器的 show()
    public void show() {
        System.out.println("\n*****************************");
        System.out.println("～～ " + this.學校名稱 + " 各班學期成績 ～～");

        //多執行序寫法
        this.學校班級s.get項目s().stream().map(班級 -> (班級範本) 班級).forEachOrdered(
                轉換班級 -> {
                    轉換班級.show();
                }
        );
    }

    public void show2() {  //原始寫法
        System.out.println("\n*****************************");
        System.out.println("～～ " + this.學校名稱 + " 各班學期成績 ～～");

        ArrayList<Object> 學校班級s = this.學校班級s.get項目s();  //取得Object資料
        for (Object 班級 : 學校班級s) {
            班級範本 轉換班級 = (班級範本) 班級;
            轉換班級.show();
        }
    }
}
