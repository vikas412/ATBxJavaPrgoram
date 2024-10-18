package Oct.ex_18102024;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        // Define the SCANNER to get the values from the user
        Scanner sc= new Scanner(System.in);
        //Ask user to enter value of num1
        System.out.println("Enter value of num1:");
        double num1=sc.nextDouble();
        //Ask user to enter value of num2
        System.out.println("Enter value of num2:");
        double num2=sc.nextDouble();
        //Ask user to enter Required operation
        System.out.println("Enter operation:");
        char op= sc.next().charAt(0);  //to enter the character value
        switch (op){
            case '+':
                System.out.print("Addition is:");
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.print("Subtraction is:");
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.print("Multiplication is:");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.print("Division is:");
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.print("Modulo is:");
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Entered value is invalid");
                break;
        }
        sc.close();
    }
}
