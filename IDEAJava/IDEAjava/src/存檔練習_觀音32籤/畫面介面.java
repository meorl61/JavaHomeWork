package 存檔練習_觀音32籤;

import javax.swing.*;
import java.awt.*;

public interface 畫面介面 {
    static JFrame 視窗 = new JFrame("觀音32籤");
    static JButton 抽籤鈕 = new JButton("抽籤");
    static JPanel 顯示區塊 = new JPanel();
    static JLabel 籤號文字塊 = new JLabel();
    static JLabel 卦名文字塊 = new JLabel();
    static JLabel 卦爻文字塊 = new JLabel();
    static JTextPane 卦詞文字塊 = new JTextPane();
    static JTextPane 卦義文字塊 = new JTextPane();

    static void PageMain() {
        Style();
    }

    //基本設定
    static void Style() {
        視窗.setSize(380, 600);
        視窗.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        視窗.setLayout(new BorderLayout());

        籤號文字塊.setHorizontalAlignment(JLabel.CENTER);
        籤號文字塊.setFont(new Font("標楷體", Font.BOLD, 28));
        卦爻文字塊.setHorizontalAlignment(JLabel.CENTER);
        卦爻文字塊.setFont(new Font("標楷體", Font.BOLD, 36));
        卦名文字塊.setHorizontalAlignment(JLabel.CENTER);
        卦名文字塊.setFont(new Font("標楷體", Font.BOLD, 32));
        卦詞文字塊.setFont(new Font("標楷體", Font.BOLD, 18));
        卦義文字塊.setFont(new Font("標楷體", Font.BOLD, 18));

        抽籤鈕.setFont(new Font("標楷體", Font.BOLD, 36));

        抽籤鈕.addActionListener(e -> {
            String 占卦 = Main_Controller.自動搖卦(1);
            卦爻文字塊.setText(占卦);
            Main_Controller.顯示結果(占卦);
        });

        視窗.add(卦爻文字塊, BorderLayout.NORTH);
        視窗.add(顯示區塊, BorderLayout.CENTER);
        視窗.add(抽籤鈕, BorderLayout.SOUTH);
        顯示區塊.setLayout(new GridLayout(4, 1));
        顯示區塊.add(籤號文字塊);
        顯示區塊.add(卦名文字塊);
        顯示區塊.add(卦詞文字塊);
        顯示區塊.add(卦義文字塊);
        視窗.setVisible(true);
    }

}
