package Oct.ex_18102024;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operation:");
        System.out.println("Enter <km> for Kilometer to meter");
        System.out.println("Enter <m> for meter to Kilometer");
        System.out.println("Enter <f> for Temperature fahrenheit to celsius");
        System.out.println("Enter <c> for Temperature celsius to fahrenheit");
        String op= sc.next();
        System.out.println("Enter a value to convert");
        double value= sc.nextFloat();
        double km=0;
        double met=0;
        double tem=0;
        double temp_f=0;
        double temp_c=0;

        switch (op){
            case "km":
                    met=value*1000;
                    System.out.printf("The Km to Meter value is"+met);
                    break;
            case"m":
                    km=value/1000;
                    System.out.printf("The Km to Meter value is"+km);
                    break;
            case "f":
                    temp_c =(value - 32) * 5/9;
                    System.out.printf("The Temperature fahrenheit to celsius value is"+temp_c);
                    break;
            case "c":
                    temp_f =(value * (9/5)) + 32;
                    System.out.printf("The Temperature celsius to fahrenheit value is"+temp_f);
                    break;
            default:
                    System.out.println("Input is invalid");
                    break;
            }
        sc.close();
    }
}
