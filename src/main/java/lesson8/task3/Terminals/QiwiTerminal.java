package lesson8.task3.Terminals;


import lesson8.task3.FirmOwner;
import lesson8.task3.Terminal;

public class QiwiTerminal extends Terminal {

    public QiwiTerminal(String terminalAddress) {
        super(terminalAddress);
        firmOwner = FirmOwner.QIWI;
        commissions = 7;
        noCommissions = 1000;
    }
}
