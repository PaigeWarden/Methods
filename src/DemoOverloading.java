public class DemoOverloading {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double c = 7.5;
        double d = 3.4;
// Uses maxMethod to (int n1, int n2)
        int result1 = maxMethod(a,b);
        // uses maxMethod (double n1, double 2)
        double result2 = maxMethod(c,d);

        System.out.println("Maximum value = " + result1);
        System.out.println("Maximum value = " + result2);
    }
    //method with int perameters
    public static int maxMethod( int n1, int n2){
int max;
if(n1 > n2) {
    max = n1;
}
else {
    max = n2;
}
return max;
    }

    //method with double perameters
    public static double maxMethod(double n1, double n2){
        double max;
        if( n1>n2) {
            max = n1;
        }
        else{
            max = n2;
        }
        return max;
    }
}

