package 不重複隨機整數;

import java.util.ArrayList;

public class exam_Main {
    static ArrayList<Integer> random_ary = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) {
            random_ary.add(get_newnum());
        }
        show_arraynum();
    }

    private static void show_arraynum() {
        System.out.print("取得不同的亂數陣列為: ");
        for (int listitem : random_ary) {
            System.out.print(listitem+" ");
        }

    }

    private static int get_newnum() {
        int newnum = (int) (Math.random() * 4);
        boolean havethesame = false;
        for (int i = 0; i < random_ary.size(); i++) {
            if (newnum == random_ary.get(i)) {
                havethesame = true;
            }
        }
        if (havethesame) {
            return get_newnum();
        } else {
            return newnum;
        }
    }

}
