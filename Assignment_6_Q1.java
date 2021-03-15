/*

                         *************  Assignment 6  **************

                           ABSTRACT  AND  CONCRETE  DATA  TYPES 

    

*/

import java.util.*;
class Assignment_6_Q1
{
 

 /*
 1.  accepting  the  given  set
 2.  removing  the  duplicates  as  set  does  not  have  the  duplicate  values  using  count  array  universal  set
 3.   return  the  array  set
 */


 public static int[] removeDuplicates( int arr[] ) 
  {
    int u_set[] = new int[1001] // for  count 1-1000

    for( int i=0; i<arr.length; i++ )
        u_set[ arr[i] ]++;

    int count = 0;

    for( int i=0; i<u_set.length; i++ )
       {
         if( u_set[i] != 0 )
           count++;
       }

    int temp[] = new int[count];
    int k =0;

    for( int i=0; i<u_set.length; i++ )
       { 
         if( u_set[i] != 0 )
           temp[k++] = u_set[i];
       }

    return temp;
  }

 

 /*
  1.  checking  whether  the  element  is  present  in  set  or  not
  2.   return  the  boolean  value
  3.   linear  search  approach

*/


 public static boolean isMember(int arr[] ,int num)
  {
    for(int i=0; i<arr.length; i++)
       { 
         if( arr[i] == num )
           return true;
       }

    return false;
  }



/*
 1. finding  the  complemet of  given  set  with  respect  to  the  universal  set 
 2. returns  the  array set
*/


 public static int[] complement(int arr[])
 {
   int u_set[] = new int[1001];  // to  store 1-1000 , universal  set

   for(int i=0; i<u_set.length; i++)
      u_set[i] = i;

   for( int i=0; i<arr.length; i++ )
      u_set[ arr[i] ] = 0;

   int temp[] = new int[u_set.length-arr.length];
   int k =0;

   for( int i=0; i<u_set.length; i++)
      {
        if( u_set[i] != 0 )
          temp[k++] = u_set[i];
      }

   return temp;
 }


/*
 1.  union of  the  two  sets 
 2.  accepting  sets and  returning  set 
*/

 public static int[] union( int arr1[] , int arr2[] )
  { 
    int temp[] = new int[arr1.length+arr2.length];

    for(int i=0; i<arr1.length; i++)
       temp[k++] = arr1[i];

    for(int i=0; i<arr2.length; i++)
       temp[k++] = arr2[i];

    return removeDuplicates(temp); 
  }


 public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);               // accepting  the  set  length  and  values
    int n = s.nextInt();

    int arr[] = new int[n];

    for( int i=0; i<n; i++ )
       arr[i] = s.nextInt();

     int num = s.nextInt();
 
     arr = removeDuplicates(arr);                    // removing  duplicates
     boolean flag  = isMember(int arr[] ,num);       // checking  memeber
     arr = union(arr1,arr2);                         // union 
     arr = complement(int arr[]);                    // compliment
  }
}



