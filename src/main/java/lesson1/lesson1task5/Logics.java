package lesson1.lesson1task5;

public class Logics {


    public static void main(String[] args) {
        Logics logic = new Logics();
        System.out.println(logic.metodOre(false, false) + " " + logic.metodAnd(false, false));
        System.out.println(logic.metodOre(false, true) + " " + logic.metodAnd(false, true));
        System.out.println(logic.metodOre(true, false) + " " + logic.metodAnd(true, false));
        System.out.println(logic.metodOre(true, true) + " " + logic.metodAnd(true, true));
    }

    boolean metodOre(boolean a, boolean b) {
        return !(a | b);

    }

    boolean metodAnd(boolean a, boolean b) {
        return !a & !b;
    }


}
