
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] practice = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13, 14, 15, 16,17,18,19,20};
		int indexSize = practice.length  - 1;;
		Binary maliaMethod = new Binary();
		System.out.println(maliaMethod.iterationBinarySearch(practice, 14, 2, 17));
		System.out.println(maliaMethod.recursiveBinarySearch(practice, 14, 2, 17));
	}

}
