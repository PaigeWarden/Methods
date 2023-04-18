import java.util.Scanner;
public class MyCalculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("provide the first number");
        double int1 = reader.nextInt();
        System.out.println("provide the second number");
        double int2 = reader.nextInt();
addNumber(int1, int2);
subtractNumber(int1,int2);
multNumber(int1,int2);
divNumber(int1,int2);
    }
public static void addNumber(double int1, double int2){
        double add = int1 + int2;
    System.out.println("When added: " + add);
}
public static void subtractNumber(double int1, double int2){
        double subtract = int1 - int2;
    System.out.println("When subtracted: " + subtract);
}

public static void multNumber(double int1, double int2){
        double multiply = int1 * int2;
    System.out.println("When multiplied: " + multiply);
}

public static void divNumber(double int1, double int2){
        double divide = int1 / int2;
    System.out.println("When divided: " + divide);
}
}


/* Create a new project called MyCalculator.  Read in two numbers from the user (num1 and num2) then create and call all four of the following methods (and print the results accordingly):

Write a method to add the two numbers.

Write a method to subtract the two numbers.

Write a method to multiply the two numbers.

Write a method to divide the two numbers. */