package Array;

public class Array1 {

	public static void main(String[] args) {
		int i1 = 10;
		// Array is a collection of similar type of element/values
		//we can store only fixed set element in java array
		//Array is index based and first element of the array is stored at 0th index and last index n-1(array name)
//System.out.println(i1);
//System.out.println(i2);
		// Array Declaratioin
		//syntax
		// datatype arrayname[] = new datatype(size of array)
		int arr [] =new int[10];
		// 2.array initialization 
		//syntax - arraname (index number)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 200;
		arr[9] = 200;
		// Arr[20] = 400;--->Array Index out of bounds Exception
		// array usage 
		System.out.println();
		System.out.println(arr.length);
		System.out.println("Index 5 ="+arr[5]);
		System.out.println("index 2"+arr[2]);
		System.out.println("Index -"+ arr[9]);
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
	}

}
