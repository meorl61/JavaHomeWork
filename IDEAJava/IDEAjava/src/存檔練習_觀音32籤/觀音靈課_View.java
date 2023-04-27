package 存檔練習_觀音32籤;

import javax.swing.*;

public class 觀音靈課_View {
    public static void 顯示資料(int 籤號,String 卦爻, String 卦名, String 吉凶, String 卦詞,String 卦義){

        System.out.println("\n" + 卦爻);
        System.out.println("\n你抽到第 " + 籤號 + " 卦: " + 卦名);
        System.out.println(吉凶 + " 籤");
        System.out.println("\n籤詩: " + 卦詞);
        System.out.println("解譯: " + 卦義);

        畫面介面.卦爻文字塊.setText(卦爻);
        畫面介面.籤號文字塊.setText("你抽到 第 " + Integer.toString(籤號) + " 卦 " + 吉凶 + " 卦");
        畫面介面.卦名文字塊.setText(卦名);
        畫面介面.卦詞文字塊.setText("卦詞: \n" + 卦詞);
        畫面介面.卦義文字塊.setText("卦義: \n" + 卦義);
    }
}
