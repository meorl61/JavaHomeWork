/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0427_映射容器Map_自我挑戰_設計ExtraData存放App額外資料;

import java.util.ArrayList;

/**
 *
 * @author 華美娟
 */
public class Main_TestExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> list;
        list = new ArrayList();
        list.add(new Student("Jack", 80, 85));
        list.add(new Student("Amy", 70, 75));

        ExtraData data;
        data = new ExtraData();

        //寄資料
        data.putExtra("成績", 100);
        data.putExtra("名字", "Tom");
        data.putExtra("陣列", list);

        //取資料
        int 成績 = data.getIntExtra("成績");
        CharSequence 名字 = data.getCharSequenceExtra("名字");
        ArrayList<Student> 陣列 = (ArrayList<Student>) data.getObjectExtra("陣列");

        System.out.println(成績);
        System.out.println(名字);

        for (Student x : 陣列) {
            Student 學生 = (Student) x;
            學生.show();
            //System.out.println(x.toString());
        }
    }

}
