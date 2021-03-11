/*

  Metacube  Assignment 06

  Dear sir  

 this  is  just  the  for  functionality  check  i will  commit  all  the  changes  after  green  signal  from  your  side  

 Thank You



*/


import java.util.*;
class Matrix 
 {
   private int arr[][];
   private int arr
 

 Matrix(int arr[][])
  { 
    this.arr1 = arr;
  }

 
 Matrix( int arr1[][] , int arr2[][] )
  {
    this.arr1 = arr1;
    this.arr2 = arr2;
  }
 


 public static boolean isSymmetric( int arr1[][] )
  {
    if( arr1[0].length != arr1.length )
      return false;

    int temp1[][] = new int[arr1.length][arr1.length];
    
    temp1 = transpose(temp1);

    for( int i=0; i<arr1.length; i++ )
       {
         for( int j=0; j<arr1.length; j++ )
          {
             if( arr1[i][j] != temp[i][j];
                return false;
          }
       }
 
   
    return true; 
  }


 public static int[][] add( int arr1[] , int arr2[] )
  {
    if( (arr1.length == arr2.length) && (arr1[0].length == arr2[0].length) )
      {
         for( int i=0; i<arr1[0].length; i++ )
            {
              for( int j=0; j<arr1.length; i++ )
                  arr1[i][j] += arr2[i][j];
            }

         return arr1;
      }

    return 0;
  }



 public static int[][] transpose( int arr1[][] )
  {
    int temp[][] = new int[arr1.length][arr1[0].length]; 
    int k =0;

    for( int i=0; i<arr1[0].length; i++ )
       {
          for( int j=0; j<arr1.length; j++ )
              temp[k++][i] = arr1[i][j];
          k =0;
       }

    return temp;
  }


 public static int[][] multiply( int arr1[][] , int arr2[][] )
  {
    if( arr1.length == arr2[0].length )
      {
       int temp[][] = new int[arr1[0].length][arr2.length];

       for( int i=0; i<arr1[0].length; i++ )
          {
           for( int j=0; j<arr1.length; j++ )
              {
               for( int k=0; k<arr1.length; k++ )
                  temp[i][j] += arr1[i][k]*arr[k][j]; 
              }  
          }
      }

    else
       return 0;
  } 

 }

 class MC_6 
  {
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();


    int arr[] = new int[m][n];
 
    for( int i=0; i<m; i++ )
       {
         for( int j=0; j<n; j++ )
            arr[i][j] = s.nextInt();
       }

    Matrix m1 = new Matrix(arr1,arr2);
    arr = m1.add(arr1,arr2);
    arr = m1.multiply(arr1,arr2);
    arr = m1.transpose(arr1);
    boolean flag = m1.isSymmetric(arr1);
 
  }
 }