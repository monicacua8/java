import java.util.Scanner;

public class ages
{
	public static void main(String[] args) 
	{
Scanner input=new Scanner(System.in);
	int firstage, secondage;

	System.out.println("Enter your age:");
	firstage=input.nextInt();
	System.out.println("Enter a friend's age:");
	secondage=input.nextInt();

	if (firstage < secondage)
	{
		System.out.println("Your friend is older than you!");
	}

	else 
	{
		System.out.println("You are older than your friend!");
	}

}
}	



