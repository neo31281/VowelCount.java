import java.util.Scanner;
	
public class VowelCount
{
	public static void main(String[] args)
	{
    	Scanner scan = new Scanner(System.in);

    	String userInput;
	
    	int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0; 
		System.out.println("\nWelcome to VowelCount.java");
		System.out.println("programmed by: \nRene Jerez \n");
    	System.out.println("\nEnter sentence");
    	userInput = scan.nextLine();
    	userInput = userInput.toLowerCase();

    	for(int x = 0; x <= userInput.length() - 1; x++)
		{
        	if(userInput.charAt(x) == 97)
            	vowelA++;
        	else if(userInput.charAt(x) == 101)
            	vowelE++;
        	else if(userInput.charAt(x) == 105)
            	vowelI++;
        	else if(userInput.charAt(x) == 111)
            	vowelO++;
        	else if(userInput.charAt(x) == 117)
            	vowelU++;   
    	} 

    	System.out.println("\nThere are " + vowelA + " A's in your sentence.");
    	System.out.println("\nThere are " + vowelE + " E's in your sentence.");
    	System.out.println("\nThere are " + vowelI + " I's in your sentence.");
    	System.out.println("\nThere are " + vowelO + " O's in your sentence.");
    	System.out.println("\nThere are " + vowelU + " U's in your sentence.\n");
	}
}
