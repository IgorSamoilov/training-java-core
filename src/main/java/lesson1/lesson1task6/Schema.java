package lesson1.lesson1task6;

public class Schema {

    public static void main(String[] args) {
        Schema schema = new Schema();
        System.out.println(schema.argument(false, false, false, false));
        System.out.println(schema.argument(true, true, true, true));
        System.out.println(schema.argument(false, true, false, true));
        System.out.println(schema.argument(true, false, true, false));
        System.out.println(schema.argument(true, true, false, false));

    }
    boolean argument(boolean a, boolean b, boolean c, boolean d) {
        return (a & b) & !(c | d);
    }


}
