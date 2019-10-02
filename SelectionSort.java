public class SelectionSort{
	
	public static int[] selectionSort(int[] arr, int n) { //n2 n2 n2
       for (int i = 0; i < n; i++) {

           for (int c = 0; c < n; c++) {
               System.out.print(arr[c] + " ");
           }
           System.out.println();
           System.out.println(i);

           int minInd = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[minInd]) {
                   minInd = j;
               }
           }
           int tmp = arr[minInd];
           arr[minInd] = arr[i];
           arr[i] = tmp;
       }
       return arr;
   }
}