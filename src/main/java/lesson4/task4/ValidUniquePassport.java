package lesson4.task4;

public class ValidUniquePassport {
    static Passport[] passports = new Passport[100];
    static int i = 0;

    public static boolean passportContains(String series, String number) {
        for (Passport passport : passports) {
            if (passport == null)
                break;
            String currentSeries = passport.getSeries();
            String currentNumber = passport.getNumber();
            if (currentSeries == null || currentNumber == null)
                continue;
            if (currentSeries.equals(series) && currentNumber.equals(number)) {
                System.out.printf("Ошибка: Паспорт с серией %s и номером %s уже существует. Пожалуйста, проверьте введенные данные%n", series, number);
                return true;
            }
        }
        return false;
    }

    public static void addPassport(Passport passport) {
        passports[i++] = passport;
    }
}
