package 存檔練習_觀音32籤;

import static 存檔練習_觀音32籤.Main_Controller.觀音靈課32籤1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public interface 畫面介面 {
    static JFrame 視窗 = new JFrame("觀音32籤");
    static JButton 抽籤鈕 = new JButton("抽籤");
    static JPanel 顯示區塊 = new JPanel();

    static JLabel 籤號文字塊 = new JLabel();
    static JLabel 卦名文字塊 = new JLabel();
    //static JLabel 吉凶文字塊 = new JLabel();
    static JLabel 卦爻文字塊 = new JLabel();
    static JTextPane 卦詞文字塊 = new JTextPane();
    static JTextPane 卦義文字塊 = new JTextPane();
    static JTextField tf = new JTextField();  //文字輸入框

    static void PageMain() {
        Reset("主畫面");

        顯示區塊.setLayout(new GridLayout(4, 1));
        //顯示區塊2.setLayout(new GridLayout(2, 2, 0, 5));
        Style();

        //顯示區塊.add(卦爻文字塊);

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
       // 吉凶文字塊.setHorizontalAlignment(JLabel.CENTER);
       // 吉凶文字塊.setFont(new Font("標楷體", Font.BOLD, 36));
        卦詞文字塊.setFont(new Font("標楷體", Font.BOLD, 18));

        //卦義文字塊.setHorizontalAlignment(JTextPane.CENTER_ALIGNMENT);
        卦義文字塊.setFont(new Font("標楷體", Font.BOLD, 18));
       // 卦義文字塊.setMinimumSize(-1,50);

        抽籤鈕.setFont(new Font("標楷體", Font.BOLD, 36));
        抽籤鈕.addActionListener(e -> {
            String 占卦 = Main_Controller.自動搖卦(1);
            卦爻文字塊.setText(占卦);
            Main_Controller.顯示(占卦);
        });

        視窗.add(卦爻文字塊, BorderLayout.NORTH);
        視窗.add(顯示區塊, BorderLayout.CENTER);
        視窗.add(抽籤鈕, BorderLayout.SOUTH);
        顯示區塊.add(籤號文字塊);
        顯示區塊.add(卦名文字塊);
       // 顯示區塊.add(吉凶文字塊, BorderLayout.CENTER);
        顯示區塊.add(卦詞文字塊);
        顯示區塊.add(卦義文字塊);
        // tf.setHorizontalAlignment(JTextField.CENTER);
        // tf.setFont(new Font("標楷體", Font.PLAIN, 36));
        視窗.setVisible(true);
    }

    //介面重置
    static boolean Reset(String s) {
        // if (!s.equals("主畫面") && !s.equals("設立銀行") && 觀音靈課32籤1.isEmpty()) {
        //     JOptionPane.showMessageDialog(null, "尚未設立銀行");
        //     return true;
        // } else {
        //卦爻文字塊.setText(s);
        顯示區塊.removeAll();
        視窗.add(抽籤鈕, BorderLayout.NORTH);
/*
            for (ActionListener al : btn7.getActionListeners()) {
                btn7.removeActionListener(al);
            }

 */
        return false;
        //}
    }
}
