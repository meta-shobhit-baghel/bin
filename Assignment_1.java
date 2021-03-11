/*

  Metacube  Assignment  1  Shopping  Cart 

*/


import java.util.*; 
class Assignment_1 {


  public static void bill_details(String str , String bill_details[][] )
   {
     System.out.println(" Customer name : +str );

     for( int i=0; i<bill_details[0].length; i++ )
        {
          for( int j=0; j<bill_details.length; j++ )
              System.out.print(bill_details[i][j]+"   ");

          System.out.println();
             
        }
   }


  public static float calculate_bill( int order_1 , int item_code[] , float item_price[] )
   {
       for( int i=0; i<item_code.length; i++ )
          {
            if( order_1 == item_code[i] )
               return item_price[i];

          }
       
      return 0;
   }


  public static void your_mart( int item_code[] , float item_price[] )
  {
     System.out.println("  enter  your  name  please !! ");
     Scanner s = new Scanner(System.in);
     Scanner s1 = new Scanner(System.in);
     String str = s.nextLine();
     String bill_details[][] = new String[10][10];
     
        
      System.out.println();
      System.out.println();
      System.out.println();

      
      System.out.println("  welcome "+str+"  so  what  you  wish  to  order  today  !! ");

      System.out.println();
      System.out.print(str+ " kindly  enter  the  item  code to  your  cart ");
      int order_1 = s1.nextInt(); 
      bill_details[k1][k2++] 

      System.out.println();
      System.out.print(" now  Quantity ");
      float qty = s1.nextFloat();

      
      float bill_1 = qty * calculate_bill( order_1 , item_code , item_price );

      
      System.out.println();
      System.out.println();
      System.out.println();


    while( true )     
     {
      System.out.println("1. Add  more  items  to  your  cart ");
      System.out.println("2. Remove  items  to  your  cart ");
      System.out.println("3. Final  Billing  items  to  your  cart ");

      System.out.println();
      System.out.println();

 
      System.out.println(" Enter  Your  Choice  Please  !! ");

      int ch = s1.nextInt();

       switch(ch)
        {
          case 1:
            System.out.print(str+ " kindly  enter  the  item  code to  your  cart ");
            order_1 = s1.nextInt(); 
            System.out.println();
            System.out.print(" now  Quantity ");
            qty = s1.nextFloat();

            float  bill_2 = qty * calculate_bill( order_1 ,item_code , item_price );
            bill_1 += bill_2;

            break;
          
          

          case 2:
           System.out.print( "  " + str+ " kindly  enter  the  item  code to  remove from your  cart ");
           order_1 = s1.nextInt(); 
           System.out.println();
   
           bill_2 = calculate_bill( order_1 ,item_code , item_price );
    
           bill_1 -= bill_2;
           break;



           case 3 :
            generate_bill(str,bill_details);
            System.out.print(str+" yours  bill  is  Rs "+bill_1 +" Please  Visit  Soon !! ");
            return;
            
        }
     }


  }


  public static void Main_Menu( int item_code[] , float item_price[] )
   { 
        
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();


      System.out.println("-----------------------  Welcome  to  Your  Mart -----------------------  ");

      System.out.println();
      System.out.println();

      System.out.println("item - code              item - Name            Price");


      System.out.println("     1501                   Rice                150.00 ");
      System.out.println("     1502                   Wheat               25.00 ");
      System.out.println("     1503                   Dal                 95.00 ");
      System.out.println("     1504                   Oats                180.00 ");
      System.out.println("     1505                   Porridge            150.00 ");
      System.out.println("     1506                   Salt                20.00 ");
      System.out.println("     1507                   Sugar               40.00 ");
      System.out.println("     1508                   Tea                 230.00 ");
      System.out.println("     1509                   Coffee              250.00 ");
      System.out.println("     1510                   Corn Flour          150.00 ");
      System.out.println("     1511                   Semolina            50.00 ");


      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

    System.out.println("-----------------------  ************************ -----------------------  ");


   }

  public static void main(String args[] )
  {

      Scanner s = new Scanner(System.in);
      //System.out.println(" enter  the  size  of  your  items ");
      //int n = s.nextInt();


      


     int item_code[] = {1501,1502,1503,1504,1505,1506,1507,1508,1509,1510,1511};

     float item_price[] = {150,25,95,180,150,20,40,230,250,150,50}; 



      /*
      for( int i=0; i<n; i++ )
         item_code[i] = s.nextInt();

      


      System.out.println(" now  enter  the  price  of  items ");
 
     for( int i =0; i<n; i++ )
        item_price[i] = s.nextFloat();

   
      */
   
   Main_Menu(item_code,item_price);

   while( true ) 
     {
        your_mart( item_code , item_price );

        System.out.println();
        System.out.println();
     
   

 
        System.out.println("  ----------------------------------------------------------    ");


        System.out.println(" 1. Serve  to  next  Customer  ");
        System.out.println(" 2. Exit  Application ");

   
        System.out.println();
        System.out.println();

 
        System.out.println(" Enter  Your  Choice  Please  !! ");

 
        int ch = s.nextInt();
         
        if( ch == 2 )
          break;
      
     }

  
     System.out.print(" Happy  to  Serve  You  Please  Visit  Soon !! ");


  }


}