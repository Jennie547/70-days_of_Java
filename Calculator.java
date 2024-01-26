package package_num_one;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two doubles: ");
		double first_num = sc.nextDouble();
		double second_num = sc. nextDouble();
		System.out.println("Enter any character ");
		char operator = sc.next().charAt(0);
		
		if (operator == '+') {
			System.out.println(first_num + second_num);
		}
		else if (operator == '-') {
			System.out.println(first_num - second_num);
		}
		else if (operator == '*') {
			System.out.println(first_num * second_num);
		}
		else if (operator == '/') {
			System.out.println(first_num / second_num);
		}
		else {
			System.out.println("Wrong operator! Start again!");
		}
	}
}