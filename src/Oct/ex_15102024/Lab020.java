package Oct.ex_15102024;
public class Lab020 {
    public static void main(String[]args){
      int a=3;
      int b=2;
      int c=5;
      // If Variable "a" is greater than "b" & "c", then Max is "a" // If true then "a"
      // If Variable "b" is greater than "c" then Max is "b" else Max is "c"
      int max= (a>=b && a>=c)?a:(b>=c? b:c);
      System.out.println("Largest number of three numbers using ternary operators is :" + max);
    }
}
