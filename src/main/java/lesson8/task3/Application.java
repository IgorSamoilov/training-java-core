package lesson8.task3;

import lesson8.task3.Terminals.EleksnetTerminal;
import lesson8.task3.Terminals.QiwiTerminal;
import lesson8.task3.Terminals.TinkoffTerminal;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Terminal> terminals = new ArrayList<>();
        terminals.add(new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"));
        terminals.add(new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"));
        terminals.add(new EleksnetTerminal("г. Москва, ул. Бакунинская, д.13"));
        terminals.add(new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"));
        terminals.add(new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15"));

        for (Terminal terminal : terminals) {
            terminal.pay("+7(977)0000000", 50);
            terminal.pay("+7(977)0000001", 100);
            terminal.pay("+7(977)0000002", 150);
            terminal.pay("+7(977)0000003", 300);
            terminal.pay("+7(977)0000004", 600);

        }
    }
}

