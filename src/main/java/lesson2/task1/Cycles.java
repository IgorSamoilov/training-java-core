package lesson2.task1;

public class Cycles {
    public static void main(String[] args) {
        String[] text = {"Пятница", "это", "лучший", "день", "недели"};
        new Cycles().printByFor(text);
        new Cycles().printByForeach(text);
        new Cycles().printByWhile(text);


    }

    public static void printByFor(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.println(array[index] + ".");
            } else
                System.out.print(array[index] + " ");
        }

    }

    public static void printByForeach(String[] array) {
        int index = 0;
        for (String text : array) {
            if (index == array.length - 1) {
                System.out.println(text + ".");
            } else
                System.out.print(text + " ");
            index++;

        }

    }

    public static void printByWhile(String[] array) {
        int index = 0;
        while (index < array.length) {
            if (index == array.length - 1) {
                System.out.println(array[index] + ".");
            } else
                System.out.print(array[index] + " ");
            index++;
        }


    }
}


