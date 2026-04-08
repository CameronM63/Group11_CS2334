import java.math.BigDecimal;
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

		
		//for binary search
		int otherResult = 0;
		int[] testDataArr1 = new int[5000];
		int[] testDataArr2 = new int[10000];
		int[] testDataArr3 = new int[30000];
		int[] testDataArr4 = new int[50000];
		int[] testDataArr5 = new int[70000];
		int[] testDataArr6 = new int[100000];
		
		/*RECURSION TESTING CODE*/
		
		// Warming up Java for recursion
		for(int i = 0; i < 5000; i++) { 
			testDataArr1[i] = i + 1;
			Factorial.recFactorial(testData1); 
		}
		//for binary search
		for(int i = 0; i < 10000; i++) { 
			testDataArr2[i] = i + 1;
		}
		for(int i = 0; i < 30000; i++) { 
			testDataArr3[i] = i + 1;
		}
		for(int i = 0; i < 50000; i++) { 
			testDataArr4[i] = i + 1;
		}
		for(int i = 0; i < 70000; i++) { 
			testDataArr5[i] = i + 1;
		}
		for(int i = 0; i < 100000; i++) { 
			testDataArr6[i] = i + 1;
		}
		
		int[][] testArrays = {testDataArr1, testDataArr2, testDataArr3, testDataArr4, testDataArr5, testDataArr6};

		System.out.println("RECURSION Factorial");
		for (int size : testSizes) {
			// Average runtime calculation (10 iterations)
			try {
				for(int i = 0; i < 10; i++) {
					System.gc();
					startTime = System.nanoTime();
					// ... the code being measured ...
					result = Factorial.recFactorial(size); // storing the result so that it does not get skipped in time calculation
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

		System.out.println("ITERATION Factorial");
		for (int size : testSizes) {
			// Average runtime calculation (10 iterations)
			try {
				for(int i = 0; i < 10; i++) {
					System.gc();
					startTime = System.nanoTime();
					// ... the code being measured ...
					result = Factorial.itrFactorial(size); // storing the result so that it does not get skipped in time calculation
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
		
		int storedCliff = 0;
		//Recursive binary testing 
		System.out.println("RECURSION Binary");
		for (int[] arr : testArrays) {
			// Average runtime calculation (10 iterations)
			try {
				for(int i = 0; i < 10; i++) {
					System.gc();
					startTime = System.nanoTime();
					// ... the code being measured ...
					otherResult = maliaMethod.recursiveBinarySearch(arr, arr.length - 1, 0, 4999 ); // storing the result so that it does not get skipped in time calculation
					elapsedNanos = System.nanoTime() - startTime; // Calculate time spent on operation
					totalTime = totalTime + elapsedNanos; // Total time spent for the iterations
					
				}
				// Total time spent divided by the amount of iterations
				System.out.println("Recursive Average for " + arr.length + ": " + (totalTime / 10));
			}
			catch (StackOverflowError e) {
				System.out.println("Recursion Cliff reached at");
				break; // Stop testing recursion once it fails
			}
		}

		
		
		

}
}
