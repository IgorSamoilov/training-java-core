package lesson3.task5;

import java.util.Random;

public class Names {
    static String[] humansNames = {"Лариса", "Сергей", "Григорий", "Игорь", "Инокентий"};
    static String[] dogsNames = {"Бобик", "Мухтар", "Граф", "Шарик", "Псина"};
    static String[] catsNames = {"Пушок", "Барсик", "Мурзик", "Дымок", "Беркли"};

    static String randomHumanNames() {
        return humansNames[new Random().nextInt(humansNames.length)];
    }

    static String randomDogNames() {
        return dogsNames[new Random().nextInt(dogsNames.length)];
    }

    static String randomCatNames() {
        return catsNames[new Random().nextInt(catsNames.length)];
    }
}


