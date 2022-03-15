package Sorting;

public class Ssorting {
	static int[] array=new int[]{ 1,5,3,9,2,4,6,7,8 };

	 public static void selectionSort(){  
	        for (int i = 0; i < array.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < array.length; j++){  
	                if (array[j] < array[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = array[index];   
	            array[index] = array[i];  
	            array[i] = smallerNumber;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	 
	        System.out.println("Before Selection Sort");  
	        for(int i:array){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        Ssorting.selectionSort();//sorting array using selection sort  
	         
	        System.out.println("After Selection Sort");  
	        for(int i:array){  
	            System.out.print(i+" ");  
	        }  
	    }  
	}  