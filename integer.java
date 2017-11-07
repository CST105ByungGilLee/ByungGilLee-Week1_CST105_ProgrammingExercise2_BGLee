import java.util.Scanner;

public class integer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);   // create new Scanner object
		
		System.out.print("Enter a number between 0 and 100000: ");
		int number = input.nextInt();
		int lessThan10 = number % 10;
		number /= 10;
		int tens = number % 10;
		number /= 10;
		int hundreds = number % 10;
		number /= 10;
		int thousands = number % 10;
		number /= 10;
		int tenthousands = number % 10;
		number /= 10;
		int sum = tenthousands + thousands + hundreds + tens + lessThan10;
		System.out.println("The sum of the digits is " + sum);
		
	}

}
