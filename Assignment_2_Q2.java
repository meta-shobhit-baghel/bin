/*

 assignment 2  2nd  question 

 Scheduling 

*/

 class Assignment_2_Q2 
 {


 /**

   * here  as  we  need  to  take  the  difference  for  the  waiting  time  and  turnaround  time
   * hence  we  are  generalising  this  function  for  the  calculation  of  differeence  of  two  
     arrays.

   */

 public static int[] diff_of_array( int arr1[] , int arr2[] )
  {
    for( int i=0; i<arr1.length; i++ )
       {
          int temp = 0;
          temp = arr1[i] - arr2[i];
       
          if( temp>0 )
            arr1[i] = temp;
  
          else
            arr1[i] = -(temp);
       }

    return arr1;
  }




 /**
   * calcalation  of  completion  time  
   * firstly  assignigning  the  completion  time  of Process P0 is burst  time.
   * checking  everytime  the  arrival  time  to  the  completion  time  upto  previous  processes
     and  perform  the  below  stated  computation  mentioned  in  the  loop

  */


 public static int[] completion_time_array( int arrival_time[] , int burst_time[] )
  {
     int completion_time[] = new int[arrival_time.length];


     completion_time[0] = burst_time[0];

     for( int i=1; i<arrival_time.length; i++ )
        {
          if( arrival_time[i]<completion_time[i-1] )
             completion_time[i] = completion_time[i-1]+burst_time[i];

          else
             {
               int temp = arrival_time[i] - completion_time[i-1];
               completion_time[i] = completion_time[i-1] + temp + burst_time[i];
             }
        }

    return completion_time;
  }


  /**
    * Here  we  are  taking  two  arrays  arrival  time  array  &  nburst  time  array 
      for  storing  the  process particulars.
    * receing  the  inputs  call  method  for  completion  time  and  assigniging  the  resultant
      to  the completion time  array .
    * this  process  follows  on  for  every  process  function  calculation(i.e turnaround  time
       waiting  time etc ).

  */

 public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

   int arrival_time[] = new int[n];
   int burst_time[]   = new int[n];

   for( int i=0; i<n; i++ )
    { arrival_time[i] = s.nextInt();
      burst_time[i]   = s.nextInt();
    }

   int completion_time[] = completion_time_array(arrival_time,burst_time);
   int turnaround_time[] = diff_of_array(completion_time,arrival_time);
   int waiting_time[]    = diff_of_array(turnaround_time,burst_time);
  }

 }