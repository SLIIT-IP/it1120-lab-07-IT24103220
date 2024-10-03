import java.util.Scanner;
public class IT24103220Lab7Q3            {
       public static void main(String[] args)          {

     double amount;
     double discount;
     double total=0;
     char mode;
     double newAmount=0;
     int customer;
     
     for (customer=0; customer<=5; customer++)
       {
           System.out.println("Customer " + (customer+1));
       
          Scanner SC=new  Scanner(System.in);
          System.out.print("Enter total bill amount: ");
          amount=SC.nextDouble();
      
         System.out.print("Enter mode of payment (c for cash, o for other): ");
         mode=SC.next().charAt(0);
      
       if (mode=='c' || mode=='C') 
        {
           discount=(amount*0.05);
           System.out.println("Discount is: " + discount);
           total=amount-discount;
           System.out.println("Amount to be paid: " + total);
        }

      else if (mode=='o' || mode=='O') 
         {
           discount=(amount*0.05);
           System.out.println("Discount is: " + discount);
           total=amount-discount;
           System.out.println("Amount to be paid: " + total);
        }

 
      else
        {           
           System.out.println("Payment mode is not valid " );
        }
     }
     }
}