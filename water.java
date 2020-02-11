import java.util.Scanner;

public class water
{
	public static void main(String[] args) 
	{
Scanner input=new Scanner(System.in);

float temperature;

System.out.println("Enter temperature in Fahrenheit:");
temperature=input.nextFloat();

if (temperature <= 32)
{
	System.out.println("Water at that temperature is a solid!");
	System.out.println("Celsius:" + (((temperature-32)*5)/9));
}

else if (temperature >= 212)
{
	System.out.println("Water at that temperature is a gas!");
	System.out.println("Celsius:" + (((temperature-32)*5)/9));
}

else 
{
	System.out.println("Water at that temperature is a liquid!");
	System.out.println("Celsius:" + (((temperature-32)*5)/9));
}
}
}