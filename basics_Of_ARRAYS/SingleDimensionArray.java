package DSA.basics_Of_ARRAYS;

public class SingleDimensionArray {
	int[] arr = null;

	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insert(int location, int value) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("value inserted successfully");
			} else {
				System.err.println("this cell is already occupied ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index to access an array");

		}

	}

	// Array traversal

	public void traversalArray() {
		
		try {
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
		} catch(Exception e) {
			System.out.print("Array no longer exist");
			
		}
		
	}
	
	//search for an element in an Array
	
	public void searchInArray(int valueToSearch) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("value is found at the " + i +" index");
				return;
			}
		}
		System.out.println(valueToSearch + " value not found");
	}
	
	//Delete value from array
	public void deleteValue(int valueToDelete) {
		try {
			arr[valueToDelete]=Integer.MIN_VALUE;
			System.out.println("successfully deleted");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the value provided is not in the range of array");
		}
	}
	
	
	
	
	
	
	

}
