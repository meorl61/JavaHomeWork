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
public class S_帳戶範本 {

    private String 帳戶名稱;
    private int 帳戶餘額;

    //建構子
    public S_帳戶範本(String 客戶姓名, int 第一次存入金額) {
        this.帳戶名稱 = 客戶姓名;
        this.帳戶餘額 = 第一次存入金額;
    }

    public String toString() {
        return "帳戶名稱: " + this.帳戶名稱 + " " + "帳戶餘額: " + this.帳戶餘額;
    }
}
