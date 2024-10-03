import java.util.Scanner;
public class IT24103220Lab7Q1B    {
       public static void main(String[] args)        {


       double avg=0;
       int sum=0;
       int count=1;
       int stuNum;
       int mark1,mark2,mark3,mark4;
       Scanner SC=new Scanner(System.in);
        


       for(stuNum=0; stuNum<3; stuNum++)
       {
           System.out.println("Student " + (stuNum+1));
                  
    
          System.out.print("Enter Marks: " );
         
           mark1=SC.nextInt();
           mark2=SC.nextInt();
           mark3=SC.nextInt();
           mark4=SC.nextInt();
    
          sum=sum+mark1+mark2+mark3+mark4 ;
            
          avg=sum/4;
          System.out.println("Average is : " +avg);
      
          if(avg<=100 && avg>=75)
         {
            System.out.println("Overall Grade is : Distinction");
         }

          else if(avg<=74 && avg>=50)
         {
            System.out.println("Overall Grade is : Credit");
         }

          else if(avg<=49 && avg>=0)
         {
            System.out.println("Overall Grade is : Fail");
         }
        System.out.print("\n");

      }
   }
}