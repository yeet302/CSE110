import java.util.Scanner;
public class CountOccurancesInWord
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);         
      System.out.println("Enter a word: ");	
      String word = in.nextLine();      		
      System.out.println("Enter a char: ");      
      char chr = in.next().charAt(0);
      if(chr>96) 
    	  System.out.println("The letter '"+chr+"' or '"+(char)(chr-32)+"' in the word \""+word+"\" is counted");
      else
    	  System.out.println("The letter '"+chr+"' or '"+(char)(chr+32)+"' in the word \""+word+"\" is counted");

      System.out.println(countOccurrances(word,chr)+" times");  	
 
	  //Call the method countOccurrances
	  //print out the letter, the word, and #occurance times
   }    
   /**
   computes occurances of letter within a word
   */   
   public static int countOccurrances(String w,char ch)  
   {
	   int upperCaseCount =0;
	   int lowerCaseCount =0;
	   int count;
	   for(int i=0; i<w.length();i++) {
		   if(ch>96) {
			   if(w.charAt(i)==ch)
				   lowerCaseCount++;
			   else if(w.charAt(i)==ch-32)
				   upperCaseCount++;
		   }
		   else {
			   if(w.charAt(i)==ch+32)
				   lowerCaseCount++;
			   else if(w.charAt(i)==ch)
				   upperCaseCount++;
		   }		   
	   }
	   //System.out.println("uppercase:"+upperCaseCount+" "+"lowercase "+lowerCaseCount);
	   count = upperCaseCount+lowerCaseCount;
	   System.out.print("Total Count: ");
	   return count;
	//implement this method	
   }
}
      
