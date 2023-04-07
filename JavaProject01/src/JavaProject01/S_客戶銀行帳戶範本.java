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
public class S_客戶銀行帳戶範本 {

    private String 帳戶名稱;
    private int 餘額;

    /*
    封裝, 不要直接指定, 要用set 方式
    
    public S_帳戶範本加建構子(String 帳戶名稱, int 餘額) {
        this.帳戶名稱 = 帳戶名稱;
        this.餘額 = 餘額;
    }
     */
    @Override
    public String toString() {
        String msg;
        msg = "\n~~~ 操作: 顯示帳戶資訊 ~~~";
        msg += "\n帳 戶 名: " + this.帳戶名稱;
        msg += "\n帳戶餘額: " + this.餘額 ;
        return msg;
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

    public void 開戶(String 開戶客戶,int 開戶金額) {
        //String 開戶客戶;
        //int 開戶金額;
        // 客戶 = new S_帳戶範本加建構子(工具.輸入文字資料("請輸入開戶者姓名:"),工具.輸入整數資料("請輸入開戶金額: "));
        //改使用封裝
        //開戶客戶 = 工具.輸入文字資料("請輸入開戶者姓名:");
        //開戶金額 = 工具.輸入整數資料("請輸入開戶金額: ");
        set帳戶名稱(開戶客戶);
        set餘額(開戶金額);
        //System.out.println("開戶成功");
        System.out.println("開戶人: " + get帳戶名稱() + "  開戶金額: " + get餘額());

    }

    public void 存款() {
        int 交易金額;
        System.out.println("\n~~~ 操作: 存款交易 ~~~");
        交易金額 = 工具.輸入整數資料("請輸入你要存入的金額: ");
        set餘額(this.餘額 + 交易金額);
        System.out.println("交易方式: 存入 " + 交易金額 + "\n存款交易成功");
        System.out.print("帳戶可用餘額: " + 餘額);
    }

    public void 提款() {
        int 交易金額;
        System.out.println("\n~~~ 操作: 提款交易 ~~~");
        交易金額 = 工具.輸入整數資料("請輸入你要提款的金額: ");
        if (this.餘額 >= 交易金額) {
            set餘額(this.餘額 - 交易金額);
            System.out.println("交易方式: 提款 " + 交易金額 + " \n提款交易成功");
        } else {
            System.out.println("交易方式: 提款 " + 交易金額 + " \n***交易失敗, 餘額不足***");
        }
        System.out.print("帳戶可用餘額: " + 餘額);
    }

}
