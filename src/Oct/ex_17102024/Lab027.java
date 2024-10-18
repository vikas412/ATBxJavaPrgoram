package Oct.ex_17102024;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.awt.*;
import java.util.Scanner;

public class Lab027 {
    public static void main (String[]args){
    //Grade Calculator: Write a program that calculates and displays the letter grade
        Scanner sc= new Scanner(System.in);
        //Ask user to enter the marks:
        System.out.println("Enter your marks");
        int marks= sc.nextInt();
        // Verify the marks are from which grade and score them in (e.g., A, B, C, D, or F)
        if (marks>90) {
            System.out.println("Congratulations!!! Your grade is A"); //A: 90-100
        }
        else if (marks>=80 && marks<=89) {
            System.out.println("Congratulations!!! Your grade is B"); //B: 80-89
        }
        else if (marks>=70 && marks<=79) {
            System.out.println("Congratulations!!! Your grade is C"); //C: 70-79
        }
        else if (marks>=60 && marks<=69) {
            System.out.println("Congratulations!!! Your grade is E"); //D: 60-69
        }
        else{
            System.out.println("Sorry you are Failed, Your grade is F"); //D: 0-59
        }
        sc.close();
    }
}
