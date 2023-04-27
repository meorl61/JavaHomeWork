package 存檔練習_觀音32籤;

import 存檔練習_觀音32籤.畫面介面;

import javax.swing.*;
import java.util.ArrayList;

public class Main_Controller {
    static ArrayList<觀音靈課_Model> 觀音靈課32籤1 = new ArrayList<觀音靈課_Model>();

    public static void main(String[] args) {



        畫面介面.Style();      //載入介面
        畫面介面.PageMain();  //開啟主畫面

        String 占卦 = 自動搖卦(1);


    }

    public static void 顯示(String 卦爻){
        觀音靈課32籤1 = 讀資料();
        for (觀音靈課_Model 讀檔a : 觀音靈課32籤1) {
            if (讀檔a.卦爻.equals(卦爻)) {
                畫面介面.籤號文字塊.setText("你抽到 第 "+Integer.toString(讀檔a.籤號) + " 卦 "+讀檔a.吉凶 + " 卦");
                畫面介面.卦名文字塊.setText(讀檔a.卦名);
                畫面介面.卦詞文字塊.setText("卦詞: \n"+讀檔a.卦詞);
                畫面介面.卦義文字塊.setText("卦義: \n"+讀檔a.卦義);

                觀音靈課_View.顯示資料(讀檔a.籤號, 讀檔a.卦爻, 讀檔a.卦名, 讀檔a.吉凶, 讀檔a.卦詞, 讀檔a.卦義);
            }
        }
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

    public static ArrayList<觀音靈課_Model> 讀資料() {
        //存檔
        觀音靈課_Model_Data 籤詩檔案 = new 觀音靈課_Model_Data();

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

        //讀檔
        讀存檔 讀檔 = new 讀存檔();

        try {
            讀檔.讀檔();
            System.out.println("讀檔成功");
        } catch (Exception e) {
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
        }
        籤詩檔案 = 讀檔.get資料();
        return 籤詩檔案.get觀音靈課資料();
    }

}
