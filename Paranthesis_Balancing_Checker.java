import java.util.Scanner;

public class Paranthesis_Balancing_Checker{
   public static void main(String[] args)
   {
      String expression;
      int i, length, j=0, count=0;
      char ch, c;
      char[] stk = new char[20];
      Scanner scan = new Scanner(System.in);
      
      System.out.println("\n\u001B[33m                  Welcome To Parenthesis Balance Checker!!\u001B[0m");
      System.out.println("\n\u001B[32m**This is a program where you will learn if your parenthesis is balanced or not.**\u001B[0m");
      System.out.print("Enter the Expression: ");
      expression = scan.nextLine();
      
      length = expression.length();
      
      for(i=0; i<length; i++)
      {
         ch = expression.charAt(i);
         if(ch=='(' || ch=='{' || ch=='[')
         {
            stk[j] = ch;
            j++;
            count = 1;
         }
         else if(ch==')')
         {
            if(count==1)
               j--;
            c = stk[j];
            if(stk.length==0 || c != '(')
            {
               System.out.println("\nUnbalanced Parentheses!");
               return;
            }
         }
         else if(ch=='}')
         {
            if(count==1)
               j--;
            c = stk[j];
            if(stk.length==0 || c != '{')
            {
               System.out.println("\nUnbalanced Parentheses!");
               return;
            }
         }
         else if(ch==']')
         {
            if(count==1)
               j--;
            c = stk[j];
            if(stk.length==0 || c != '[')
            {
               System.out.println("\nUnbalanced Parentheses!");
               return;
            }
         }
      }
      System.out.println("\nBalanced Parentheses.");
   }
}