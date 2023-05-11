package Exam20230504;

import java.util.ArrayList;

public class Java_RandomTest_0504_華美娟 {
    static ArrayList 亂數陣列 = new ArrayList();

    public static void main(String[] args) {
        int runtimes = 3;  //取幾個數字
        取得數字(runtimes);
        顯示資料(runtimes);
    }

    private static void 取得數字(int runtimes) {
        while (亂數陣列.size() < runtimes) {

            int newnum = (int) (Math.random() * 49);

            if (亂數陣列.indexOf(newnum) == -1) {
                亂數陣列.add(newnum);
            }

        }
    }

    private static void 顯示資料(int runtimes) {
        System.out.print("取得" + runtimes + "個不同的亂數陣列為: " + 亂數陣列);
    }



}
