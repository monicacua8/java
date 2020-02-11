import java.util.Scanner;

public class oddeven
{
	public static void main(String[] args) 
	{
Scanner input=new Scanner(System.in);

	int num1, num2;

	System.out.println("Enter a number");
	num1=input.nextInt();

	if (num1%2 == 0)
		System.out.println("Your number is even");

	else 
		System.out.println("Your number is odd");

}
}