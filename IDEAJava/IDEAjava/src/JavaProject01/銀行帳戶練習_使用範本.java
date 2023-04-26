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
public class 銀行帳戶練習_使用範本 {
    private static S_帳戶範本 客戶1;
    private static S_帳戶範本 客戶2;
    
    public static void 跑流程() {
        開戶();
        顯示客戶餘額();
    }
    
    public static void 開戶(){
        S_帳戶範本 客戶1 = new S_帳戶範本("張小美",500);
        S_帳戶範本 客戶2 = new S_帳戶範本("阿土伯",500);
    }
    
    public static void 顯示客戶餘額(){
        System.out.println( 客戶1.toString() );
        System.out.println( 客戶2.toString() );
    }
    
}
