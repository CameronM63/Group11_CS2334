
public class Binary {
	
	//finds index
	public int iterationBinarySearch(int[] arr, int target, int start, int end) {
		
		int midVal = 0;
		while(start <= end) {
			midVal = start + ( (end - start) / 2);
			
			if(arr[midVal]  < target) {
				start = midVal + 1;
			}else if(arr[midVal] > target) {
				end = midVal - 1;
			}else if(arr[midVal] == target) {
				return midVal;
			}
		}
		return  -1;
	
	}
	
	public int recursiveBinarySearch(int[] arr, int target, int start, int end) {
		
		int midVal = start + ( (end - start) / 2);
		
		if(end < start) {
			return - 1;
		}
		
		if(target == arr[midVal]) {
			return midVal;
		}else if(target < arr[midVal]) {
			return recursiveBinarySearch(arr, target, start, midVal - 1);
		}else {
			return recursiveBinarySearch(arr, target, midVal + 1, end);
		}
	}
}
