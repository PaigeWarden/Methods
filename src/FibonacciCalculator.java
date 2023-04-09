public class FibonacciCalculator {

    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int n = 50; // number of Fibonacci numbers to generate
        int fib1 = 0; // first number in the calculator
        int fib2 = 1; // second number in the calculator
        int fib = fib1 + fib2; // calculate the next Fibonacci number
        System.out.println(fib1); // prints out the first number
        System.out.println(fib2); // prints out the second number
        for (int i = 2; i < n; i++) {
            fib = fib1 + fib2;
            System.out.println(fib); // print out the next number in the sequence
            fib1 = fib2; // updates the first number to be the second number
            fib2 = fib; // updates the second number to be the next number
        }
    }
}


//Create a new project called FibonacciCalc.
//
//Write a method ‘Fibonacci’ (that is called from your Main method) that prints out the first 100 numbers of the Fibonacci sequence.
//
//The Fibonacci sequence is a series of numbers where a number is found by adding up the 	two numbers before it.
//
//Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth.
//
//Written as a rule, the expression is xn = xn-1 + xn-2