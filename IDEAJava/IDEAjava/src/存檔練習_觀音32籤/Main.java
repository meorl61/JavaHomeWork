package 存檔練習_觀音32籤;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<觀音靈課_Model> 觀音靈課32籤1 = new ArrayList<觀音靈課_Model>();
        觀音靈課Data 籤詩檔案 = new 觀音靈課Data();

        //存檔
        籤詩檔案.建檔();

        讀存檔 存檔 = new 讀存檔();
        存檔.set資料(籤詩檔案);
        try {
            存檔.存檔();
            System.out.println("存檔成功");
        } catch (Exception e) {
            System.out.println("存檔失敗");
            System.out.println(e.toString());
        }

        讀存檔 讀檔 = new 讀存檔();

        try {
            讀檔.讀檔();
            System.out.println("讀檔成功");
        } catch (Exception e) {
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
        }

        String 占卦 = "";
        for (int i = 1; i < 6; i++) {
            占卦 += 搖卦(i);
        }

        籤詩檔案 = 讀檔.get資料();
        觀音靈課32籤1 = 籤詩檔案.get觀音靈課資料();

        for (觀音靈課_Model 讀檔a : 觀音靈課32籤1) {
            if (讀檔a.卦爻.equals(占卦)) {
                System.out.println(讀檔a.卦爻);
                System.out.println("你抽到第 " + 讀檔a.籤號 + " 卦: " + 讀檔a.卦名);
                System.out.println(讀檔a.吉凶 + " 籤");
                System.out.println("籤詩: " + 讀檔a.卦詞);
                System.out.println("解譯: " + 讀檔a.卦義);
            }
        }
    }

    public static String 搖卦(int 第幾次) {
        int 擲骰 = (int) (Math.random() * 2);
        String resultstr = "○";
        if (擲骰 != 0) {
            switch (第幾次) {
                case 1:
                    resultstr = "金";
                    break;
                case 2:
                    resultstr = "木";
                    break;
                case 3:
                    resultstr = "水";
                    break;
                case 4:
                    resultstr = "火";
                    break;
                case 5:
                    resultstr = "土";
                    break;
            }

        }
        return resultstr;
    }
}
