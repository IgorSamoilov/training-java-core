package lesson2.task7;

public class Age {
    public static void main(String[] args) {
        Age instance = new Age();
        System.out.println(instance.getAge(32));
        System.out.println(instance.getAge(52));
        System.out.println(instance.getAge(66));
        System.out.println(instance.getAge(82));
        System.out.println(instance.getAge(25));
        System.out.println(instance.getAge(44));
        System.out.println(instance.getAge(60));
        System.out.println(instance.getAge(75));
        System.out.println(instance.getAge(22));
        System.out.println(instance.getAge(119));

    }

    public String getAge(int age) {
        String ageToString;
        if (age >= 25 && age < 44) {
            return ageToString = "Молодой возраст";
        } else if (age >= 44 && age < 60) {
            return ageToString = "Средний возраст";
        } else if (age >= 60 && age < 75) {
            return ageToString = "Пожилой возраст";
        } else if (age >= 75 && age < 90) {
            return ageToString = "Старческий возраст";
        } else
            return ageToString = "Неизвестный возраст";


    }
}
