package lesson4.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Human {
    private String lastName;
    private String firstName;
    private LocalDate birthDate;

    private final String LAST_NAME = "Фамилии";
    private final String FIRST_NAME = "Имени";
    private final String BIRTH_DATE = "Даты рождения";

    // пустой конструктор
    public Human() {
    }

    // сеттеры
    public Human setLastName(String lastName) {
        if (lastName.matches("^[А-Я][а-я]{2,}$")) {
            this.lastName = lastName;
            setCorrectPrint(LAST_NAME, lastName);
        } else
            setIncorrectPrint(lastName);
        return this;
    }

    public Human setFirstName(String firstName) {
        if (firstName.matches("^[А-Я][а-я]{2,}$")) {
            this.firstName = firstName;
            setCorrectPrint(FIRST_NAME, firstName);
        } else
            setIncorrectPrint(firstName);
        return this;
    }

    public Human setBirthdate(LocalDate birthDate) {
        LocalDate date = LocalDate.now();
        if (birthDate.isBefore(date)) {
            this.birthDate = birthDate;
            setCorrectPrint(BIRTH_DATE, birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        } else
            setIncorrectPrint(birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        return this;
    }

    // геттеры
    public String getLastName() {
        getPrint(LAST_NAME, lastName);
        return lastName;
    }

    public String getFirstName() {
        getPrint(FIRST_NAME, firstName);
        return firstName;
    }

    public LocalDate getBirthDate() {
        String date = birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        getPrint(BIRTH_DATE, date);
        return birthDate;
    }

    private void getPrint(String type, String value) {
        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно: %s%n", value);
    }

}

