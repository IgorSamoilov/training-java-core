package lesson8.task3.Terminals;

import lesson8.task3.FirmOwner;
import lesson8.task3.Terminal;

public class TinkoffTerminal extends Terminal {

    private final double minAmount;

    public TinkoffTerminal(String terminalAddress) {
        super(terminalAddress);
        firmOwner = FirmOwner.TINKOFF;
        commissions = 9;
        noCommissions = 600;
        minAmount = 100;
    }

    @Override
    public void pay(String phone, double amount) {
        if (amount >= minAmount) {
            super.pay(phone, amount);
        } else {
            System.out.printf("Уважаемый клиент, минимальная сумма для пополнения %.2f%n", minAmount);
        }
    }
}
