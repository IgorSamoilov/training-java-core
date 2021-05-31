package lesson4.task3.Workers;

import java.sql.SQLOutput;

public class ServiceDesk {
    private static int ticketNumber = 0;

    public static void createTicket(String description) {
        ticketNumber++;
        System.out.printf("Заявка %d была создана: %s%n", ticketNumber, description);
        if (description.matches("^.*((справк)|(отчет)|(бюджет)).*$")) {
            Accountant.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*((доставк)[а-я]|(курьер)).*$")) {
            Logistician.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*((компьютер)|(принтер)|(сервер)).*$")) {
            SysAdmin.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*(уборк).*$")) {
            Cleaner.takeTicket(ticketNumber);
            return;
        } else {
            System.out.println("Специалист по выполнению данной заявки не найден");
        }
    }
}