/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0419_繼承_自己練習;

/**
 *
 * @author 華美娟
 */
public class 學生範本 {

    private String 姓名;
    private int 國文成績;
    private int 英文成績;

    public 學生範本(String 姓名, int 國文成績, int 英文成績) {
        this.姓名 = 姓名;
        this.國文成績 = 國文成績;
        this.英文成績 = 英文成績;
    }

    public void show(){
        int 合計 = this.國文成績 + this.英文成績;
        double 平均 = 合計 / 2.0;
        System.out.println("=========================");
        System.out.println("學生姓名: " + this.姓名);
        System.out.println("  => 國文成績:" + this.國文成績 + " 英文成績:" + this.英文成績);
        System.out.println("  => 成績總分:" + 合計 + " 平均:" + 平均);
    }   

}
