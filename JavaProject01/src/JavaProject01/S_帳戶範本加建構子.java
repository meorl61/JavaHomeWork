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
public class S_帳戶範本加建構子 {
    String 帳戶名稱;
    int 餘額;

    /*
    封裝, 不要直接指定, 要用set 方式
    
    public S_帳戶範本加建構子(String 帳戶名稱, int 餘額) {
        this.帳戶名稱 = 帳戶名稱;
        this.餘額 = 餘額;
    }
   */
    @Override
    public String toString() {
        return  "戶名: " + 帳戶名稱 + " 帳戶餘額: " + 餘額 + '\n';
    }

    public String get帳戶名稱() {
        return 帳戶名稱;
    }

    public void set帳戶名稱(String 帳戶名稱) {
        this.帳戶名稱 = 帳戶名稱;
    }

    public int get餘額() {
        return 餘額;
    }

    public void set餘額(int 餘額) {
        this.餘額 = 餘額;
    }
    
}
