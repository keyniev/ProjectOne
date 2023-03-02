import java.util.*;

	public class DoorGame 
	{

		/** Similar to the "birthday" program. I'm included everything I could start.
		 * */ 
		
	    public void Userinput()
	    	{
	    
	    	Random ran = new Random();
	        Scanner scan = new Scanner(System.in);
	        	System.out.println("Change the door number when given the option? (Please answer 'y' for YES and 'n' for NO.)");
	        	String answer = scan.nextLine();
	        
	        System.out.println("How many times would you like play?");
	        	double runs = Double.parseDouble(scan.nextLine());

	    	}
	}