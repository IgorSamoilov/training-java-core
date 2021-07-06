package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    protected double amount; // сумма
    protected double rate; // процентная ставка в год
    protected int duration; // длительность в месяцах

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    // создание графика платежей
     List<Double> getMonthPayments() {
        List<Double> paymentSchedule = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            paymentSchedule.add(amount / duration);
        }
        return paymentSchedule;

    }

    // создание расчета переплаты по кредиту
     Double calculateOverpayment() {
        Double amount = 0d;
        for (Double currentPayment : getMonthPayments()) {
            amount = amount + currentPayment;

        }
        return amount - this.amount;
    }
}
