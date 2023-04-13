/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class S1_客戶範本 {

    String 客戶名稱;
    ArrayList<S1_帳本範本> 客戶所有帳本 = new ArrayList<S1_帳本範本>();

    public void 客戶交易選單() {
        System.out.println("\n============================");
        System.out.println(this.客戶名稱 + " 交易選單:");
        int 客戶選取功能 = 工具.輸入整數資料("0.回上層  1.開新帳本   2.存款   3.提款  4.顯示所有帳本明細");
        switch (客戶選取功能) {
            case 1:
                開新帳本();
                break;
            case 2:
                存提款交易("存款");
                break;
            case 3:
                存提款交易("提款");
                break;
            case 4:
                System.out.println("============================");
                System.out.println("～～ 帳本明細" + " ～～");
                顯示所有帳本明細();
        }
        if (客戶選取功能 != 0) {
            客戶交易選單();
        }
    }

    public void 開新帳本() {
        S1_帳本範本 新帳本 = new S1_帳本範本();
        int 目前客戶編號 = this.客戶所有帳本.size();
        新帳本.帳戶號碼 = 目前客戶編號;
        this.客戶所有帳本.add(新帳本);

        System.out.println("** 新增帳本成功 **");
        顯示所有帳本明細();
    }

    public void 存提款交易(String 交易方式) {
        System.out.println("\n========= " + 交易方式 + "交易 =======");

        if (this.客戶所有帳本.size() < 1) {
            System.out.println("** 交易錯誤: 請先開新帳戶 **");
        } else {
            System.out.println("");
            顯示所有帳本明細();
            int 目前帳戶編號 = 工具.輸入整數資料("\n請選擇你要 " + 交易方式 + " 的帳號");
            if(目前帳戶編號>=0 && 目前帳戶編號 <this.客戶所有帳本.size() ){
            this.客戶所有帳本.get(目前帳戶編號).顯示帳本資料();   //交易前金額

            int 交易金額 = 工具.輸入整數資料("請輸入要" + 交易方式 + "的金額");
            System.out.println("---" + 交易方式 + ": " + 交易金額 + "---");

            String 異動結果 = this.客戶所有帳本.get(目前帳戶編號).帳本金額異動(交易方式, 交易金額);
            System.out.println(異動結果);}
            else {
            System.out.println("帳戶編號輸入錯誤!!");    
            存提款交易(交易方式);
            }
        }
    }

    public void 顯示所有帳本明細() {
        System.out.println("戶名:"+this.客戶名稱);
        for (S1_帳本範本 帳戶 : this.客戶所有帳本) {
            帳戶.顯示帳本資料();
        }
    }

}
