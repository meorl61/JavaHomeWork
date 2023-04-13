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
public class S1銀行測試 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        S1_帳本範本 新帳本a = new S1_帳本範本();
        String 交易結果;
        新帳本a.顯示帳本資料();
        交易結果=新帳本a.帳本金額異動("存款",100);
        System.out.println(交易結果);
        交易結果=新帳本a.帳本金額異動("存款",100);
        System.out.println(交易結果);
        交易結果=新帳本a.帳本金額異動("存款",100);
        System.out.println(交易結果);
        新帳本a.顯示帳本資料();
        
        交易結果=新帳本a.帳本金額異動("提款",500);
        System.out.println(交易結果);
        新帳本a.顯示帳本資料();
        交易結果=新帳本a.帳本金額異動("提款",100);
        System.out.println(交易結果);
        新帳本a.顯示帳本資料();
    }
    
}
