package lesson8.task3;

public abstract class Terminal implements TopUpBalance {
    protected String terminalAddress;
    protected FirmOwner firmOwner;
    protected double commissions;
    protected double noCommissions;

    public Terminal(String terminalAddress) {
        this.terminalAddress = terminalAddress;
    }

    @Override
    public void pay(String phone, double amount) {
        double payment = amount >= noCommissions
                ? amount
                : (1d - commissions / 100) * amount;
        System.out.printf("Внесена сумма %.2f для пополнения телефона %s. Баланс пополнен на сумму %.2f. С уважением, ваш %s, %s%n",
                amount, phone, payment, firmOwner.getName(), terminalAddress);
    }
}
