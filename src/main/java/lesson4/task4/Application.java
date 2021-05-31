package lesson4.task4;

public class Application {
    public static void main(String[] args) {
        Passport correctPassport = new Passport().setSeries("1234").setNumber("123456");
        Passport doublePassport = new Passport().setSeries("1234").setNumber("123456");
        Passport inCorrectPassport1 = new Passport().setSeries("12").setNumber("1234");
        Passport inCorrectPassport2 = new Passport().setSeries("12344").setNumber("123456555");
        Passport inCorrectPassport3 = new Passport().setSeries("123").setNumber("123456");
        Passport inCorrectPassport4 = new Passport().setSeries("1234").setNumber("12345644");
        Passport inCorrectPassport5 = new Passport().setSeries(" ").setNumber(" ");

        Passport onlyOneSeriesPassport = new Passport().setSeries("1234");
        Passport onlyOneNumberPassport = new Passport().setNumber("123456");
        Passport doubleOnlyOneSeriesPassport = new Passport().setSeries("1234");
        Passport doubleOnlyOneNumberPassport = new Passport().setNumber("123456");

        Human human = new Human().setFirstName("Петров").setLastName("Степан").setAge(34).setPassport(correctPassport);

        Passport passportNull = new Passport();
        System.out.printf("Паспорт5: %s, %s%n", passportNull.getSeries(), passportNull.getNumber());

    }
}
