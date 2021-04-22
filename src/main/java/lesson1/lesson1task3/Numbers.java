package lesson1.lesson1task3;

public class Numbers {


    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.getnumbers(14));
        System.out.println(numbers.getnumbers(19));
    }

    boolean getnumbers(int N) {
        return N % 2 == 1;
    }
}
