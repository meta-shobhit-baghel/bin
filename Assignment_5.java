/*

 Assignment  5  Recursion

 1. solution of queen question is  doubted 

*/

 import java.util.*;
 class Assignment_5
 {



 public static int hcf(int a,int b)
   {
     
     if (b != 0)
        return hcf(b,a%b);
    
     else
        return a;

   }

 public static int lcm( int a , int b )
   {
    
    int temp = 1;    
   
    if(temp%a == 0 && temp%b == 0)
      return temp;
      
    else
    {
      temp++;
      find_lcm(a,b);
      return temp;
     }

   }

 
 
 private static int binarySearch(int[] array, int search, int low, int high) {
  
  
    if( search>array[array.length-1])
      return -1;
      
      
    if (low > high) { return -1; }
   
    
    int mid = (low + high) / 2;

    if (array[mid] == search) 
       return mid; 
    
    else if (array[mid] < search) 
     return binarySearch(array, search, mid + 1, high); 
        
    
    
    
    else if (array[mid] > search) 
     return binarySearch(array, search, low, mid-1); 
        
    
    return 0;
 }

 
 public static int linearSearch(int arr[],int low ,int search)
  { 
    if( low >= arr.length )
       return -1;

    if( arr[low] == search )
      return mid+1;
      
    else
      linearSearch(arr,low++,search);
    
  }


 public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int arr[] = new int[n];

    for( int i=0; i<n; i++ )
        arr[i] = s.nextInt();

    int num = s.nextInt();
    System.out.println( binarySearch(arr,arr[0],arr[arr.length-1],num) );
  }
 }


 