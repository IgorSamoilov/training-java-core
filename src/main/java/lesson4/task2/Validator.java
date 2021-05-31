package lesson4.task2;

public class Validator {

    public static boolean validateInputFormat(String input) {
        boolean inputValid = input.matches("^(\\S+) (\\S+) (\\S+)$");
        String output = inputValid
                ? "Строка соответствует формату"
                : "Строка не соответствует формату";
        System.out.println(output);
        return inputValid;
    }

    public static String[] split(String regex) {
        System.out.println("Строка разделена на части");
        return regex.split(" ");
    }

    public static boolean validHuman(Human human) {
        boolean humanValid = human.getLastName() != null && human.getFirstName() != null && human.getBirthDate() != null;
        String output = humanValid
                ? "Все поля инициализированы"
                : "Не все поля инициализированы";
        System.out.println(output);
        return humanValid;
    }

    public static boolean validHumanArray(Human[] array) {
        boolean arrayFull = true;
        for (Human human : array) {
            if (human == null) {
                arrayFull = false;
                break;
            }
        }
        String output = arrayFull
                ? "Массив полностью заполнен"
                : "В масиве есть место для заполнения";
        System.out.println(output);
        return arrayFull;
    }

}
