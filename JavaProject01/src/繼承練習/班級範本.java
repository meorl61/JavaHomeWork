/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承練習;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class 班級範本 extends ArrayList_父容器 {

    private String 班級名稱;
    private ArrayList_父容器 學生們 = new ArrayList_父容器();
    private 學生範本 新學生;

    public void 新增學生(String 學生姓名, int 國文成績, int 英文成績) {
        新學生 = new 學生範本(學生姓名, 國文成績, 英文成績);
        學生們.add項目(新學生);
        System.out.println("新增:" + 學生姓名);
    }

    public void set班級名稱(String 班級名稱) {
        this.班級名稱 = 班級名稱;
        System.out.println(班級名稱 + ", 新增完成\n");
    }

    @Override   //重寫 ArrayList_父容器的 show()
    public void show() {
        System.out.println("\n" + this.班級名稱);
        this.學生們.get項目s().stream().map(a學生 -> (學生範本) a學生).forEachOrdered(
                學生 -> {
                    學生.show();
                }
        );
    }

    public void show2() {  //原始寫法
        System.out.println("\n" + this.班級名稱);
        ArrayList<Object> 學生們 = this.學生們.get項目s();
        for (Object a學生 : 學生們) {
            學生範本 學生 = (學生範本) a學生;
            學生.show();
        }
    }
}
