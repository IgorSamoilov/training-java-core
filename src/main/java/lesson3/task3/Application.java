package lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human valeriy = new Human("Валерий", 75, null, null);
        Human aleksandra = new Human("Александра", 70, null, null);
        Human ivan = new Human("Иван", 80, null, null);
        Human sergey = new Human("Сергей", 36, valeriy, aleksandra);
        Human marina = new Human("Марина", 30, ivan, null);
        Human vitaliy = new Human("Виталий", 10, sergey, marina);
        Human elena = new Human("Елена", 9, sergey, marina);
        Human[] grand = new Human[4];
        int index = 0;
        for (int i = 0; i < elena.parents.length; i++) {
            Human[] olds = elena.parents[i].parents;
            for (Human old : olds) {
                grand[index++] = old;
            }
        }
        for (Human olds : grand) {
            if (olds != null)
            System.out.println(olds.name + " " + olds.age + " лет");
        }
    }
}

