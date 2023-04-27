package 畫面介面練習;

import javax.swing.*;
import java.awt.*;
public class 練習一 {
    public static void main(String args[]){
        //創建框架
        JFrame frame = new JFrame("聊天框");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //創建MenuBar並添加組件
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("文件");
        JMenu m2 = new JMenu("幫助");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("打開");
        JMenuItem m22 = new JMenuItem("另存為");
        m1.add(m11);
        m1.add(m22);

        //在底部創建面板並添加組件
        JPanel panel面板 = new JPanel(); // 面板在輸出中不可見
        JLabel label = new JLabel("輸入文本");
        JTextField tf = new JTextField(10); // 最多接受 10 個字符
        JButton send = new JButton("發送");
        JButton reset = new JButton("重置");
        panel面板.add(label);// 使用流式佈局添加的組件
        panel面板.add(tf);
        panel面板.add(send);
        panel面板.add(reset);

        // 文本區域在中心
        JTextArea ta = new JTextArea();

        //將組件添加到框架中。
        frame.getContentPane().add(BorderLayout.SOUTH, panel面板);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
