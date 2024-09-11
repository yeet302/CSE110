import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Homework10 {

	
//	public static void showStars(int number)
//	{
//
//	for (int k = 1; k <= number; k++)
//	{
//
//	System.out.print("*");
//
//	}
//
//	}
//	public static double compute(int value1, int value2)
//	{
//
//	double result = value1 * value2;
//	result = result / 2;
//	return result;
//
//	}
	private String description;
	private int itemNumber;
	private static int itemTotal = 0;

	public Item(int num)
	{

	itemNumber = num;
	itemTotal++;

	}

	public void printNumber()
	{

	System.out.print(itemNumber + "" + itemTotal + "");

	}
	public static void main(String[] args) {
//		final int LENGTH = 10;
//		double[] values = new double[LENGTH];
//		Scanner k = new Scanner(System.in);
//		for( int i=0; i<values.length;i++) {
//			values[i] = k.nextDouble();
//		}
//		double total = 0;
//		for(double element : values) {
//			total+=element;
//		}
//		System.out.println();
//		double[] values = {39,74,69,128,540,32,46,19,28,749};
//		System.out.println(Arrays.toString(values));
//		double[] prices = Arrays.copyOf(values, values.length);
//		System.out.println(Arrays.toString(values));
//		Scanner t = new Scanner(System.in);
//		double[] kilo = new double[10];
//		for(int i=0; i<kilo.length;i++) {
//			kilo[i]=t.nextDouble();
//			
//		}
//		for(int k=0;k<kilo.length;k++) {
//			System.out.println(kilo[k]);
//		}
//		for(double element : kilo) {
//			element = 0;
//			System.out.println(element);
//		}
//		for(int j=0;j<kilo.length;j++) {
//			System.out.println(kilo[j]);
//		}
		

		
//		int[] array = new int[10];
//		int[] array = new array[10];
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("x");
//		ArrayList<String> b = a;
//		b.add("y");
//		a.add("z");
//		System.out.println(a + " " + b);
		
//		int[] values = { 1, 3, 5, 3, 7 };
//		int count = 0;
//		for (int number : values)
//		{
//
//		if (number > 2)
//		{
//
//		count++;
//
//		}
//
//		}
//		System.out.print(count);
//		showStars(5);
//		
		
//		int x = 5;
//		int y = 3;
//		System.out.println(compute(x, y));
		Item item1 = new Item(1);
		Item item2 = new Item(3);
		item1.printNumber();
		item2.printNumber();
	}
//	private int dayOfMonth;
//	private int month;
//	private int year;
//
//	/**
//	Changes the year of this day.
//	@param newYear the new value for year
//	*/
//	public void setYear(int newYear)
//	{
//		year = newYear;
//	int year = newYear;
//
//	}
}
