import java.util.Scanner;
public class BinaryToDecimal {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  long binaryNumber, decimalNumber = 0, j = 1, remainder;
  System.out.println("\u001B[33mWelcome To Binary to Decimal Converter!!\u001B[0m");
  System.out.print("Input a binary number: ");
  binaryNumber = scan.nextLong();

  while (binaryNumber != 0) 
  {
   remainder = binaryNumber % 10;
   decimalNumber = decimalNumber + remainder * j;
   j = j * 2;
   binaryNumber = binaryNumber / 10;
  }
  System.out.println("Decimal Number: " + decimalNumber);

 }
}