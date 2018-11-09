import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearchExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		int randomNum;
		
		//set up ArrayList of random numbers 
		List<Integer> array = new ArrayList<Integer>(20);
		for (int i = 1; i < 21; i++) {
			randomNum = (int) (Math.random() * 200) + 1;
			array.add(randomNum);	
		}
		
		Collections.sort(array);
				
		//copy random numbers arrayList to array
		int[] normArray = new int[array.size()];
		for(int i = 0; i < array.size(); i++) {
			normArray[i] = array.get(i);
		}
		
		System.out.println("This is a simple guessing game.\nPlease guess a number 1 - 200.");
		int number = input.nextInt();
		
		int returnedNum = binarySearch(array, number);
		if(returnedNum != -1) {
			System.out.println("Your number: " + number + " was found in the arrayList");
		} else {
			System.out.println("Your number: " + number + " was not found in the arrayList");
		}
		
		//binarySearch(normArray, number);
		
	}

	
	/**
	 * binary search on arrayList
	 * @param arrayList
	 * @param guess
	 * @return
	 */
	private static int binarySearch(List<Integer> arrayList, int guess) {
		int min = 0, max = arrayList.size() - 1;
		int avg = 0;
		
	
		while(min <= max) {
			avg = min + (max - min) / 2;
			if(arrayList.get(avg) == guess) {
				return avg;
			}  
			
			if(arrayList.get(avg) < guess) {
				min =  avg + 1;
			} else {
				max = avg - 1;
			}
		}
		return -1;
	}
	
	
	/**
	 * binary search on int[] array
	 * @param array
	 * @param guess
	 * @return
	 */
	private static int binarySearch(int[] array, int guess) {
		int min = 0, max = array.length - 1;
		
		return -1;
	}

}
