package lesson4.task1;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        Human human = new Human();
        human.setLastName("Самойлов");
        human.setLastName("Samoilov");
        human.setLastName("сам");
        human.setLastName("Самойлов1994");
        human.setLastName(" ");
        human.setLastName("Са");

        human.setFirstName("Игорь");
        human.setFirstName("Игорь94");
        human.setFirstName("Igor");
        human.setFirstName("Иг");
        human.setFirstName("игорь");
        human.setFirstName(" ");

        human.setBirthdate(LocalDate.of(1994, 5, 2));
        human.setBirthdate(LocalDate.of(2022, 7, 15));
    }
}
