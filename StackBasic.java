import java.util.Scanner;

public class StackBasic {
private int maxSize; private int top; private int[] stackArray; 

// constructor 
public StackBasic(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1; // initially stack is empty
}
// Add element to top of stack public void push(int value)
public void push(int value) {
    if (top == maxSize - 1) {
        System.out.println("\n\u001B[34mThe stack is full, element cannot be push");
    } 
    else {
        stackArray[++top] = value;
        System.out.println("\n\u001B[34mHere's your result...");
        System.out.println("Pushed Element: " + value + ".\u001B[0m\n");
    }
}

// Remove element from top of stack 
public void pop() {
    if (top == -1) {
        System.out.println("\n\u001B[34mThe stack is empty, element cannot be pop.\u001B[0m");
    }
    else {
        int poppedElement = stackArray[top--];
        System.out.println("\n\u001B[34mHere's your result...");
        System.out.println("Popped Element: " + poppedElement + ".\u001B[0m\n");
    }
}
// Return top of stack 
public int peek() {
    if (top == -1) {
        System.out.println("\u001B[34mThe stack is empty.\u001B[0m");
        return -1;
    }
    else {
        return stackArray[top];
    }
}
public static void main(String args[]) {
    StackBasic stack = new StackBasic(3);
    Scanner scan = new Scanner(System.in);

    System.out.println("\u001B[33mWelcome To Stack Operations!!\u001B[0m");
    System.out.print("\n\u001B[33mEnter the maximum size of the stack:\u001B[0m ");
    int maxSize = scan.nextInt();
    stack = new StackBasic(maxSize);
    scan.nextLine();

    System.out.println();
    System.out.println("\u001B[32mEnter the number of operation that you want.\u001B[0m");

    //Adding the conditions
    int choice = 0;
    while (choice != 4) {
      System.out.println("\u001B[35m1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Peek"); 
      System.out.println("4. Exit\u001B[0m");
      System.out.println("\n\u001B[32mEnter your choice: \u001B[0m");
      choice = scan.nextInt();
      scan.nextLine();
      System.out.println();

      switch (choice) {
        case 1:
            System.out.println("\u001B[32mEnter the element to be pushed: \u001B[0m");
            int element = scan.nextInt();
            stack.push(element);
            break;
        case 2:
            stack.pop();
            break;
        case 3:
            int topElement = stack.peek();
            System.out.println("\u001B[34mTop element: \u001B[0m" + topElement);
            break;
        case 4:
            System.out.println("\u001B[34mExiting program....Thank you!\u001B[0m");
            break;
        default:
            System.out.println("\u001B[34mInvalid choice. Please try again.\u001B[0m");
            break;
        }
    }
}
}