import java.util.Scanner; 

public class Activity3 {
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		float num1;
		float num2;
		System.out.println("Enter first number:");
		num1=Input.nextFloat();
		System.out.println("Enter second number:");
		num2=Input.nextFloat();

System.out.println("Original first number:" + num1);
System.out.println("Original second number:" + num2);
System.out.println("Modified first number:" + num2);
System.out.println("Modified second number:" + num1);
	}
}