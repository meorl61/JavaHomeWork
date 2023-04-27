package 存檔練習_觀音32籤;

import 存檔練習_觀音32籤.畫面介面;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main_Controller {

    public static HashMap<String, Object> 籤筒 = new HashMap();

    public static void main(String[] args) {

      讀資料();  //只讀一次就可以

      畫面介面.PageMain();  //開啟主畫面

        String 占卦 = 自動搖卦(1);
        顯示結果(占卦);

    }

    public static void 顯示結果(String 卦爻) {
        觀音靈課_Model 抽到籤 = new 觀音靈課_Model();
        抽到籤 = (觀音靈課_Model) 籤筒.get(卦爻);
        觀音靈課_View.顯示資料(抽到籤.籤號, 抽到籤.卦爻, 抽到籤.卦名, 抽到籤.吉凶, 抽到籤.卦詞, 抽到籤.卦義);
    }

    public static String 自動搖卦(int 第幾次) {
        int 擲骰 = (int) (Math.random() * 2);
        char resultstr = '○';

        if (擲骰 != 0) {
            String word5 = "金木水火土";
            resultstr = word5.charAt(第幾次 - 1);
        }

        if (第幾次 < 5) {
            return resultstr + 自動搖卦(第幾次 + 1);
        }
        return "" + resultstr;
    }

    public static void 讀資料() {

        //存檔
        觀音靈課_Model_Data 籤詩檔案 = new 觀音靈課_Model_Data();

        籤詩檔案.建檔();

        讀存檔 存檔 = new 讀存檔();
        存檔.set資料(籤詩檔案.get籤筒());
        try {
            存檔.存檔();
            System.out.println("存檔成功");
        } catch (Exception e) {
            System.out.println("存檔失敗");
            System.out.println(e.toString());
        }

        //讀檔
        讀存檔 讀檔 = new 讀存檔();

        try {
            讀檔.讀檔();
            System.out.println("讀檔成功");
        } catch (Exception e) {
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
        }

        籤筒 = 讀檔.get資料();

    }

}
