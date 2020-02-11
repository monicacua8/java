import java.util.Scanner; 

public class Activity1
{
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		float num1;
		float num2;
		System.out.println("Enter first number:");
		num1=Input.nextFloat();
		System.out.println("Enter second number:");
		num2=Input.nextFloat();
		float sum=num1+num2;
		float difference=num1-num2;
		float remainder=num1%(int)num2;
		float product=num1*num2;
		float quotient=num1/num2;
		
		System.out.println("Sum=" + sum);
		System.out.println("Difference=" + difference);
		System.out.println("Remainder=" + remainder);
		System.out.println("Product=" + product);
		System.out.println("Quotient=" + quotient);
	}
}