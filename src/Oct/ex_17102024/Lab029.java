package Oct.ex_17102024;

import java.util.Scanner;

public class Lab029 {
    public static void main(String[]args){
        Scanner side_value= new Scanner(System.in);
        System.out.println("Enter side 1 value of a triangle");
        double a= side_value.nextDouble();
        System.out.println("Enter side 2 value of a triangle");
        double b= side_value.nextDouble();
        System.out.println("Enter side 3 value of a triangle");
        double c= side_value.nextDouble();
        //determine if the triangle is equilateral (all sides are equal),
        // if the triangle is equilateral (all sides are equal)
        if (a==b && b==c){
            System.out.println("The Triangle is equilateral (all sides are equal)");
        }
        //isosceles (exactly two sides are equal)
        else if ((a==b && b!=c)||(a==c && b!=c)|| (a!=b && b==c)){
            System.out.println("The Triangle is isosceles (exactly two sides are equal)");
        }
        // or scalene (no sides are equal).
        else {
            System.out.println("The Triangle is scalene (no sides are equal)");
        }
        side_value.close();
    }
}
