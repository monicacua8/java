import java.util.Scanner;

public class Activity3_1
{
	public static void main(String[] args) 
	{
	
	Scanner input=new Scanner(System.in);
	int score;
	System.out.print("Enter your score:");

	score=input.nextInt();
	if (score>60) //boolean expression
		{
		System.out.println("Pass");
		System.out.println("yay!!!!!!!!");
	}

	else
	{
		System.out.println("FAIL");
	}


	}
}