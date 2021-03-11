/*

 metacube  assignment 2
 
 Dear sir  

* this  is  just  the  for  functionality  check  i will  commit  all  the  changes  after  green  signal  from  your  side  

 Thank You

* 2 ques is  remaining  it  is  showing  some  error

*/

import java.util.*;
class  Assignment_2 {


 

 public static int power( int n , int p )
  {
    if( p == 0 )
      return 1;
 
    else
      return n*power( n , p-1 ); 
  }


  public static String multiply(String str1 , String str2 )
   {
      str1 = Hex_to_Decimal(str1);
      str2 = Hex_to_Decimal(str2);

     int k1 = Integer.parseInt(str1);
     int k2 = Integer.parseInt(str2);

     return String.valueOf(k1*k2);
   }



  public static int divide(String str1 , String str2 )
   {
      str1 = Hex_to_Decimal(str1);
      str2 = Hex_to_Decimal(str2);

     int k1 = Integer.parseInt(str1);
     int k2 = Integer.parseInt(str2);

     return String.valueOf(k1/k2);
   }


  public static int compareTo( String str1 , String str2 )
   {
      str1 = Hex_to_Decimal(str1);
      str2 = Hex_to_Decimal(str2);

      if( str1.equals(str2) )
         return 0;

      if( str1.length() > str2.length() )
         return 1;

      if( str1.length() < str2.length() )
         return -1;

      
       if( str1.length() == str2.length() )
         {
           for( int i=0; i<str1.length(); i++ )
              {
                if( Character.getNumericValue(str1.charAt(i)) > Character.getNumericValue(str2.charAt(i)) )
                  return 1;

                if( Character.getNumericValue(str1.charAt(i)) < Character.getNumericValue(str2.charAt(i)) )
                  return -1;
              }
         }

      
   }

  public static String Decimal_to_Hexa( int n )
   {
     String answer = "";

     while( n != 0 )
      {
        int temp = n % 16;
 
       if( temp >= 10 )
          answer += String.valueOf( (char) (55+temp) );

        else
          answer += String.valueOf( temp );
 
        n = n / 16; 
      }  

    return reverse(answer);
   }


 public static String Hex_to_Decimal( String str1 )
  {
       int j =0 , answer = 0;

    for( int i=str1.length()-1; i>=0; i-- )
       {
           answer += Character.getNumericValue( str1.charAt(i) ) * power(16,j++);
       }
    return String.valueOf(answer); 
  }

 public static String subtract( String str1 , String str2 )
  {
       String final_string = "";
       int flag = 0;

    for( int i = str1.length()-1 , j = str2.length()-1; i>=0 && j>=0; i--,j-- )
       {
           int c1 = Character.getNumericValue(str1.charAt(i) );
           int c2 = Character.getNumericValue(str2.charAt(j) );

            if( flag == 1 )
               c1--;

            if( c1<c2 )
              { c1 += 16;
                flag = 1;
              }

            else
              flag = 0;

            int sub = c1-c2;
           
            if( sub>=10 )
              final_string += String.valueOf( (char) (55+sub) );

            else
              final_string += String.valueOf( sub );

       }

    return reverse(final_string);
  }

 public static String reverse( String str1 )
  {
    String str2 = "";

    for( int i = str1.length()-1; i>=0; i-- ) 
        str2 += String.valueOf( str1.charAt(i) );
       
    return str2;
  }


 public static String add( String str1 , String str2 )
 {
    int carry_flag = 0;
    String final_string = "";

  

    for( int i = str1.length()-1 , j = str2.length()-1;  i>=0 && j>=0 ; i-- , j-- )
       {
          int c1 = Character.getNumericValue( str1.charAt(i) );
          int c2 = Character.getNumericValue( str2.charAt(j) );

          int sum = c1 + c2 + carry_flag;

          

          if( sum > 15 )
            {  
              int temp = sum % 16;
              

              if( temp >= 10 )
                  final_string += String.valueOf( (char)(55+temp) );
              
              else 
                 final_string += String.valueOf( temp );
              
              carry_flag = sum / 16;
              
            }

          else
            {
              if( sum >= 10 )
                final_string += String.valueOf( (char)(55+sum) );

              else
                final_string += String.valueOf(sum);

            

            }

        
       } 

   
    return reverse(final_string);
 }



 public static void main(String args[])

 {
   Scanner s = new Scanner(System.in);
   String str1 = s.nextLine();

   String str2 = s.nextLine();

  
  
  System.out.println( add( str1 , str2 ) );
  
    System.out.println( subtract( str1 , str2 ) );
    System.out.println( Hex_to_Decimal(str1) +" "+ Hex_to_Decimal(str2));
    System.out.println( Decimal_to_Hexa( Integer.parseInt(Hex_to_Decimal(str1))) +" "+Decimal_to_Hexa( Integer.parseInt(Hex_to_Decimal(str2))) );
    System.out.println( toCompare(str1 , str2 ) );
  

 }

 }