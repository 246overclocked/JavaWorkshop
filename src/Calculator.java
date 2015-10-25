import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator2 {

	public static void main(String[] args) {
		int c = 0; //previous answer
		int a = 0; //first term
		int b = 0; //second term
		boolean repeat = false; //checking whether this is the first run through
		
		System.out.println("Integer calculator. Valid commands are addition, subtraction, multiplication, division, square root, power, and quit.\n");
		
		while(true) //main program
		{
			//Get valid command from user
			System.out.println("Command:");
			String calc = getStringFromUser();
			while(!(calc.equals("addition") || calc.equals("subtraction") || calc.equals("multiplication") || calc.equals("division") 
					|| calc.equals("square root") || calc.equals("power") || calc.equals("quit")))
			{
				System.out.println("That's not a valid operation.\nCommand:");
				calc = getStringFromUser();
			}
			
			//Quit command
			if(calc.equals("quit"))
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
			if(!repeat) //only ask for first operand if this is the first run through
			{
				System.out.println("First operand?");
				a = getIntFromUser();	
			}
			else
			{
				a = c;
			}
			
			
			if((calc.equals("square root"))) //Square root only takes one operand, so check for that and run it before asking for a second.
			{
				while(a < 0) //prevent square root of negative number
				{
					System.out.println("You can't take the square root of a negative number! Please enter a different operand.");
					a = getIntFromUser();
				}
				c = (int)Math.sqrt(a);
				System.out.println(c);
			}
			
			else
			{
				System.out.println("Second operand?");


				b = getIntFromUser();
				
				
				//do the command, unless square root or quit
				if(calc.equals("addition"))
				{
					c = a + b;
				}
				else if(calc.equals("subtraction"))
				{
					c = a - b;
				}
				else if(calc.equals("multiplication"))
				{
					c = a * b;
				}
				else if(calc.equals("division"))
				{
					while(b == 0) //prevent division by 0
					{
						System.out.println("You can't divide by 0! Please enter a different operand.");
						b = getIntFromUser();
					}
					c = a / b;
				}
				else if(calc.equals("power"))
				{
					c = (int)Math.pow(a, b);
				}
				System.out.println(c); // print the answer
			}

			repeat = true; //only ask for one operand next time
		}
		

}
	//I did not write these methods. They get user input.
	public static String getStringFromUser()
	
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    try {
	
	       	return br.readLine();
	
	    } catch (Exception e) {
	
	        e.printStackTrace();
	
	    }
	
	    return "";
	
	}
	
	public static int getIntFromUser() { //This function is different from what Paul gave us. It can handle bad inputs.
		while (true) {
			  try {
				  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				  return Integer.parseInt(br.readLine());
			  } catch (Exception e) {
				  System.out.println("That's not an integer! Please try again.");
			  }
	    }
	}
}
