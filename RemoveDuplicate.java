import java.util.Scanner;

public class RemoveDuplicate {  // check for  duplicate elements in an array and remove all of the instances except the first one.
    //(Keep the order of the rest of the elements: 1 2 3 3 5 4 2 6 -> 1 2 3 5 4 6)

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = myScanner.nextInt();
        }

        int[] myUpdatedArray = removeDuplicates(myArray, n);
        for (int i = 0; i < n; i++) {
            if (myUpdatedArray[i] != -1) {
                System.out.print(myUpdatedArray[i] + " ");
            }
        }

    }

    public static int[] removeDuplicates(int[] array, int n) {
        for (int j = 0; j < n; j++) {// this loop checks for each of the elements
            int element = array[j]; // element we are considering right now
            for (int i = j + 1; i < n; i++) {
                if (array[i] == element) {
                    for (int k = i; k < n - 1; k++) {// this loop shifts all of the elements left
                        array[k] = array[k + 1];
                    }
                    array[n - 1] = -1;
                    n--;
                    i--;
                }
            }
        }
        return array;
    }
}
