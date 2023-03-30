
import JavaProject01.工具;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 華美娟 <Maple Hua>
 */
public class 測試工具 {

    public static int x;
    public static int y;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here               
        測試輸入();
        測試加總();
        測試平均();
    }

    private static void 測試輸入() {
        System.out.println("~~ 測試輸入工具 ~~");
        x = 工具.輸入整數資料("請輸入第一個大於0的值:");
        y = 工具.輸入整數資料("請輸入第二個大於0的值:");

        if (x > 0 && y > 0) {
            System.out.println("輸入的值分別為 " + x + ", " + y);
            System.out.println("測試輸入成功\n");
        } else {
            System.out.println("測試輸入失敗\n");
        }
    }

    private static void 測試加總() {

        System.out.println("~~ 測試加總工具 ~~");
        int 結果;
        結果 = 工具.加總(x, y);
        System.out.println("加總結果為:" + 結果);
        if (結果 == (x + y)) {
            System.out.println("測試加總成功\n");
        } else {
            System.out.println("測試加總失敗\n");
        }
    }

    private static void 測試平均() {
        System.out.println("~~ 測試平均工具 ~~");
        double 結果;
        int arr[] = {x, y};
        結果 = 工具.平均(arr);
        System.out.println("平均結果為:" + 結果);

        if (結果 == ((x + y) / 2.0)) {
            System.out.println("測試平均成功\n");
        } else {
            System.out.println("測試平均失敗\n");
        }
    }
}
