import java.util.Scanner;

public class sort_names
{
	public static void main(String[] args) 
	{
Scanner input=new Scanner(System.in);
	
	String firstname;
	String secondname;
	System.out.println("Enter the first name:");
	firstname=input.next();
	System.out.println("Enter the second name:");
	secondname=input.next();

	if (firstname.compareTo(secondname) < 0)
	{
		System.out.printf("Order: %s, %s", firstname, secondname);
	}

	else 
	{
		System.out.printf("Order: %s, %s", secondname, firstname);
	}

}
}	



