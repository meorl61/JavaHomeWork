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
public class S1_帳本範本 {

    int 帳戶號碼;
    int 帳戶金額;
    public String 交易訊息;

    public String 帳本金額異動(String 異動方式, int 異動金額) {
        String result = "";
        if (異動金額 < 0) {
            result = "** " + 異動方式 + "交易失敗, 異動金額不正確! **\n";
        } else {
            switch (異動方式) {
                case "存款":
                    this.帳戶金額 += 異動金額;
                    result = "** 存款交易成功 **\n";
                    break;
                case "提款":
                    if (this.帳戶金額 >= 異動金額) {
                        this.帳戶金額 -= 異動金額;
                        result = "** 提款交易成功 **\n";
                    } else {
                        result = "** 交易錯誤: 提款失敗,餘額不足 **\n";
                    }
                    break;
            }
            System.out.println(異動方式+" 後餘額: "+ this.帳戶金額);
        }
        return result;
    }

    public void 顯示帳本資料() {
        System.out.println("帳號:" + this.帳戶號碼 + "　餘額: " + this.帳戶金額);
    }
}
