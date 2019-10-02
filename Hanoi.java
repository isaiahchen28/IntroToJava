
public class Hanoi{

	public static void hanoi(int n, char from, char to, char aux) {
		if (n == 1) {
			System.out.println(n + " " + from + " " + to);
		}
		else {
			hanoi(n - 1, from, aux, to);
			System.out.println(n + " " + from + " " + to);
			hanoi(n - 1, aux, to, from);
		}
	}
}