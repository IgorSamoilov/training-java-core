package lesson1.lesson1task1;

public class Circle {


    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getcircle(0));
        System.out.println(circle.getcircle(2));
        System.out.println(circle.getcircle(100));
    }

    double getcircle(int radius) {
        double pi = 3.14d;
        return pi * radius * radius;
    }

}
