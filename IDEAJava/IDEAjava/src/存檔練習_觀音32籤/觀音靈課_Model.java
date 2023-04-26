package 存檔練習_觀音32籤;

import java.io.Serializable;

public class 觀音靈課_Model implements Serializable {
    int 籤號;
    String 卦名;
    String 吉凶;
    String 卦爻;
    String 卦詞;
    String 卦義;

    public void set資料(int 籤號,String 卦名,String 吉凶,String 卦爻,String 卦詞,String 卦義) {
        this.籤號 = 籤號;
        this.卦名 = 卦名;
        this.吉凶 = 吉凶;
        this.卦爻 = 卦爻;
        this.卦詞 = 卦詞;
        this.卦義 = 卦義;
    }
}
