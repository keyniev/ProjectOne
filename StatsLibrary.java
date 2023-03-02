import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class StatsLibrary 
{

	
	/**
	* Returns the number calculated through mathematical computation of a mean.
	* The numbers inputed, "inputNum" is a double to return double numeric value. 
	* 
	* <p>
	* @param  inputNum     A number inputed by the user in their tester class in ArrayList.
	* @return meanResult   The result of the mathematical computation after inputed numbers, finding the mean.
	*/
	
	public double findMean(ArrayList<Double> inputNum) 
		{
			double sum = 0;
		
			for(double element: inputNum)
					sum += element;		
			double meanResult = sum/inputNum.size();
		
			return meanResult;
		}
	
	/**
	* Returns the number calculated through mathematical computation of a median.
	* The numbers inputed, "inputNum" is a double to return double numeric value. 
	* 
	* @param  inputNum     A number inputed by the user in their tester class in ArrayList.
	* @return inputNum  The result of the mathematical computation after inputed numbers, finding the median.
	*/
	
	public double findMedian(ArrayList<Double> inputNum)
		{
		
			Collections.sort(inputNum);
			if (inputNum.size() % 2 == 1)
				{
            return inputNum.get((inputNum.size() + 1) / 2 - 1);
				}
		    else 
		    	{
			return (inputNum.get((inputNum.size() + 1) / 2 ) + inputNum.get((inputNum.size() - 1 ) / 2) )/ 2;
		    	}
		}
	
	/**
	* Returns the number calculated through mathematical computation of a mode.
	* The numbers inputed, "inputNum" is a double to return double numeric value. 
	* 
	* @param  inputNum     A number inputed by the user in their tester class in ArrayList.
	* @return trueMode     The result of the mathematical computation after inputed numbers, finding the mode.
	*/
		
		
	public double findMode(ArrayList<Double> inputNum) 
		{
			double trueMode = 0;
			double modeCount = 0;
		
			for(double element : inputNum) 
			{
				double tempMode = Collections.frequency(inputNum, element);
				
				if(tempMode > trueMode)
				{
					trueMode = element;
					element = modeCount;		
				} 
						
			}
			
			return trueMode;
	}
	
	/**
	* Returns the number calculated through mathematical computation of standard deviation.
	* The numbers inputed, "inputNum" is a double to return double numeric value. 
	* The mean method is utilized to calculate part of the standard deviation's mathematical formula.
	* 
	* @param  inputNum            A number inputed by the user in their tester class.
	* @return standardDeviation   The result of the mathematical computation after inputed numbers, finding the standard deviation.
	*/
	
	public double standardDeviation(ArrayList<Double> inputNum) 
		{
			double sdMean = findMean(inputNum);
			double standardDeviation = 0.0;
			
				for(double element : inputNum)
				{
					standardDeviation += Math.pow(element - sdMean, 2);
				}
				
				return Math.sqrt(standardDeviation/inputNum.size());
		}
	
	
	
   	 						// Factorial , Combinations, and permutations below using BigInteger.    //
	
	
	
	
	/**
	* Returns the number calculated through mathematical computation of factorial.
	* The numbers inputed, "nums" is an int, to return BigInteger numeric value, of the JAVA API. 
	* 
	* @param  int nums     A number inputed by the user in their tester class of BigInteger type.
	* @return factorial   The result of the mathematical computation after inputed numbers, finding the factorial.
	*/
	
     public BigInteger factorial(int nums) 
     	{ 
     
     BigInteger factorial = BigInteger.ONE;

     		for (int i = nums; i > 0; i--) 
     		{
     		factorial = factorial.multiply(BigInteger.valueOf(i));
     		}

     			return factorial;
     	}
     
     /**
 	* Returns the number calculated through mathematical computation of a combination.
 	* The numbers inputed, "(n,r)" is an int to return a BigInteger numeric value, of the JAVA API.
 	* 
 	* @param  int n    A number inputed by the user in their tester class of BigInteger type, 
 	* where n represents the total number of items.
 	* @param  int r    A number inputed by the user in their tester class of BigInteger type, 
 	* where r represents the number of items being chosen at a time. 
 	* @return combination   The result of the mathematical computation after inputed numbers, finding the combination.
 	*/
     
     public BigInteger combination(int n, int r)
     	{
    	 
    	 BigInteger combination = BigInteger.ONE;
    	 
         		for (int i = 1; i <= n - r; i++)
         		{
         		combination = combination.multiply(BigInteger.valueOf(i));
         		}
         	return factorial(n).divide(factorial(r).multiply(combination));
     	}

     /**
  	* Returns the number calculated through mathematical computation of a permutation.
  	* The numbers inputed, "(n,r)" is an int to return a BigInteger numeric value, of the JAVA API. 
  	* The factorial method is utilized for calculations of permutation.
  	* 
  	* @param  int n    A number inputed by the user in their tester class of BigInteger type, 
  	* where n represents the total number of items.
  	* @param  int r    A number inputed by the user in their tester class of BigInteger type, 
  	* where r represents the number of items being chosen at a time. 
  	* @return permutation   The result of the mathematical computation after inputed numbers, finding the permutation.
  	*/
     
    public BigInteger permutation(int n, int r)
    	{
    	
    	 BigInteger permutation = BigInteger.ONE;
    	 
         	for (int i = 1; i <= n-r; i++)
         	{
         	 permutation = permutation.multiply(BigInteger.valueOf(i));
         	}

         return factorial(n).divide(permutation);
     } 
    
    
    							// Set Operations: Union Intersection Complement. . .  //
    
    
    /**
  	* Returns the set of numbers after the "Union" operation.
  	* The numbers inputed, "(SubsA, SubB)" are subsets entered by the user.
  	* 
  	* @param  subsA    A set of numbers inputed by the user in their tester class of ArrayList<Double>
  	* @param  subSB    A a set of numbers inputed by the user in their tester class of ArrayList<Double>
  	* @return unionOp  The result of the mathematical operation: union.
  	*/
    
    public ArrayList<Double> union(ArrayList<Double> subsA, ArrayList<Double> subsB) 
    	{
    		ArrayList<Double> unionOp = new ArrayList<>();
    		unionOp.addAll(subsA);
    		
    			for (double element : subsB)
    			{
    				if (unionOp.contains(element) == false)
    				{
    					unionOp.add(element);
    				}
    			}		
    				Collections.sort(unionOp);
    				return unionOp;
    	}

    
    /**
  	* Returns the set of numbers after the "Union" operation.
  	* The numbers inputed, "(SubsA, SubB)" are subsets entered by the user.
  	* 
  	* @param  subsA    A set of numbers inputed by the user in their tester class of ArrayList<Double>
  	* @param  subSB    A a set of numbers inputed by the user in their tester class of ArrayList<Double>
  	* @return unionOp  The result of the mathematical operation: union.
  	*/
 
    public ArrayList<Double> intersection(ArrayList<Double> subsA, ArrayList<Double> subsB) 
    	{
        	ArrayList<Double> intersectionOp = new ArrayList<>();
        
        		for (double element : subsA)
        		{
        			if (subsB.contains(element))
        			{
        				intersectionOp.add(element);
        			}
        		}
        			Collections.sort(intersectionOp);
        			return intersectionOp;
    	}

    /**
  	* Returns the set of numbers after the "Compliment" operation.
  	* The numbers inputed, "(wSet, subS)" are sets entered by the user.
  	* 
  	* @param  wSet    A set of numbers inputed by the user in their tester class of ArrayList<Double>
  	* @param  subS    A a set of numbers inputed by the user in their tester class of ArrayList<Double>
  	* @return unionOp  The result of the mathematical operation: compliment.
  	*/
    
    public ArrayList<Double> compliment(ArrayList<Double> wSet, ArrayList<Double> subS) 
    	{
        	ArrayList<Double> complimentOp = new ArrayList<>();
        		
        		for (double element : wSet)
        		{
        			if (subS.contains(element) == false)
        			{
        				complimentOp.add(element);
        			}
        		}
        			return complimentOp;
    	}
    
}
    
    
   
     
     