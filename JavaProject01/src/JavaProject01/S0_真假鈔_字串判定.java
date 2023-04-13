/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

/**
 *
 * @author ammam
 */
public class S0_真假鈔_字串判定 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String 真鈔 = "1000";
        String 真鈔再版 = 真鈔;
        String 合併真鈔 = "1" + "0" + "0" + "0";

        String 版1 = "10";
        String 版2 = "00";
        String 合版偽鈔 = 版1 + 版2;

        //用 == 來判定是不是同一份
        System.out.println("真鈔(" + 真鈔 + ") == " + "真鈔再版(" + 真鈔再版 + ") " + (真鈔 == 真鈔再版));
        System.out.println("真鈔(" + 真鈔 + ") == " + "合併真鈔(" + 合併真鈔 + ") " + (真鈔 == 合併真鈔));
        System.out.println("真鈔(" + 真鈔 + ") == " + "合版偽鈔(" + 合版偽鈔 + ") " + (真鈔 == 合版偽鈔));

        //用 equals 來判定裡面的宇元是不是相同
        System.out.println("真鈔內容(" + 真鈔 + ") == " + "合版偽鈔內容(" + 合版偽鈔 + ") " + 真鈔.equals(合版偽鈔));

    }

}
