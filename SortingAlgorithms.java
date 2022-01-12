//Tanisha Wasan

public class SortingAlgorithms { // name of our class linked to Tester


// bubble sort code
public void bubbleSort () {
int [] arr = {5, 16, 27, 3, 14}; //seperate array for bubble sort
	int temp; // declaring a temporary variable
for (int x = 0; x < arr.length-1; x++) { // arr.length - 1 is needed otherwise it will have an out of bounds error
	for (int j = 0; j < arr.length -1; j ++) {
		if (arr [j] > arr [j +1] ) { // checking if the value of j is greater than the value next to it
			temp = arr[j]; // this is assinging the array value at j to the temporary variable (swapping values)
			arr [j] = arr [j + 1]; // this is assinging the array value at j + 1 to j (swapping values)
			arr [j + 1] = temp; // this is assinging the temporary variable to j + 1 (swapping values)

}
}
}
//printing out
System.out.println("After bubbleSort");
for (int x = 0; x < arr.length; x++) {
	System.out.print(arr[x] + " "); 
}
System.out.println();
}


//selection sort code
public void selectionSort () {
int [] arr = {7, 19, 31, 6, 17}; //seperate array for selection sort
	int temp; 
	for (int x = 0; x < arr.length -1; x++) {
		int min = x; // min value is being assigned to position x in the array 
	for (int j = x + 1; j < arr.length; j ++) {
		if (arr[min] > arr[j]) { // if the min array value is bigger than the value at positon j in the array, the min will be assigned to j
		min = j; 
	}
}
temp = arr [min]; // arr min becomes temp (swap values)
arr[min] = arr [x]; // arr at position x becomes min
arr [x] = temp;  // temp becomes the arr at positon x
}

//printing again
System.out.println("After selectionSort");
for (int x = 0; x < arr.length; x++) {
	System.out.print(arr[x] + " "); 
}
System.out.println();
}



//insertion sort code
  public void insertionSort () {
	int [] arr = {9, 10, 1, 18, 35}; // seperate arr for insertion sort
	for (int x = 1; x < arr.length; x++) {
	int temp = arr[x]; // assigns the value at postion x in the arr to temp
	int j = x -1; // j value is assigned to value before x
	
	while (j >= 0 && arr[j] > temp) { // checking that j is greater than 0 and that arr at position j is greater than temp 
		arr[j+1] = arr[j]; // the arr at j is being assigned to the value next to it
		j = j - 1; // decrementing the value of j - moving to the left
	}
	arr[j+1] = temp; // temp is being assigned to the arr at j + 1
}

//printing
System.out.println("After insertionSort");
for (int x = 0; x < arr.length; x++) {
	System.out.print(arr[x] + " "); 
}
System.out.println();
}
}

		
	


