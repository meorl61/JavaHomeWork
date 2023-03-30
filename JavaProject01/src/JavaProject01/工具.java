/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject01;

import java.util.Scanner;

/**
 *
 * @author 華美娟
 */
public class 工具 {
    private static Scanner sc = new Scanner(System.in,"BIG5");
    private static Scanner sc_e = new Scanner(System.in);
    
    public static String 輸入文字資料(String 訊息){
        String keyword;
        System.out.println(訊息);
        keyword = sc.next();
        return keyword;
    }
    
    public static int 輸入整數資料(String 訊息){
        int keyword;
        System.out.println(訊息);
        keyword = sc.nextInt();
        return keyword;
    }
}
