package lesson3.task2;

import java.util.Arrays;


public class Application {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];

        cat[0] = new Cat(2, 5, "Барсик");
        cat[1] = new Cat(3, 11, "Мурзик");
        cat[2] = new Cat(7, 2, "Матильда");
        cat[3] = new Cat(1, 3, "Леопольд");
        cat[4] = new Cat(11, 4, "Базилио");


        String[] nameCats = {cat[0].name, cat[1].name, cat[2].name, cat[3].name, cat[4].name};
        Arrays.sort(nameCats);
        for (int i = 0; i < cat.length; i++) {
            for (int j = 0; j < nameCats.length; j++) {
                if (cat[j].name.equals(nameCats[i])) {


                    System.out.println("Имя:" + cat[j].name + "," + " " + "Возраст:" + cat[j].age + "," + " " + "Вес:" + cat[j].weight);
                }
            }
        }
    }
}