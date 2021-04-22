package lesson1.lesson1task4;

public class Meter {


    public static void main(String[] args) {
        Meter meter = new Meter();
        System.out.println(meter.getmeter(115));
        System.out.println(meter.getmeter(800));
        System.out.println(meter.getmeter(278));
    }

    int getmeter(int N) {
        return N / 100;
    }
}
