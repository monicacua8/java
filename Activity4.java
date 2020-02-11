import java.util.Scanner;
public class Activity4 {
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		float celsius, farenheit;
		System.out.println("Enter temperature in celsius:");
		celsius=Input.nextFloat();
		farenheit=celsius*9/5+32;

		System.out.println("Temperature in farenheit:" + farenheit);




	}
}