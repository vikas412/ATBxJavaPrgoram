package Oct.ex_16102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab025 {
    public static void main (String[]args){
        // Define scanner as sc
        Scanner sc= new Scanner(System.in);
        // Ask user to put value of user like Name, age and salary
        System.out.println("Enter your name:"); // Asking user to enter name
        String name = sc.nextLine() ;           // store the  name value in name variable
        System.out.println("Enter your age:");   // Asking user to enter age
        String age = sc.nextLine();             // store the age value in age variable
        System.out.println("Enter your Salary:"); // Asking the user to enter salary
        String salary = sc.nextLine(); // store the salary value in salary variable

        System.out.printf("Your Name is %s", name);
        System.out.println(); // adding a blank new line
        System.out.printf("Your age is %s",age);
        System.out.println();       // adding a blank new line
        System.out.printf("Your salary is %s",salary);
    }
}
