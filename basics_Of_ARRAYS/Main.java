package DSA.basics_Of_ARRAYS;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[4];
		intArray[0] = 22;
		intArray[1] = 44;
		intArray[2] = 88;
		intArray[3] = 77;
		String[] name = { "STEPHEN", "JAMES CLEAR", "ROYAL" };
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(name));
		SingleDimensionArray sda = new SingleDimensionArray(8);

		sda.insert(0, 12);
		sda.insert(1, 33);
		sda.insert(2, 11);
		sda.insert(3, 40);
		sda.insert(4, 99);
		sda.insert(2, 66);
		sda.insert(5, 44);

		var firstElement = sda.arr[0];
		var thirdElement = sda.arr[2];

		System.out.println(firstElement);
		System.out.println(thirdElement);

		System.out.println("Array traversal");
		sda.traversalArray();
		
		sda.searchInArray(33);
	}

}
