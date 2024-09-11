import java.util.Scanner;
public class shippingCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int shippingCost;
		System.out.println("Which country to ship to?");
		String country = in.nextLine();
		String state;
		if(country.equals("USA")) {
			System.out.println("Which state to ship to?");
			state = in.nextLine();
			if(state.equals("HI")|| state.equals("AK"))
				shippingCost = 10;
			else
				shippingCost = 5;
			
		}	
		else 
			shippingCost = 20;		
		
		System.out.println("Your shipping cost will be "+shippingCost+"$");		
		System.out.println("Jongyoun Woo");
	}

}
