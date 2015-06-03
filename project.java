import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of tests: ");
		int T = input.nextInt();
		while (T < 0 || T > 100) {
			System.out.println("This is incorrect. Please enter new number: ");
			T = input.nextInt();
		}
		System.out.println("Enter the days you have to work: ");
		int N = input.nextInt();
		while (N < 0 || N > 500000) {
			System.out.println("This is incorrect. Please enter new number: ");
			N = input.nextInt();
		}
		System.out.println("Enter the number of questions you want to ask:");
		int M = input.nextInt();
		while (M < 0 || M > 1000) {
			System.out.println("This is incorrect. Please enter new number: ");
			M = input.nextInt();
		}
		int B[] = new int[N];
		int I = 0, J = 0, sum = 0;
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("Enter the tasks you have completed in day "
						+ (j + 1) + ":");
				B[j] = input.nextInt();
				while (B[j] < 0 || B[j] > 10000) {
					System.out
							.println("This is incorrect. Please enter new number: ");
					B[j] = input.nextInt();
				}
			}
			for (int k = 0; k < M; k++) {
				System.out.print("You want the tasks from day No:");
				I = input.nextInt();
				while (I < 0 || I > N) {
					System.out
							.println("This is incorrect. Please enter new number: ");
					I = input.nextInt();
				}
				System.out.print("to day No:");
				J = input.nextInt();
				while (J < I || J > N) {
					System.out
							.println("This is incorrect. Please enter new number: ");
					J = input.nextInt();
				}
				sum = 0;
				for (int l = I - 1; l < J; l++) {
					sum = sum + B[l];
				}
				System.out
						.println("The number of tasks you have completed is: "
								+ sum);
			}
		}

	}

}
