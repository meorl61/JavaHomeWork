/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author 華美娟 <Maple Hua>
 */
public class 成績合計平均練習_使用範本 {

    //宣告物件變數
    private static S學生資料範本 學生1;
    private static S學生資料範本 學生2;
    private static S學生資料範本 學生3;
    
    public static void 跑流程() {
        設定初始值();
        列印學生成績();
    }
    
    public static void 設定初始值() {
        
        學生1 = new S學生資料範本();
        學生2 = new S學生資料範本();
        學生3 = new S學生資料範本();
        
        學生1.設定初始("學生1");
        學生2.設定初始("學生2");
        學生3.設定初始("學生3");
    }

    public static void 列印學生成績() {
        學生1.顯示學生成績();
        學生2.顯示學生成績();
        學生3.顯示學生成績();
    }

}
