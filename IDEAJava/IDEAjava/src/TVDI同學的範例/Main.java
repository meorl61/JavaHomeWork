/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TVDI同學的範例;

import java.util.ArrayList;
import javax.swing.JOptionPane;

//主程式
class Main {

    static ArrayList<Company> com = new ArrayList<>();  //宣告銀行

    public static void main(String[] args) {
        Interface.Style();      //載入介面
        Interface.PageMain();  //開啟主畫面
    }
    
    //錯誤提示
    static void Msg(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

}
