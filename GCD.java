// Task 2
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] test = new int[2];
		
		int x = 0;
		while (x < 3) {
			System.out.printf("Enter the number of digits: ");
			int size = 0;
			size = scanner.nextInt();

			test = input(size);
			System.out.println("The first random number: " + test[0]);
			System.out.println("The second random number: " + test[1]);
			
			long start = System.nanoTime();
			int gcd = gcd(test[0], test[1]);
			long end = System.nanoTime();
			long total = end - start;

			System.out.println("The gcd is: " + gcd);
			System.out.printf("Total amount of time for function gcd (%d, %d) in nanoseconds: %d", test[0], test[1], total);
			
			System.out.println();
			System.out.println();
			x ++;
		}
		scanner.close();
	}
	
	// calculate gcd of two numbers
	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	// generate random numbers
	public static int[] input(int size) {
		int[] nums = new int[2];

		if (size == 2) {
			nums[0] = 10 + (int)(Math.random() * ((99 - 10) + 1));
			nums[1] = 10 + (int)(Math.random() * ((99 - 10) + 1));
		} else if (size == 4) {
			nums[0] = 1000 + (int)(Math.random() * ((9999 - 1000) + 1));
			nums[1] = 1000 + (int)(Math.random() * ((9999 - 1000) + 1));
		} else if (size == 7) {
			nums[0] = 1000000 + (int)(Math.random() * ((9999999 - 1000000) + 1));
			nums[1] = 1000000 + (int)(Math.random() * ((9999999 - 1000000) + 1));
		}
		
		return nums;
	}
}
