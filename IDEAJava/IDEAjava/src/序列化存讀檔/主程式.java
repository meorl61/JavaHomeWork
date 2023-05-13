package 序列化存讀檔;

public class 主程式 {

    static c_讀存檔 籤筒 = new c_讀存檔();

    public static void main(String[] args) {
        if (讀檔()) {
            model_籤詩內容範本 抽到的籤 = 籤筒.取籤詩(搖卦(5));
            View_解籤.顯示解卦說明(抽到的籤);
        } else {
            System.out.println("檔案資料異常,無法執行");
        }
    }

    public static String 搖卦(int 次數) {
        int 擲骰 = (int) (Math.random() * 2);
        char resultstr = (擲骰 != 0) ? "金木水火土".charAt(5 - 次數) : '○';

        if (-- 次數 > 0) {
            return resultstr + 搖卦(次數);
        } else {
            return "" + resultstr;
        }
    }

    public static boolean 讀檔() {

        try {
            籤筒.讀檔();
            System.out.println("讀檔成功");
            return true;
        } catch (Exception e) {
            if (建檔()) {
                try {
                    籤筒.讀檔();
                    System.out.println("讀檔成功");
                    return true;
                } catch (Exception e1) {
                    System.out.println("讀檔失敗");
                    System.out.println(e1.toString());
                    return false;
                }
            } else {
                System.out.println("建檔失敗");
                return false;
            }
        }
    }

    public static boolean 建檔() {
        model_籤詩檔 籤詩資料 = new model_籤詩檔();
        籤詩資料.建存檔();
        籤筒.set籤筒(籤詩資料.get籤詩32首());
        try {
            籤筒.存檔();
            System.out.println("建檔成功");
            return true;
        } catch (Exception e) {
            System.out.println("建檔失敗");
            System.out.println(e.toString());
            return false;
        }
    }
}
