package sorting;

public class SelectionSort {
	 public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	            
	            for(int k=0; k < arr.length; k++){  
	                    System.out.print(arr[k] + " ");  
	            } 
	            System.out.println();  
	            
	        }  
	    }  
	       
	    public static void main(String a[]){  
	        int[] arr1 = {34,8,64,51,32,21};  
	        
	        System.out.println("Time complexity of Selection sort is : O(n*n)");
	        
	        System.out.println("The smallest element is selected from the unsorted array and swapped with the leftmost element.");
	        
	        System.out.println("Before Selection Sort");  
	        for(int k=0; k < arr1.length; k++){  
	                System.out.print(arr1[k] + " ");  
	        } 
	        System.out.println();
	          
	        selectionSort(arr1);//sorting array using selection sort  
	         
	        System.out.println("After Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	    }  

}
