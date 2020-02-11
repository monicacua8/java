import java.util.Scanner;

public class preference
{
	public static void main(String[] args) 
	{
	Scanner input=new Scanner(System.in);

		int pizza, tacos;
			
		System.out.println("How much do you like pizza on a scale of 1 (hate) to ten (love)?");
		pizza=input.nextInt();

		System.out.println("How much do you like tacos on a scale of 1 (hate) to ten (love)?");
		tacos=input.nextInt();

		if (pizza > tacos) 
		{
			System.out.println("You like pizza more!");
		}

		else 
		{
			System.out.println("You like tacos more!");
		}





	}
}