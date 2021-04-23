package lesson1.lesson1task1;

public class Circle {


    public static void main(String[] args) {
        double pi = 3.14d;
        int radius1 = 0;
        int radius2 = 2;
        int radius3 = 100;
        double r1 = pi * radius1 * radius1;
        double r2 = pi * radius2 * radius2;
        double r3 = pi * radius3 * radius3;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
// Или так         Circle circle = new Circle();
//        System.out.println(circle.getcircle(0));
//        System.out.println(circle.getcircle(2));
//        System.out.println(circle.getcircle(100));
//    }
//
//    double getcircle(int radius) {
//        double pi = 3.14d;
//        return pi * radius * radius;
//    }
//
//}