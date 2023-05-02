package 不重複隨機整數;

public class main {
    static int[] 數字陣列 = new int[3] ;

    public static void main(String[] args) {

        System.out.println("隨機產生的陣列為：");
        
        for (int i = 0; i < 3; i++) {
            數字陣列[i] = 取得數字不重覆亂數();
            System.out.print(數字陣列[i] + " ");
        }
    }

    public static int 取得數字不重覆亂數() {

        int 取得亂數 = (int) (Math.random() * 4);

        for (int j = 0; j < 數字陣列.length; j++) {
            if (數字陣列[j] == 取得亂數) {
                取得亂數 = -1;
            }
        }

        if ( 取得亂數 < 0 ) {
            return 取得數字不重覆亂數();  //有重覆則再跑一次
        } else {
            return 取得亂數;
        }
    }
}
