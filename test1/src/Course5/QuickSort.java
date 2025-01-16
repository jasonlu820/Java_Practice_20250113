package Course5;  // 這是包（package）聲明，指定了程式所屬的包名稱

public class QuickSort {  // 定義名稱為 QuickSort 的類別
    public static void main(String[] args) {  // 主函式的進入點
        int[] arr = new int[] {31, 72, 32, 66, 15, 1, 61, 24, 59, 38, 71, 35, 10, 96, 84, 78, 65, 60, 11, 47};  // 建立一個整數陣列並初始化
        System.out.print("未排序陣列 -> ");  // 輸出未排序陣列的提示訊息
        printArray(arr);  // 呼叫 printArray 函式來輸出陣列的內容
        qSort(arr, 0, arr.length - 1);  // 呼叫 qSort 函式進行快速排序
        System.out.print("\n排序後陣列 -> ");  // 輸出排序後陣列的提示訊息
        printArray(arr);  // 再次呼叫 printArray 函式來輸出排序後陣列的內容
    }
    
    static void printArray(int[] a) {  // 定義一個名稱為 printArray 的靜態方法，用於輸出整數陣列的內容
        for (int i = 0; i < a.length; i++) {  // 使用迴圈遍歷陣列中的元素
            System.out.print(a[i] + " ");  // 輸出陣列元素及空格
        }
    }
    
    static void qSort(int[] a, int m, int n) {  // 定義一個名稱為 qSort 的靜態方法，用於實現快速排序
        if (m >= n)  // 如果子陣列只有一個元素或空，則無需排序，直接返回
            return;
        int i = m, j = n, pivot = a[(m + n) / 2];  // 初始化左右指針和選擇的主元素（pivot）
        while (i <= j) {  // 進入迴圈，直到左右指針相遇
            while (a[i] < pivot) {  // 找到左邊比主元素大的元素
                i++;
            }
            while (a[j] > pivot) {  // 找到右邊比主元素小的元素
                j--;
            }
            if (i < j) {  // 如果左指針小於右指針，交換它們指向的元素
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            } else if (i == j) {  // 如果左指針等於右指針，左指針右移一位
                i++;
            }
        }
        qSort(a, m, j);  // 遞歸處理左子陣列
        qSort(a, i, n);  // 遞歸處理右子陣列
    }
}
