package lesson4.task4;

public class Passport {
    private String series;
    private String number;

    public Passport() {
        ValidUniquePassport.addPassport(this);
    }

    public Passport setSeries(String series) {
        if (ValidUniquePassport.passportContains(series, number)) {
            return this;
        }
        if (series.matches("^(\\d{4})$")) {
            System.out.printf("Значение серрии паспорта %s заполнено успешно%n", series);
            this.series = series;
        } else System.out.printf("Ошибка: не удалось распознать серию паспорта %s%n", series);
        return this;
    }

    public Passport setNumber(String number) {
        if (ValidUniquePassport.passportContains(series, number)) {
            return this;
        }
        if (number.matches("^(\\d{6})$")) {
            System.out.printf("Значение номера паспорта %s заполнено успешно%n", number);
            this.number = number;
        } else System.out.printf("Ошибка: не удалось распознать номер паспорта %s%n", number);
        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}
