public class IT24103220Lab7Q2B      {
      public static void main(String[] args)             {

      int r,c;                          //r=row , c=column
      int k=1;
      int count=0;
          
    while(count<5)
         {
             System.out.print((count +1)+ " - " );
            
         for(c=1; c<=k; c++)
                  {
                     System.out.print(" * ");
                   }
           
              System.out.println( );
               count++;
               k++; 
         }
    }
}


/*while(count<5)
         {
             System.out.println((count +1)+ " - " + s );
              count++;*/
