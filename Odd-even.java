package package_num_one;

public class Odd-even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int var1 = sc.nextInt();
		if (var1 % 2 != 0) {
			System.out.println(var1 + " is an odd number.");
		}
		else {
			System.out.println(var1 + " is an even number.");
		}

	}
}