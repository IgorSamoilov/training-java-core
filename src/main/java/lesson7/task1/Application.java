package lesson7.task1;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> parameters = new MyArrayList<>();
        parameters.add(1);
        parameters.add(2);
        parameters.add(0, 3);
        parameters.add(-1, 4);
        parameters.contains(3);
        parameters.contains(5);
        parameters.size();
        parameters.get(-6);
        parameters.get(1);
    }
}

