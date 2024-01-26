package package_num_one;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//System.out.println("Hello, World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int var1 = sc.nextInt();		
		System.out.println("Enter second number: ");
		int var2 = sc.nextInt();
		
		System.out.println(var1 + " + " + var2 + " = " + (var1+var2));

        sc.close();
	}

}