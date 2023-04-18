import java.util.Scanner;
public class MinMaxMethods {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your first unique number");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter your second unique number");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter your third unique number");
        int num3 = Integer.parseInt(reader.nextLine());
        int max = maxMethod(num1, num2, num3);
        int min = minMethod(num1, num2, num3);
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }

    public static int maxMethod(int num1, int num2, int num3) {
        if (num1 > num2 && num2 > num3) {
            return num1;
        } else if (num2 > num1 && num1 > num3) {
            return num2;
        }
        else {
            return num3;
        }

    }
    public static int minMethod(int num1, int num2, int num3){
        if(num1 < num2 && num2 < num3){
            return num1;
        } else if (num2 < num1 && num1 < num3) {
            return num2;
        }
        else {
            return num3;
        }
    }
}





//Write a method to return the minimum of the three numbers
//
//Write a method to return the maximum of the three numbers
//
//
//
//2. Create new versions of these methods (overloading) to accept floating point numbers (doubles) and alter your program to choose the correct method to call dependant on the user input (which will now be accepted as doubles).
//
//
//
//HINT: Using % 1 you can test whether the user input has a floating point value.  If it does, use doubles to call the double variants of the methods…