import java.util.Scanner;
public class IT24103220Lab7Q1A     {
       public static void main(String[] args)        {

       int marks;
       double avg=0;
       int sum=0;
       int count=0;
       Scanner SC=new Scanner(System.in);
      
       System.out.println("Enter marks for four subjects: ");
        
     while(count<4) 
    {
          System.out.print("Enter Subject Mark " + (count+1) +": " );
          marks=SC.nextInt();
          sum=sum+marks;
          count++; 
     }  

     System.out.print("\n");
     avg=sum/4;
     System.out.println("Average is : " +avg);

     if(avg<=100 && avg>=75)
     {
        System.out.println("Overall Grade is : Distinction");
      }

       if(avg<=74 && avg>=50)
     {
        System.out.println("Overall Grade is : Credit");
      }

         if(avg<=49 && avg>=0)
     {
        System.out.println("Overall Grade is : Fail");
      }
    }
}