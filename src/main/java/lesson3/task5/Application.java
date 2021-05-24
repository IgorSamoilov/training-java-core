package lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }

        for (Human otherHuman : humans) {
            for (Human human : humans) {
                if (otherHuman != human && otherHuman.dogs.length == human.dogs.length && otherHuman.cats.length == human.cats.length) {
                    System.out.printf("%s содержит %d кошки и %d сабаки%n", human.name, human.cats.length, human.dogs.length);
                }
            }
        }
    }
}

