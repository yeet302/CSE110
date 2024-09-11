import java.util.Scanner;
public class Homework_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int shippingCost;
		System.out.println("Which country to ship to? ");
		String country = in.nextLine();
		if(country == "USA") {
			shippingCost = 20; 
		}
		else
		{     
		    System.out.println("Which state to ship to? ");
		    String state = in.nextLine();
		    if(state == "HI" || state == "AK")
		    	shippingCost = 10;
		    else
		    	shippingCost = 5;         
		}
		System.out.println("Your Shipping cost will be: "+shippingCost+" $");
		System.out.println("Jong Youn Woo");
	}
}
