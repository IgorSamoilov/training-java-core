package lesson8.task3.Terminals;

import lesson8.task3.FirmOwner;
import lesson8.task3.Terminal;

public class EleksnetTerminal extends Terminal {

    public EleksnetTerminal(String terminalAddress) {
        super(terminalAddress);
        firmOwner = FirmOwner.ELEKSNET;
        commissions = 11;
        noCommissions = 300;
    }


}
