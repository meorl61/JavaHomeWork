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
public class S1_帳戶範本 {

    private int 帳戶號碼;
    private int 帳戶金額;
    public String 交易訊息;

    public int get帳戶號碼() {
        return 帳戶號碼;
    }

    public int get帳戶金額() {
        return 帳戶金額;
    }

    public void set帳戶號碼(int 帳戶號碼) {
        this.帳戶號碼 = 帳戶號碼;
    }

    public void set帳戶金額(int 帳戶金額) {
        this.帳戶金額 = 帳戶金額;
    }

    public void 開新帳戶(int 帳戶編號) {
        this.帳戶號碼 = 帳戶編號;

    }

    public String 帳戶金額異動(String 異動方式, int 異動金額) {
        String result = "";
        switch (異動方式) {
            case "存款":
                this.帳戶金額 += 異動金額;
                result = "** 存款交易成功 **\n";
                break;
            case "提款":
                if (this.帳戶金額 >= 異動金額) {
                    this.帳戶金額 -= 異動金額;
                    result ="** 提款交易成功 **\n";
                } else {
                    result ="** 交易錯誤: 提款失敗,餘額不足 **\n"; 

                }
                break;
        }
        return result;
    }

    public void 顯示帳戶資料(String 客戶名稱) {
        System.out.println("戶名: "+客戶名稱 + " 帳號: " + 帳戶號碼 + "　餘額: " + 帳戶金額);
    }
}
