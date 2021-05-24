package lesson3.task5;

import java.util.Random;

public class Dog {

    String name;
    int age;

    Dog() {
        name = Names.randomCatNames();
        age = new Random().nextInt();
    }

}
