public class Muiltiply {
    public static void main(String[] args) {
        welcome();
        multiply(4,5);
        multiply(100,900);
        multiply(60,13);
        divide(100,10);
        divide(50,4);
        divide(89,9);
    }

    public static void welcome(){
        System.out.println("Welcome to our calculator ");
    }
    public static void multiply(int a, int b){
        System.out.println(a+b);
    }
    public static void divide(int a, int b){
        System.out.println(a / b);
    }
}
