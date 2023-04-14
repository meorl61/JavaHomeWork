/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 測試視窗;
import static 測試視窗.Interface.tf;
import java.awt.event.*;

//監聽文字框
class Listener implements FocusListener {

    static String s = "";

    Listener(String w) {
        s = w;
    }

    //清除、顯示預設文字
    public void focusGained(FocusEvent e) {
        if (tf.getText().equals(s)) {
            tf.setText("");
        }
    }

    public void focusLost(FocusEvent e) {
        if (tf.getText().equals("")) {
            tf.setText(s);
        }
    }

}