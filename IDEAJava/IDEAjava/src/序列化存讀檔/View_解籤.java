package 序列化存讀檔;

public class View_解籤 {

    public static void 顯示解卦說明(model_籤詩內容範本 抽到的籤) {
        System.out.println("\n～～～～～～～～～～～～～～～～～");
        System.out.println("　　**  觀音靈課32籤  **");
        System.out.println("～～～～～～～～～～～～～～～～～");
        System.out.println("\n你搖到的卦爻為:\n" + 抽到的籤.卦爻);
        System.out.println("\n第" + 抽到的籤.籤號 + "籤");
        System.out.println(抽到的籤.卦名);
        System.out.println(抽到的籤.吉凶);
        System.out.println("\n卦詞:\n" + 抽到的籤.卦詞);
        System.out.println("\n卦義:\n" + 抽到的籤.卦義);
        System.out.println("～～～～～～～～～～～～～～～～～");

    }
}
