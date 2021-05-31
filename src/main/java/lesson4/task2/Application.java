package lesson4.task2;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;


public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[2];
        int index = 0;
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Введите строку в формате [%s %s %s]:");
            String input = reader.nextLine();
            boolean inputValid = Validator.validateInputFormat(input);
            if (!inputValid) continue;

            String[] field = Validator.split(input);

            Human human = new Human();
            human.setLastName(field[0]);
            human.setFirstName(field[1]);
            human.setBirthdate(LocalDate.parse(field[2], DateTimeFormatter.ofPattern("dd.MM.yyyy")));

            boolean humanValid = Validator.validHuman(human);
            if (!humanValid) continue;


            humans[index++] = human;

            boolean isArrayFull = Validator.validHumanArray(humans);
            if (isArrayFull) break;
        }
    }
}
