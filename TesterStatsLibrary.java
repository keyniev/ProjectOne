import java.math.BigInteger;
import java.util.ArrayList;

public class TesterStatsLibrary {

	public static void main(String[] args) {
		StatsLibrary tester = new StatsLibrary();
		ArrayList<Double> addedNumbers = new ArrayList<>();
		
		addedNumbers.add(1.0);
		addedNumbers.add(2.0);
		addedNumbers.add(3.0);
		addedNumbers.add(4.0);
		addedNumbers.add(5.0);
		addedNumbers.add(6.0);
		addedNumbers.add(7.0);
		addedNumbers.add(7.0);
		addedNumbers.add(8.0);
		addedNumbers.add(9.0);
		addedNumbers.add(10.0);
		
		double mean = tester.findMean(addedNumbers);
		double median = tester.findMedian(addedNumbers);
		double mode = tester.findMode(addedNumbers);
		double deviation = tester.standardDeviation(addedNumbers);
		BigInteger factorial = tester.factorial(5);
		BigInteger combination = tester.combination(6,3);
		BigInteger permutation = tester.permutation(6,3);
		
		System.out.println("The mean of these numbers. . . " + mean);
		System.out.println("The median of these numbers. . . " + median);
		System.out.println("The mode of these numbers. . . " + mode);
		System.out.println("The standard deviation of these numbers. . ." + deviation);
		System.out.println("The factorial of this number is..." + factorial);
		System.out.println("The combination of these numbers are..." + combination);
		System.out.println("The combination of these numbers..." + permutation);
		

	}

}
