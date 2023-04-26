/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author 華美娟
 */
public class 日期封裝_使用範本 {

    private static S_日期範本 v_國曆日期;

    public static void 跑流程() {
        設定日期();
    }

    public static void 設定日期() {
        v_國曆日期 = new S_日期範本();
        
        
        v_國曆日期.S_日期範本(1972, 5, 31);  //使用建構子
        
        v_國曆日期.set年(2024);
        v_國曆日期.set月(13);
        v_國曆日期.set日(31);
        System.out.println(v_國曆日期);
        v_國曆日期.set月(7);
        System.out.println(v_國曆日期);
        v_國曆日期.set月(2);
        System.out.println(v_國曆日期);
        
        
    }
}
