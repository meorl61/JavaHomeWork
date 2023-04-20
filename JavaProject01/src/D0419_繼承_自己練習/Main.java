/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0419_繼承_自己練習;

/**
 *
 * @author 華美娟
 */
public class Main {

    static ArrayList_父容器 學校 = new ArrayList_父容器();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        學校範本 新學校 = new 學校範本();

        新增學校及班級("皇家學校", "大大班", "中中班");
        新增學校及班級("錢多多學校", "大億班", "中億班");

        show顯示所有學校資料();

    }

    private static void 新增學校及班級(String 學校名稱, String 班級1, String 班級2) {
        學校範本 新學校 = new 學校範本();
        System.out.println("====== ～ 新增學校:" + 學校名稱 + " ～ ======");
        新學校.set學校名稱(學校名稱);

        System.out.println("== ～ 新增班級 ～ ==");
        新學校.新增班級(班級1);
        新學校.新增班級(班級2);

        學校.add項目(新學校);
    }

    private static void show顯示所有學校資料() {
        System.out.println("============================");
        System.out.println("\n～ 顯示學校資料 ～");

        學校.get項目s().stream().map(各校 -> (學校範本) 各校).forEachOrdered(
                各級學校 -> {
                    各級學校.show();
                }
        );
    }
}
