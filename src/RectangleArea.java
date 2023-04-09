public class RectangleArea {
    public static int calculateArea(int width, int height){
int area = width*height;
return area;
    }

    public static void main(String[] args) {
        int width = 4;
        int height = 5;
        int area = calculateArea(width, height);
        System.out.println("The area of the rectangle is: " + area);
    }
}
