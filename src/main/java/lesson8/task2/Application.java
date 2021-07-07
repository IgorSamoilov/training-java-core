package lesson8.task2;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        for (int personGroup = 10; personGroup <= 30; personGroup++) {
            int duplicate = 0;
            for (int i = 0; i < 100_000; i++) {
                Set<Person> persons = new HashSet<>();
                for (int j = 0; j < personGroup; j++) {
                    persons.add(new Person());
                }
                if (persons.size() != personGroup) {
                    duplicate++;
                }

            }
            double duplicates = (100.0f * duplicate) / 100_000;
            System.out.printf("%d: %.2f %%%n", personGroup, duplicates);


        }

    }
}
