
public class InsertionSort{
	
	public static int[] insertionSort(int[] arr, int n) {
       
		for (int i = 0; i < n - 1; i++) {
           for (int j = i; j >= 0; j--) {
               if (arr[j + 1] < arr[j]) {
                   int tmp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = tmp;
               } else {
                   break;
               }
           }
       }
       return arr;
   }
}