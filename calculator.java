import java.util.Scanner;
public class calculator
{
   public static void main(String[]args)
   {
      int var=0;
      String op="";
      Scanner keyboard= new Scanner(System.in);
      
      while(var!=-1)
      {
         int result=0;
         System.out.println("Enter your first number: ");
         int dig1=keyboard.nextInt();
         System.out.println("Enter your second number: ");
         int dig2=keyboard.nextInt();
         System.out.println("What operation would you like to implement?\n1) * (Multiplication)\n2) / (Division)\n3) + (Addition)\n4) - (Subtraction) ");
         int operation= keyboard.nextInt();
         
         if(operation==1)
         {
            result= dig1*dig2;
            op="*";
         }
         else if(operation==2)
         {
            if(dig2==0)
            {
               System.out.println("You can't divide by 0.");
                continue;
            }
            else
            {
               result=dig1/dig2;
               op="/";
            }
         }
         else if(operation==3)
         {
            result=dig1+dig2; 
            op="+"; 
         }
         else if(operation==4)
         {
            result=dig1-dig2;
            op="-";
         }
         else
         {
            System.out.print("Invalid.");
            return;
         }
         System.out.println("The result of "+dig1+" "+op+" "+dig2+" = "+result+".");
         System.out.println("Do you want to continue? Enter any other value to continue, -1 to stop: ");
         var=keyboard.nextInt();
      }
      System.out.print("Thank you for using my calculator! :)");
   }
} //This Java program takes two numerical values from the user and performs multiplication, division, addition, or subtraction. The result is then printed, and the user is given the option to continue or exit the program.