package Oct.ex_16102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab026 {
    public static void main(String[]args){
        // Take data from user
        Scanner var= new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a= var.nextInt();
        System.out.print("Enter value of b:");
        int b= var.nextInt();
        // Print the user's entered value
        System.out.println("value of a is:"+ a );
        System.out.println("value of b is:" +b);
        // Compare the two numbers using ternary operator
        int max=(a>b)?a:b;
        System.out.println("Max number is :"+ max);
    }
}
