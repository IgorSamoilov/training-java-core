package lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    Passport passport;

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            System.out.println("Ошибка: поля не могут быть пусты. Пожалуйста, заполните поля.");
            return this;
        }
        if (passport.getSeries() != null && passport.getNumber() != null) {
            System.out.printf("Паспорт с серией %S и номером %s , добавлен пользователю %s %s%n", passport.getSeries(), passport.getNumber(), lastName, firstName);
            this.passport = passport;
        } else
            System.out.printf("Ошибка: Не удаллось добавить паспорт с серией %s и номером %s. Проверьте правильность введенных значений %n", passport.getSeries(), passport.getNumber());
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
}
