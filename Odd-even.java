package 70-days_of_Java;

public class Odd-even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello, World!");
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