import java.util.Scanner;

public class Decimal2Binary {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int decimal = myScanner.nextInt();
        System.out.println(decimal2Binary(decimal));
    }

    public static String decimal2Binary(int decimal) {
        String binary = "";
        while (decimal != 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }
}