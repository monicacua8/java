/*Example2_1.java
  Author- Anita Rathi
  This program demonstrates  :
  - printf()

 */

import java.util.Scanner;

public class Example2_1
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); //Input is an object of Scanner class
		String name;
		float score1, score2,score3,score4,avg;
		System.out.print("Enter your name:");
		name=input.nextLine();//Reading complete line
		System.out.print("Enter score in 4 classes:");
		score1=input.nextFloat();
		score2=input.nextFloat();
		score3=input.nextFloat();
		score4=input.nextFloat();
		avg=(score1+score2+score3+score4)/4;
		System.out.printf("%30s\n\n\n","Score Report");
		System.out.printf("%-20s%20s\n","Class Name","Score");
		//- for left indentation of string
		System.out.printf("%-20s%20.2f\n","Class 1",score1);
		System.out.printf("%-20s%20.2f\n","Class 2",score2);
		System.out.printf("%-20s%20.2f\n","Class 3",score3);
		System.out.printf("%-20s%20.2f\n\n","Class 4",score4);
		System.out.printf("%30s%20.2f\n","Average Score",avg);


	}

}