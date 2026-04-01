import java.math.BigInteger;

public class Driver {

	public static void main(String[] args) {
	
		Binary maliaMethod = new Binary();
	

		int testData1 = 5000; // 5k
		int testData2 = 10000; // 10k
		int testData3 = 30000; // 5k
		int testData4 = 50000; // 5k
		int testData5 = 70000; // 5k
		int testData6 = 100000; // 5k
		long startTime = 0;
		long elapsedNanos = 0;
		long totalTime = 0;
		BigInteger result = BigInteger.ZERO;
		int[] testSizes = {testData1, testData2, testData3, testData4, testData5, testData6};

		
		/*RECURSION TESTING CODE*/
		
		// Warming up Java for recursion
		for(int i = 0; i < 5000; i++) { 
			Factorial.recFactorial(testData1); 
			
		}

		System.out.println("RECURSION");
		for (int size : testSizes) {
			// Average runtime calculation (10 iterations)
			try {
				for(int i = 0; i < 10; i++) {
					System.gc();
					startTime = System.nanoTime();
					// ... the code being measured ...
					result = Factorial.recFactorial(testData1); // storing the result so that it does not get skipped in time calculation
					elapsedNanos = System.nanoTime() - startTime; // Calculate time spent on operation
					totalTime = totalTime + elapsedNanos; // Total time spent for the iterations
				}
				// Total time spent divided by the amount of iterations
				System.out.println("Recursive Average for " + size + ": " + (totalTime / 10));
			}
			catch (StackOverflowError e) {
				System.out.println("Recursion Cliff reached at: " + size);
				break; // Stop testing recursion once it fails
			}
		}

		
		/*ITERATION TESTING CODE*/

		// Warming up Java for iteration
		for(int i = 0; i < 5000; i++) { 
			Factorial.itrFactorial(testData1); 
		}

		System.out.println("ITERATION");
		for (int size : testSizes) {
			// Average runtime calculation (10 iterations)
			try {
				for(int i = 0; i < 10; i++) {
					System.gc();
					startTime = System.nanoTime();
					// ... the code being measured ...
					result = Factorial.itrFactorial(testData1); // storing the result so that it does not get skipped in time calculation
					elapsedNanos = System.nanoTime() - startTime; // Calculate time spent on operation
					totalTime = totalTime + elapsedNanos; // Total time spent for the iterations
				}
				// Total time spent divided by the amount of iterations
				System.out.println("Iteration Average for " + size + ": " + (totalTime / 10)); 
			}
			catch (StackOverflowError e) {
				System.out.println("Iteration Cliff reached at: " + size);
				break; // Stop testing iteration once it fails
			}
	}

}
}
