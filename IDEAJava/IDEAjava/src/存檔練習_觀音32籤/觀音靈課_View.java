package 存檔練習_觀音32籤;

import javax.swing.*;

public class 觀音靈課_View {
    public static void 顯示資料(int 籤號,String 卦爻, String 卦名, String 吉凶, String 卦詞,String 卦義){

        System.out.println("\n" + 卦爻);
        System.out.println("\n你抽到第 " + 籤號 + " 卦: " + 卦名);
        System.out.println(吉凶 + " 籤");
        System.out.println("\n籤詩: " + 卦詞);
        System.out.println("解譯: " + 卦義);

    }
}
