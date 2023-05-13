package 序列化存讀檔;

import java.io.Serializable;

public class model_籤詩內容範本 implements Serializable {
    int 籤號;
    String 卦名;
    String 吉凶;
    String 卦爻;
    String 卦詞;
    String 卦義;

    public model_籤詩內容範本(int 籤號, String 卦名, String 吉凶, String 卦爻, String 卦詞, String 卦義) {
        this.籤號 = 籤號;
        this.卦名 = 卦名;
        this.吉凶 = 吉凶;
        this.卦爻 = 卦爻;
        this.卦詞 = 卦詞;
        this.卦義 = 卦義;
    }
}
