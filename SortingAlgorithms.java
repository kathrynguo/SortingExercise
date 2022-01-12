public class SortingAlgorithms {
  /*
  //fork and make your own version
   public int[] arr = int[10];
  
   for(int i = 0; i < arr.length; i++) {
	   arr[i] = (int)(Math.random()*100 + 1);
	   System.out.print(arr[i]+ " "); 
    } */
    
    //bubble
    //overloaded so can pass array from tester class
    static void bubbleSort(int arr[]) {
		//counter
		int count = 0; 
		//nested loops
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1; y++) {
				//if previous is greater than next 
				if (arr[y] > arr[y + 1]) {
					//swap
					int a = arr[y]; 
					arr[y] = arr[y + 1]; 
					arr[y + 1] = a; 
					//increase counter
					count++; 
				}
			}
		}
		//print counter
		System.out.println(count); 
	}
	
	//insertion
	//overloaded so can pass array from tester class
	static void insertionSort(int arr[]) {
		//counter
		int count = 0; 
		//for loop starts at 1 b/c assume first element is sorted
        for (int i = 1; i < arr.length; i++) {
			//starting at first unsorted element (1) 
            int a = arr[i];
            //b at this point = 0; used for comparison
            int b = i - 1;
			//if
            while ((arr[b] > a)&& (b > -1)){
				//swap
                arr[b + 1] = arr[b];
                //move index for comparison
                b = b - 1;
                //increase counter
                count++;     
            }
            //minimum unsorted
            arr[b + 1] = a;
        }
        //print counter
		System.out.println(count); 
	}
	
	//overloaded so can pass array from tester class
	static void selectionSort(int arr[]) {
		for (int i = 1; i < arr.length - 1; i ++) {
			//min
			int a = 1; 
			//minimum unsorted element
			//int b = a + 1; 
			//counter
			int count = 0; 
			//moving minimum unsorted element compare element
			for (int b = 2; b < arr.length - 1; b++) {
				//finding minimum unsorted element
				if ( arr[b] > arr[a] ) {
					a = b; 
				}
				//swapping
				if (a != i) {
					int c = arr[i]; 
					arr[i] = arr[i + 1]; 
					arr[i + 1] = c;
					count++;
				}
			}
		//print counter
		System.out.println(count); 
		}
	}
  
