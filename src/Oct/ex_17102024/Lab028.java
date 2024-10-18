package Oct.ex_17102024;

import java.util.Scanner;

public class Lab028 {
    public static void main (String[]args){
        //Grade Calculator: Write a program that calculates and displays the letter grade
       char a='A';
       char b='B';
       char c='C';
       char d='D';
       char e='E';
       char f='F';
        Scanner sc= new Scanner(System.in);
        //Ask user to enter the marks:
        System.out.println("Enter your marks");
        int marks= sc.nextInt();
        // Verify the marks are from which grade and score them in (e.g., A, B, C, D, or F)
        if (marks>=90 && marks<=100) {
            System.out.println("Congratulations!!! You are Pass"+"Your grade is "+ a);//A: 90-100
        }
        else if (marks>=80 && marks<=89) {
            System.out.println("Congratulations!!! You are Pass, Your grade is "+ b); //B: 80-89
        }
        else if (marks>=70 && marks<=79) {
            System.out.println("Congratulations!!! You are Pass, Your grade is "+ c); //C: 70-79
        }
        else if (marks>=60 && marks<=69) {
            System.out.println("Congratulations!!! You are Pass, Your grade is "+ d); //D: 60-69
        }
        else if (marks>=35 && marks<=59) {
            System.out.println("Congratulations!!! You are Pass, Your grade is "+ e);//35-59
        }
        else if(marks>=0 && marks<=34){
            System. out.println("Sorry you are Failed,Your grade is "+ f); //D: 0-34
        }
        else{
            System.out.println("Please enter a the proper value");
        }
        sc.close();
    }
}
