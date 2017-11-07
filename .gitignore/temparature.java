import java.util.Scanner;

public class temparature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = 5 * (fahrenheit - 32) / 9;
		System.out.println(fahrenheit + " F is equivalent to " + celsius + " celsius");
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius1 = input1.nextDouble();
		double fahrenheit1 = 9 * celsius1 / 5 + 32;
		System.out.println(celsius1 + " C is equivalent to " + fahrenheit1 + " fahrenheit");
}
	}