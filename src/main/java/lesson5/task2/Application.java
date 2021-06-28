package lesson5.task2;

public class Application {
    public static void main(String[] args) {

        Cat cat0 = new Cat("Барсик", 3);
        Cat cat1 = new Cat("Мурзик", 5);

        Cat cat3 = new Cat("Дымок", 2);
        Cat cat4 = new Cat("Храпун", 6);

        Cat[] cat = {cat0, cat1, null, cat3, cat4};
        for (Cat cats : cat) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cats.getName(), cats.getAge());
            } catch (NullPointerException exception) {
                System.out.printf("Возникла ошибка: присутствует ссылка на null");
                break;
            }
        }

    }
}