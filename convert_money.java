import java.util.Scanner;

public class convert_money
{
	public static void main(String[] args) 
	{
Scanner input=new Scanner(System.in);

	int amount;
	String type;



	System.out.println("Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin:");
	type=input.next();

	System.out.println("Amount of currency to convert:");
	amount=input.nextInt();

	if (type.equals("e"))
	{
		System.out.println("In U.S. dollars, that is $"+ amount*1.16);
	}

	else if (type.equals("c"))
	{
		System.out.println("In U.S. dollars, that is $"+ amount*.15);
	}

	else if (type.equals("r"))
	{
		System.out.println("In U.S. dollars, that is $"+ amount*.0015);
	}

	else if (type.equals("b"))
	{
		System.out.println("In U.S. dollars, that is $"+ amount*6923.8);
	}

	else 
	{
		System.out.println("Invalid input");
	}

}
}
