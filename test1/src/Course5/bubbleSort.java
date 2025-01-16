package Course5;

public class bubbleSort {
	public static void main(String[] args) {
		int i;
		int[] myArray = new int[] {56, 58, 33, 86, 38, 27};
		System.out.print("排序前：");
		for (i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
		System.out.println();
		
		bSort(myArray);
		
		System.out.print("排序後：");
		for (i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
	}
	
	static void bSort(int[] vArray) {
		int tmp, i, j;
		for (i = vArray.length - 2; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				if (vArray[j] > vArray[j + 1]) {
					tmp = vArray[j];
					vArray[j] = vArray[j + 1];
					vArray[j + 1] = tmp;
				}
			}
		}
	}
}

