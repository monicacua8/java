import java.util.Scanner;
import java.util.Formatter;

public class bill {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	int amount1, amount2, amount3;
	String item1, item2, item3;
	double price1, price2, price3, total1, total2, total3, subtotal, tax, total;
	/*declaring integer for amounts, string for names, and double for prices, total, and tax to account for decimals*/


	System.out.println("Input name of item 1:");
	item1=input.nextLine();
	System.out.println("Input quantity of item 1:");
	amount1=input.nextInt();
	System.out.println("Input price of item 1");
	price1=input.nextDouble();
	//inputs for first item//

	System.out.println("Input name of item 2:");
	input.nextLine();
	item2=input.nextLine();
	System.out.println("Input quantity of item 2:");
	amount2=input.nextInt();
	System.out.println("Input price of item 2");
	price2=input.nextDouble();
	//inputs for second item. for some reason, user input for item2 kept skipping so i put in an extra input.nextLine

	System.out.println("Input name of item 3:");	
	input.nextLine();
	item3=input.nextLine();
	System.out.println("Input quantity of item 3:");
	amount3=input.nextInt();
	System.out.println("Input price of item 3");
	price3=input.nextDouble();
	//inputs for third item

	total1=(amount1*price1); //math for total for item1
	total2=(amount2*price2); //math for total for item1
	total3=(amount3*price3); //math for total for item1
	subtotal=(total1+total2+total3); //math for total of all three items
	tax=(subtotal*.0625); //math for tax
	total=(subtotal+tax); //math for tax and subtotal

	System.out.println("Your bill:"); //first line, requires no columns
	System.out.printf("%-30s %-10s %-10s %-10s %n", "Item", "Quantity", "Price", "Total");
	//second line, created columns; 30s for item, 10s for quantities, 10s for prices, and 10s for total
	System.out.printf("%-30s %-10s %-10.2f %10.2f %n", item1, amount1, price1, total1);
	//mimiced column spacing up above for each following line
	System.out.printf("%-30s %-10s %-10.2f %10.2f %n", item2, amount2, price2, total2);
	System.out.printf("%-30s %-10s %-10.2f %10.2f %n", item3, amount3, price3, total3);
	System.out.printf("%-10s %52.2f %n", "Subtotal", subtotal);
	//put in 53 subtotal is 8 characters, 53 allows it all to line up
	System.out.printf("%-10s %47.2f %n", "6.25% sales tax", tax);
	System.out.printf("%-10s %52.2f %n", "Total", total);



}
	
}