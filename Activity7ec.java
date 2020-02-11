import java.util.Scanner;

public class Activity7ec {

	public static void main(String[] args) {
		
		Scanner Input=new Scanner(System.in);
		int ten, five, one;
		double total, fifty, quarter, dime, penny;

		System.out.println("Enter total amount:");
		total=Input.nextFloat();

		ten=(int)total/10;
		five=(int)(total-(ten*10))/5;
		one=(int)(total-(ten*10)-(five*5));
		fifty=Math.round((total-(ten*10)-(five*5)-2)/.75);
		quarter=Math.round((total-(ten*10)-(five*5)-one-.50)/.25);
		dime=Math.round((total-(ten*10)-(five*5)-one-(.50)-(.25))/.10);
		penny=Math.round((total-(ten*10)-(five*5)-one-.50-.25-.10)/.01);

System.out.println("$10:" + ten);
System.out.println("$5:" + five);
System.out.println("$1:" + one);
System.out.println("50 cents:" +fifty);
System.out.println("Quarters:" + quarter);
System.out.println("Dimes:" + dime);
System.out.println("Pennies:" + penny);
	}
}
	
