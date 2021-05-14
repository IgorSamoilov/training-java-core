package lesson2.task3;

public class PhoneNumber {
    public static void main(String[] args) {

        PhoneNumber phone = new PhoneNumber();

        System.out.println(phone.matches("+7(910)423-73-12"));
        System.out.println(phone.matches("7(910)423-73-12"));
        System.out.println(phone.matches("89215310934"));
        System.out.println(phone.matches("+5(911)310-12-74"));
        System.out.println(phone.matches("+7(9fg)125-42-99"));
        System.out.println(phone.matches("+7(122)2342343"));
        System.out.println();
        System.out.println(phone.cycles("+7(910)423-73-12"));
        System.out.println(phone.cycles("7(910)423-73-12"));
        System.out.println(phone.cycles("89215310934"));
        System.out.println(phone.cycles("+5(911)310-12-74"));
        System.out.println(phone.cycles("+7(9fg)125-42-99"));
        System.out.println(phone.cycles("+7(122)2342343"));


    }

    boolean matches(String phone) {
        return phone.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    boolean cycles(String phone) {

        if (phone.length() != 16) return false;
        if (!phone.startsWith("+7(")) return false;
        if (phone.charAt(6) != ')') return false;
        if (phone.charAt(10) != '-' || phone.charAt(13) != '-') return false;
        int[] indexNumber = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        String number = "0123456789";

        for (int index : indexNumber) {
            String symbol = String.valueOf(phone.charAt(index));
            if (!number.contains(symbol)) {
                return false;
            }
        }
        return true;
    }
}
