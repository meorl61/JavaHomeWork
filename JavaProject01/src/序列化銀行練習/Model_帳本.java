/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化銀行練習;

import java.io.Serializable;

/**
 *
 * @author 華美娟
 */
public class Model_帳本 implements Serializable{
        private String 帳號;
    private int 餘額;

    public Model_帳本(String 帳號) {
        this.帳號 = 帳號;
    }

    public void set帳號(String 帳號) {
        this.帳號 = 帳號;
    }

    public void set餘額(int 餘額) {
        this.餘額 = 餘額;
    }   

    public CharSequence get帳號() {
        return 帳號;
    }

    public void show(){
        System.out.println("帳號: "+this.帳號+"  餘額: "+this.餘額 );
    }
    
}
