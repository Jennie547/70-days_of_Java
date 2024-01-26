package package_num_one;
import java.util.Scanner;

class MinMax {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		int num_3 = sc.nextInt();
		
		if (num_1 > num_2 && num_1 > num_3) {
			System.out.println(num_1 + " is the largest number");
		}
		else if (num_2 > num_1 && num_2 > num_3) {
			System.out.println(num_2 + " is the largest number");
		}
		else if (num_3 > num_1 && num_3 > num_2) {
			System.out.println(num_3 + " is the largest number");
		}
		else {
			System.out.println("Two or more are equal");
		}
	}
}