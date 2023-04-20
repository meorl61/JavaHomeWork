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
public class 帳本範本 implements Serializable {

    private String 帳號;
    private int 餘額;

    public 帳本範本(String 帳號) {
        this.帳號 = 帳號; //
        this.餘額 = 0;
    }

    public void set餘額(int 餘額) {
        this.餘額 = 餘額;
    }

    public void 存提款(String 交易方式, int 交易金額) {
        switch (交易方式) {
            case "存款":
                this.餘額 += 交易金額;
                System.out.println("存款成功!!!");
                break;
            case "提款":
                if (this.餘額 < 交易金額) {
                    System.out.println("提款交易失敗, 餘額不足!!!");
                } else {
                    this.餘額 -= 交易金額;
                    System.out.println("提款成功!!!");
                }
                break;
        }
        System.out.println(this.帳號 + " 帳本餘額: " + this.餘額);

    }

    public CharSequence get帳號() {
        return 帳號;
    }

    public void show() {
        System.out.println("帳本號: " + this.帳號 + "  餘額: " + this.餘額);
    }

}
