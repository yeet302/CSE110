import java.util.Scanner;
public class Mid_Term {

	public static void main(String[] args) {
		/*
		int exemption = 0;
		int numberOfDependents=5;
		switch (numberOfDependents)
		{
		   case 0:  exemption = 1250; break;
		   case 1:  exemption = 2200; break;
		   case 2:  exemption = 3150; break;
		   default: exemption = 4100; break;
		}
		System.out.println(exemption);
		

		String phoneNumber = "1234567890";
		//String newNumber = "(" + phoneNumber.substring(1, 3) + ")" + phoneNumber.substring(3, 7);
		//String newNumber = "(" + ")" + phoneNumber;
		String newNumber = "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 10);
		//String newNumber = "(" + phoneNumber.substring(3, 0) + ")";
		System.out.println(newNumber);
		
		System.out.print("Enter a number: ");
		String str = in.next();
		str += 456;
		System.out.println(str);
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int m = input;
		while (in.hasNextInt())
		{

		input = in.nextInt();
			if(input>m){
				m = input;
				System.out.println(m);
			}

		}
		
		String str = "1234567890";
		for (int i = str.length() - 1; i>=0; i--)
		{

		System.out.print(str.charAt(i));
		}
		
		int j = 1;
		do
		{

		int value = j * 2;
		j++;
		System.out.print(value + ", ");

		}
		while (j <= 5);
		
		int count = (int) (2.5 *3 - 2) + 1;
		System.out.println(count);
		*/
		String s = "1234";
		for (int i = 0; i <= 5; i++)    // line 2
		{

		System.out.print(s.substring(i, i + 1));    // line 4

		}
	}

}
