package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
     List<Double> getMonthPayments() {
        List<Double> graph = new ArrayList<>();
        double currentAmount = amount;
        for (int i = 0; i < duration; i++) {
            Double percentPayment = currentAmount * rate / 100 / 12;
            Double currentPayment = amount / duration + percentPayment;
            currentAmount -= (currentPayment - percentPayment);
            graph.add(currentPayment);
        }
        return graph;
    }
}
