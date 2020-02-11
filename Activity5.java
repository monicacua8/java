import java.util.Scanner;

public class Activity5
{
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		float sec, hours, minutes, seconds;

		System.out.println("Enter seconds:");
		sec=Input.nextFloat();

		hours=(int)sec/3600;
		minutes=(int)(sec-(hours*3600))/60;
		seconds=sec-(hours*3600)-(minutes*60);


		System.out.println("Hours:" + hours);
		System.out.println("Minutes:"+ minutes);
		System.out.println("Seconds:" + seconds);

	}
}