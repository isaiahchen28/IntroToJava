import java.util.Scanner;

public class CommonValueFinder {

    // This program sorts the data into three arrays and then prints all the common elements among the three 

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        int[] array1 = new int[n]; //defining the arrays
        int[] array2 = new int[n]; //defining the arrays
        int[] array3 = new int[n]; //defining the arrays

        //getting the input from the user
        for (int i = 0; i < n; i++) {
            array1[i] = myScanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array2[i] = myScanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array3[i] = myScanner.nextInt();
        }

        //sorting the three arrays
        int[] sorted1 = bubbleSort(array1, n);
        int[] sorted2 = bubbleSort(array2, n);
        int[] sorted3 = bubbleSort(array3, n);

        //printing the sorted result
        for (int i = 0; i < n; i++) {
            System.out.print(sorted1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(sorted2[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(sorted3[i] + " ");
        }
        System.out.println("");

        //printing the common elements
        commonValue(sorted1, sorted2, sorted3, n);

    }

    public static int[] bubbleSort(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void commonValue(int[] array1, int[] array2, int[] array3, int n) {

        int i = 0, j = 0, k = 0;
        while (i < n && j < n && k < n) {
            if (array1[i] == array2[j] && array1[i] == array3[k]) {// common element found
                System.out.println(array1[i]);
                i++;
                j++;
                k++;
            } else { //finding the counter associated with the least calue and incrementing that by one
                if (array1[i] <= array2[j] && array1[i] <= array3[k]) {
                    i++;
                } else if (array2[j] <= array1[i] && array2[j] <= array3[k]) {
                    j++;
                } else {
                    k++;
                }
            }
        }
    }
}