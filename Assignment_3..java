/*

 Metacube  Assignment 03 

 Dear sir  

 this  is  just  the  for  functionality  check  i will  commit  all  the  changes  after  green  signal  from  your  side  

 Thank You

*/


import java.util.*;
import java.lang.*;
class Assignments_3 {


 public static int equals( String str1 , String str2 )
  {
     if(str1.length() != str2.length() )
        return 0;

     for( int i=0; i<str1.length(); i++ )
        { 
          if( str1.charAt(i) != str2.charAt(i) )
             return 0;
        }

    return 1;
  }



 public static String reverse( String str1 )
  {
     String str2 = "";

     for( int i=str1.length()-1; i>=0; i-- )
         str2 += String.valueOf(str1.charAt(i) );
        
    return str2;
  }


 public static String Upper_to_Lower( String str1 )
  {
      String str2 ="";

      for( int i=0; i<str1.length(); i++ )
         { 
           int temp = str1.charAt(i);

           if( temp >= 65 && temp <= 90 )
             {
               
                temp += 32;
                 
                
                str1 = str1.substring(0,i) + String.valueOf((char)temp) + str1.substring(i+1);
             }
         }

      return str1;
  }


 public static String Lower_to_Upper( String str1 )
  {
 
      String str2 ="";

      for( int i=0; i<str1.length(); i++ )
         { 
           int temp = str1.charAt(i);

           if( temp >= 97 && temp <= 122 )
             {
               temp -= 32;
               str1 = str1.substring(0,i) +  String.valueOf( (char)temp ) + str1.substring(i+1);
             }
         }

      return str1;
  }






 public static void main(String args[] )
  {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    String str1 = s.nextLine();
    String str2 = s1.nextLine();

   System.out.println(Upper_to_Lower(str1) );
   System.out.println(Lower_to_Upper(str2) );

  }
 }





 // Second  Assignment  question 2 


import java.util.*;
 class M3_2
 {

  public static int max_grade( int arr[] )
  {
    int max = arr[0];
 
    for(int i=1; i<arr.length; i++ )
       {
         if( arr[i] > max )
           max = arr[i];         
       }
    return max;
  }


 public static int min_grade( int arr[] )
  {
    int min = arr[0];
 
    for(int i=1; i<arr.length; i++ )
       {
         if( arr[i] < min )
           min = arr[i];         
       }
    return min;
  }

 public static float average_grade( int arr[] )
  {
    float sum = 0;

    for( int i=0; i<arr.length; i++ )
       sum += arr[i];

     return sum/arr.length;
  }

 
 public static float percentage_passed( int arr[] )
  { 
     
     int count = 0;

     for( int i =0; i<arr.length; i++ )
        {
           if( arr[i] >= 40 )
              count++;
        }

     
     return  count / (float) arr.length * 100 ;

     //return (float) (count / arr.length) * 100;
     
  }


 public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int arr[] = new int[n];


    for( int i =0; i<n; i++ )
       arr[i] = s.nextInt();

    System.out.println( max_grade(arr) );
    System.out.println( min_grade(arr) );
    System.out.println( average_grade(arr) );
    System.out.println( percentage_passed(arr) );
  }
  
 }





// 2 question  of  assignment 2



import java.util.*;
class Circle 
{

  double radius;

 Circle( double radius )
  {
    this.radius = radius;    
  }

 public static double getArea( double radius )
  {
     return (3.14 * radius * radius);
  }
 

 public static double getPerimeter( double radius )
  {
    return (2*3.14*radius);
  }

}


class Triangle 
 {

  double length;
  double height;


  Triangle (double length , double height)
  {
    this.length = length; 
    this.height = height;   
  }

 public static double getArea( double length ,double height )
  {
     return  ( (length * height) / 2 );
     
  }

 

 public static double getPerimeter( double length , double height )
  {
    return (3*length);
  }

}


 class Square 
{

  double side;

 Square( double side )
  {
    this.side = side;    
  }

 public static double getArea( double side )
  {
     return (side*side);
  }
 

 public static double getPerimeter( double side )
  {
    return (4*side);
  }

}


 class Rectangle 
{

  double length;
  double breadth;

 Rectangle( double length , double breadth )
  {
    this.length = length; 
    this.breadth = breadth;    
  }

 public static double getArea( double length , double breadth )
  {
     return (length*breadth);
  }
 

 public static double getPerimeter( double length , double breadth )
  {
    return ( 2*(length+breadth) );
  }

}

class Assignment_2_3
 {
   public static void main(String args[])
   {
     Circle c1 = new Circle(7);
     Triangle t1 = new Triangle(5,6);
     Rectangle r1 = new Rectangle(5,7);
     Square s1 = new Square(5);

     System.out.print( "Area = " +c1.getArea(7) );
     System.out.println( "Perimeter "+c1.getPerimeter(7) ); 

     System.out.print( "Area = "+t1.getArea(5,6) );
     System.out.println( "perimeter " +t1.getPerimeter(5,6) );

     System.out.print( "Area "+r1.getArea(5,7) );
     System.out.println( "Perimeter " + r1.getPerimeter(5,7) );

     System.out.print( "Area "+s1.getArea(5) );
     System.out.println( "Perimeter "+s1.getPerimeter(5) );
   }
 }