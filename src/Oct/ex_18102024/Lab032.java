package Oct.ex_18102024;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {
        // A Program to get the Month name from the number of
        // the month as per Calendar month seq.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of the Month");
        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("The 1st Month is January");
                break;
            case 2:
                System.out.println("The 2nd Month is February");
                break;
            case 3:
                System.out.println("The 3rd Month is March");
                break;
            case 4:
                System.out.println("The 4th Month is April");
                break;
            case 5:
                System.out.println("The 5th Month is May");
                break;
            case 6:
                System.out.println("The 6th Month is June");
                break;
            case 7:
                System.out.println("The 7th Month is July");
                break;
            case 8:
                System.out.println("The 8th Month is August");
                break;
            case 9:
                System.out.println("The 9th Month is September");
                break;
            case 10:
                System.out.println("The 10th Month is October");
                break;
            case 11:
                System.out.println("The 11th Month is November");
                break;
            case 12:
                System.out.println("The 12th Month is December");
                break;
            default:
                System.out.println("Your Month  number is invalid");
                break;
        }
        sc.close();
    }
}
