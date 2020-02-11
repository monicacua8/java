import java.util.Scanner;
import java.util.Formatter;

public class Assignment1 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	int amount1, amount2, amount3;
	String item1, item2, item3;
	double price1, price2, price3, total1, total2, total3, subtotal, tax, total;


	System.out.println("Input name of item 1:");
	item1=input.nextLine();
	System.out.println("Input quantity of item 1:");
	amount1=input.nextInt();
	System.out.println("Input price of item 1");
	price1=input.nextDouble();

	System.out.println("Input name of item 2:");
	input.nextLine();
	item2=input.nextLine();
	System.out.println("Input quantity of item 2:");
	amount2=input.nextInt();
	System.out.println("Input price of item 2");
	price2=input.nextDouble();

	System.out.println("Input name of item 3:");	
	input.nextLine();
	item3=input.nextLine();
	System.out.println("Input quantity of item 3:");
	amount3=input.nextInt();
	System.out.println("Input price of item 3");
	price3=input.nextDouble();

	total1=(amount1*price1);
	total2=(amount2*price2);
	total3=(amount3*price3);
	subtotal=(total1+total2+total3);
	tax=(subtotal*.0625);
	total=(subtotal+tax);

	System.out.println("Your bill:");
	System.out.printf("%-30s %-10s %-10s %-10s %n", "Item", "Quantity", "Price", "Total");
	System.out.printf("%-30s %-10s %-10.2f %10.2f %n", item1, amount1, price1, total1);
	System.out.printf("%-30s %-10s %-10.2f %10.2f %n", item2, amount2, price2, total2);
	System.out.printf("%-30s %-10s %-10.2f %10.2f %n", item3, amount3, price3, total3);
	System.out.printf("Subtotal%53.2f %n", subtotal);
	System.out.printf("Sales tax%60.2f %n", tax);
	System.out.printf("Total%60.2f %n", total);


	// System.out.printf("Total");
	// System.out.println("6.25% sales tax");


}
	
}