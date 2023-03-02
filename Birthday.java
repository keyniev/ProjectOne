import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Birthday 
	{

	/** This program does not run. I was not able to figure out why in time before submitting Project I.
	 * * I did my best to include every logic step I could think of in hopes of receiving some sort of credit for it 
	 *  just in case I was somehow close and was just forgetting something silly.
	 * */
	 
	
	Scanner scan = new Scanner(System.in);
	System.out.println("How many people are your class? (Numerical Responses Only Please!(i.e.; 1-100)");
	int classSize = scan.nextInt();
			
	System.out.println("How many times will it run? (Numerical Responses Only Please!)(i.e.; 1-100)");
	int runCount = scan.nextInt();
	
   		

   private static void out(int students, double runs)
   		{
       		double 	match = 0;
       		
       			for(int i = 0; i < runs; i++)
       			{
       				match += birthdayCompare(students);
       			}

       
       double ratio = match / runs;
       System.out.println("Percentage where two people in the class had same birthday: " + ratio + "%");
   		}
   
   
   private static birthdayCompare(int students)
   		{

       		Random randomNum = new Random();
       		
       		ArrayList<Person> classA = new ArrayList<>();
       		
       			for(int i = 0; i < students; i++)
       			{
       				classA.add(new Person(randomNum.nextInt(365)+1));
       			}
       			
       		
       		ArrayList<Integer> birthdays = new ArrayList<>();
       		
       			for(Person student : classA)
       			{
       				birthdays.add(student.getBirthday());
       			}

       			
       			for(Person student : classA)
       			{
           		if(Collections.frequency(birthdays, student.getBirthday()) > 1)
           			{
           				return 1;
           			}
       			}

       return 0;	
   }

}


   
  