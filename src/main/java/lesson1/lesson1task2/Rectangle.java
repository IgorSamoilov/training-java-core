package lesson1.lesson1task2;

public class Rectangle {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.variable(2, 7));
        System.out.println(rectangle.variable(6, 5));
        System.out.println(rectangle.variable(6, 3));

    }

    boolean variable(int width, int height) {
        int squareArea = width * height;
        int perimeterArea = (width + height) * 2;
        return squareArea > perimeterArea;

    }

}
