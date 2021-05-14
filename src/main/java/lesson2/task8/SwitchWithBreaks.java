package lesson2.task8;

public class SwitchWithBreaks {
    public static void main(String[] args) {
        SwitchWithBreaks example = new SwitchWithBreaks();
        example.symbol(-1);
        example.symbol(2);
        example.symbol(4);
        example.symbol(7);
        example.symbol(0);
    }

    public void symbol(int a) {
        switch (a) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
                break;

        }
    }
}
