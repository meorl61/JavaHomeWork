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

    private static Scanner sc = new Scanner(System.in, "BIG5");

    public static String 輸入文字資料(String 訊息) {
        String keyword;
        System.out.println(訊息);
        keyword = sc.next();
        return keyword;
    }

    public static int 輸入整數資料(String 訊息) {
        int keyword;
        System.out.println(訊息);
        keyword = sc.nextInt();
        return keyword;
    }

    public static int 加總(int arr[]) {
        int c;
        c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += arr[i];
        }
        return c;
    }

    public static double 平均(int arr[]) {        
        double avg;        
        avg = 加總(arr) / (arr.length * 1.0);
        return avg;
    }

}
