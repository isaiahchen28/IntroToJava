import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = myScanner.nextInt();
        }
        System.out.println(avergeArray(myArray, n));
    }

    public static double avergeArray(int[] array, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        return (sum / n);
    }
}
