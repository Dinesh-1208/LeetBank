import java.util.Scanner;

public class Main {
        @SuppressWarnings("ConvertToTryWithResources")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextLong();
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			if (a + b + 2 <= n || (a == b && a == n)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		scanner.close();
	}
}
