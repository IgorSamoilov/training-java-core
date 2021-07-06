package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {
    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
     List<Double> getMonthPayments() {
        Double monthRate = rate / 100 / 12;
        Double payment = amount * (monthRate + (monthRate / (Math.pow((1 + monthRate), duration) - 1)));
        List<Double> paymentSchedule = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            paymentSchedule.add(payment);
        }
        return paymentSchedule;
    }
}


