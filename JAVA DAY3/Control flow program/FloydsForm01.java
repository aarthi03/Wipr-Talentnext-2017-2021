import java.util.Scanner;
 
class FloydsForm01
{
   public static void main(String args[])
   {
      int num, a, b;
     
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      
      for ( a = 1 ; a <= num; a++ )
      {
         for ( b = 1 ; b <= a ; b++ )
           {
              System.out.print("*"+" ");
              
           }
          System.out.println();
      }
      
      }
}