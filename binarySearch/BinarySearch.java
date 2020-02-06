package binarySearch;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] list = new int[100];
		for(int i = 0; i < list.length ; i++) {
			list[i] = i+1;
		}
		
		System.out.println(binarySearch(list, 50));   //2
		System.out.println(binarySearch(list, 56));  //55
		System.out.println(binarySearch(list, 103)); //null
		System.out.println(binarySearch(list, 98));  //97
		
	}
	
	private static Integer binarySearch(int list[], int item) {
		int low = 0;
		int high = list.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			int guess = list[mid];
			if(guess == item) {
				return mid;
			}
			if(guess > item) {
				high = mid - 1;
			}else { //guess < item
				low = mid + 1;
			}
		}
		return null;
	}
}
		
		


	

