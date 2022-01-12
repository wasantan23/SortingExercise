//Tanisha Wasan

public class SortingAlgorithms { // name of our class linked to Tester
int count;
int [] arr = {99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};



// bubble sort code
public void bubbleSort () {
//int [] arr = {5, 16, 27, 3, 14}; //seperate array for bubble sort
	int temp; // declaring a temporary variable
	
for (int x = 0; x < arr.length-1; x++) { // arr.length - 1 is needed otherwise it will have an out of bounds error
	for (int j = 0; j < arr.length -1; j ++) {
		if (arr [j] > arr [j +1] ) { // checking if the value of j is greater than the value next to it
			temp = arr[j];
			count++;
 // this is assinging the array value at j to the temporary variable (swapping values)
			arr [j] = arr [j + 1]; // this is assinging the array value at j + 1 to j (swapping values)
			arr [j + 1] = temp; // this is assinging the temporary variable to j + 1 (swapping values)			
		
				
}
}
}
	System.out.println(count);
//printing out
System.out.println("After bubbleSort");
for (int x = 0; x < arr.length; x++) {
	System.out.print(arr[x] + " "); 
}
System.out.println();
}


public void selectionSort () {
//nt [] arr = {7, 19, 31, 6, 17}; //seperate array for selection sort
	int temp; 
	for (int x = 0; x < arr.length -1; x++) {
		int min = x; // min value is being assigned to position x in the array 
	count++;
	for (int j = x + 1; j < arr.length; j ++) {
		if (arr[min] > arr[j]) { // if the min array value is bigger than the value at positon j in the array, the min will be assigned to j
		min = j;

		
	}
}

temp = arr [min]; // arr min becomes temp (swap values)
arr[min] = arr [x]; // arr at position x becomes min
arr [x] = temp;  // temp becomes the arr at positon x
}
	System.out.println(count);

//printing again
System.out.println("After selectionSort");
for (int x = 0; x < arr.length; x++) {
	System.out.print(arr[x] + " "); 
}
System.out.println();
}



public void insertionSort () {
	// int [] arr = {9, 10, 1, 18, 35}; // seperate arr for insertion sort
	for (int x = 1; x < arr.length; x++) {
	int temp = arr[x]; // assigns the value at postion x in the arr to temp
	int j = x -1; // j value is assigned to value before x
	
	while (j >= 0 && arr[j] > temp) { // checking that j is greater than 0 and that arr at position j is greater than temp 
		arr[j+1] = arr[j]; // the arr at j is being assigned to the value next to it
		count++;
		j = j - 1; // decrementing the value of j - moving to the left
	}
	arr[j+1] = temp; // temp is being assigned to the arr at j + 1

}

System.out.println(count); 

//printing
System.out.println("After insertionSort");
for (int x = 0; x < arr.length; x++) {
	System.out.print(arr[x] + " "); 
}
System.out.println();
}
}

		
	


	

