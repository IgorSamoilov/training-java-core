package lesson7.task4;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        BaseCredit interestFree = new BaseCredit(300_000d, 16.9d, 12);
        BaseCredit differentiate = new DifferentiateCredit(300_000d, 16.9d, 12);
        BaseCredit annuity = new AnnuityCredit(300_000d, 16.9d, 12);

        List<Double> interestFreePayment = interestFree.getMonthPayments();
        List<Double> differentiatePayment = differentiate.getMonthPayments();
        List<Double> annuityPayment = annuity.getMonthPayments();

        for (int i = 0; i < annuityPayment.size(); i++) {
            System.out.printf("%d: %.2f %.2f %.2f %n", i + 1, interestFreePayment.get(i), differentiatePayment.get(i), annuityPayment.get(i));
        }
        System.out.printf("Переплата по каждому кредиту составила: %n %.2f %.2f %.2f", interestFree.calculateOverpayment(), differentiate.calculateOverpayment(), annuity.calculateOverpayment());
    }
}

