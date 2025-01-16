package Course4; // 宣告程式所屬的套件為Course4

import java.util.Scanner; // 匯入Java的Scanner類別，用於讀取輸入

public class Non_R_Array2 { // 定義名稱為Non_R_Array2的類別

    public static void main(String[] args) { // 主程式進入點
        String[][] data = new String[3][]; // 宣告並初始化名為data的字串陣列，有3行但尚未指定列數
        Scanner scn = new Scanner(System.in); // 建立一個Scanner物件用於輸入讀取

        for (int x = 0; x < 3; x++) { // 開始一個迴圈，x從0到2
            System.out.print((x + 1) + "號同學接踵幾劑疫苗："); // 輸出提示訊息，詢問疫苗劑數
            data[x] = new String[scn.nextInt()]; // 根據輸入的疫苗劑數，初始化data的第x行，並指定列數
            for (int y = 0; y < data[x].length; y++) { // 開始內部迴圈，y從0到列數-1
                System.out.print("請輸入第" + (y + 1) + "次接踵日期："); // 輸出提示訊息，詢問接種日期
                data[x][y] = scn.next(); // 讀取輸入的接種日期，存儲到data的特定位置
            }
        }

        scn.close(); // 關閉Scanner物件，釋放資源

        for (int x = 0; x < 3; x++) { // 開始另一個迴圈，用於輸出接種日期
            System.out.print((x + 1) + "號同學接踵日期："); // 輸出同學編號
            for (int y = 0; y < data[x].length; y++) { // 開始內部迴圈，用於輸出接種日期
                System.out.print(" " + data[x][y]); // 輸出接種日期
            }
            System.out.println(); // 換行，移至下一位同學
        }
    }
}

