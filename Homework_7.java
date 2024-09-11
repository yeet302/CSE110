import java.util.Scanner;
public class Homework_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		String blop = in.nextLine();
		for(int i=0;i<=blop.length()-1;i++) {
			char ch = blop.charAt(i);
			System.out.print(i+" ");
		*/
		
		/*
		  int value;
		 
		do {
			System.out.println("Please enter a positive number");
			value = in.nextInt();
		}
		while(!(value>0));
		System.out.println("End Process");
		*/
		String str = "Hello";
		for(int i=0;i<=str.length()-1;i++) {
			char t = str.charAt(i);
			System.out.print(t+" ");
		}
		System.out.println();
		int j=0;
		while(j<str.length()) {
			char t = str.charAt(j);
			System.out.print(t+" ");
			j++;
		}
		
	}

}
