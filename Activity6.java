import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		double answer, num1, n, r, a;
		// String

		System.out.println("How much would you like to have after ten years?:");
		num1=Input.nextDouble();


		System.out.println("How many years will you let the money sit?:");
		n=Input.nextDouble();

		r = 2.99;

		// answer=num1/(1+r)^2;
		a=Math.pow((1+r),n);
		answer=num1/a;

		System.out.println("Answer:" + answer);


	}
}