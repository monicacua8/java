import java.util.Scanner; 

public class Activity2
{
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		float rad;
		System.out.println("Enter radius:");
		rad=Input.nextFloat();
		double area=3.14*rad*rad;
		double circumference=2*3.14*rad;

		System.out.println("Area=" + area);
		System.out.println("Circumference" + circumference);

	}
}