package lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    Cat() {
        name = Names.randomCatNames();
        age = new Random().nextInt();
    }

}
