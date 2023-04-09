public class ReturnStatements {

    public static void main(String[] args) {
String shouting = caps("what's going on in here?!");
        System.out.println(shouting);

        int[] myArray = arrayFromInt(110,44,11);
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    public static String caps(String a){
        return a.toUpperCase();
    }

    public static int[] arrayFromInt(int a, int b, int c){
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
    return array;
    }
}
