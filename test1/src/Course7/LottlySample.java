package Course7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LottlySample {
    public static void main(String[] args) {
        // 創建一個包含 49 個整數的數組
        int[] lot = new int[49];
        // 創建一個空字串以存儲結果
        String str = "";
        // 創建一個包含 7 個整數的數組，用於存儲彩票號碼
        int[] myNum = new int[7];
        int maxIndex; // 用於跟蹤最大索引
        int r = 0; // 用於存儲隨機數

        // 開始迴圈，生成 10 組樂透號碼
        for (int k = 0; k < 10; k++) {
            str += "第" + (k + 1) + "組："; // 添加組數標記

            maxIndex = lot.length - 1;

            // 初始化數組 lot，包含 1 到 49 的整數
            for (int i = 0; i < lot.length; i++) {
                lot[i] = (i + 1);
            }

            // 生成 6 個隨機不重複的數字，並將其存儲在 myNum 數組中
            for (int i = 0; i < myNum.length; i++) {
                r = (int) Math.floor(Math.random() * maxIndex);
                myNum[i] = lot[r];
                lot[r] = lot[maxIndex];
                maxIndex--;
            }

            // 添加生成的 6 個數字和特別號到結果字串
            str += myNum[0] + " " + myNum[1] + " " + myNum[2] + " " + myNum[3] + " " + myNum[4] + " " + myNum[5] + " "
                    + "\t\t 特別號：" + myNum[6] + "\r\n";
        }

        try {
            // 指定要寫入的檔案路徑
            String fpath = "C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\lottly.txt";
            // 創建 BufferedWriter 來寫入檔案
            BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
            fout.write(str); // 將結果字串寫入檔案
            fout.close(); // 關閉檔案
            System.out.print(str); // 將結果顯示在控制台
        } catch (IOException e) {
            System.out.println("輸入檔案路徑有誤！！"); // 處理可能的 IO 錯誤
        }
    }
}

