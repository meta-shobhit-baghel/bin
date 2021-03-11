/*

  Assignment 4 

*/

import java.util.*;
class Assignment_4
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
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int arr[] = new int[n];

    for( int i=0; i<n; i++ )
       arr[i] = s.nextInt();

     int num = s.nextInt();

     arr = removeDuplicates(arr); 
     boolean flag  = isMember(int arr[] ,num);
     arr = union(arr1,arr2);
     arr = complement(int arr[]);
  }
}



/*
  2 question  of  same  assignment
*/


  class Assignment_4_1
  {

  public static int power(int n , int p)
   { 
     if(p == 0)
       return 1;

     else
       return power(n,p-1);
   }


  public static float evaluate( int poly_power[] , int poly_value[] , int x )
  {

    float sum =0;

    for( int i=0; i<poly_power.length; i++)
       {
          if( poly_power[i] != 0 )
             sum += poly_value[i] * power(x,i); 
            
       }

    return sum;
  }
 

  public static int degree(int poly_power[])
   {
      for(int i=poly_power.length-1; i>=0; i--)
         {
           if(poly_power[i] != 0 )
              return i;
         } 

     return 0;
   }



  /*
  1. accepts  the  two  polynomials
  2. adds them
  3.  return  the  computed  value in 2X2 matric  1 is  for  powers  2 is  for  values
  */

 public static int[][] add(int poly1_power[] , int poly1_value[] , int poly2_power[] , int poly2_value[] )
  {
    
    int temp[][] = new int[5][5];
    int j=0,k=0;

    for( int i=0; i<poly1_power.length; i++ )
       {
          if( poly1_power[i] == 1 || poly2_power[i] == 1 )
            temp[0][j++] = 1;

         temp[1][k++] = poly1_value[i] + poly2_value[i];
       }

   
   return temp;     

  }

  
 /*
  1. assigning  the  powers  to  the  poly_power  array 
  2. return array  after  update
 */

  public static int[] power_assigning( int poly1_power )
   {  
     for( int i=0; i<5; i++ )
       { 
          System.out.println(" Is variable x of power "+i+" is present or not in  first polyomial  expression ")
          System.out.print("1. if present ");
          System.out.print("2. if not present "); 
          int ch = s1.nextInt();

          if( ch == 1 )
             poly1_power[i] = 1;
      
          else
            poly1_power[i] = 0;    
       }

     return poly1_power;
   }



 /*
  1. assigning  the  powers values  of  coefficients  to  the  poly_power  array 
  2. return array  after  update
 */

  public static int[] coefficient_assigning(int poly1_value[] , String str )
   { 
      // receiving  the  values  present  or  coefficient
 
     System.out.println(str);

     for( int i=0; i<5; i++ )
       { 
          System.out.println("enter  the  coefficient of x to power "+i);
          int ch = s1.nextInt();

          poly1_value[i] = ch;
       }

    return poly1_value;
   }


  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    String str1 = nextLine();                  // for  first  polymial  complete 2x^5+4x^4+7 etc.
    
   
    int poly1_power[] = new int[5];
    int poly1_value[] = new int[5];


    String str2 = nextLine();                  // for  second  polymial  complete


    int poly2_power[] = new int[5];
    int poly2_value[] = new int[5];

  
    poly1_power = power_assigning(poly1_power);  //updating  the  power  array  with  first  polynomial
    poly2_power = power_assigning(poly2_power);  //updating  the  power  array  with  second  polynomial


    poly1_value = coefficient_assigning(poly1_value,str1);   //updating  the coeff. of powers  array  with  first  polynomial
    poly2_value = coefficient_assigning(poly1_value,str2);

 
    int x = s1.nextInt();                                      // for  which  value  you  are  solving  polynomial
    System.out.print(evaluate(poly1_power,poly_value,x) );
    System.out.print( degree(poly1_power) );
    System.out.print( add(poly1_power,poly1_value,poly2_power,poly2_value) );
   
  }