package lesson8.task4;

import lesson8.task4.Entities.*;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        List<Entity> entities = new ArrayList<>();

        entities.add(new Client("ООО \"Газпром\"", "Москва, Южнобутовская 117"));
        entities.add(new Client("ООО \"Газпром\"", "Москва, Южнобутовская 117"));
        entities.add(new Client("ООО \"Инвест\"", "Москва, Чечерский проезд 120"));
        entities.add(new Client("ООО \"МТС\"", "Москва, Чечерский проезд 120"));

        entities.add(new User("Иван Иванович", "Дворник"));
        entities.add(new User("Иван Иванович", "Дворник"));
        entities.add(new User("Иван Семенович", "Директор"));
        entities.add(new User("Семен Петрович", "Директор"));

        entities.add( new Branch("Филиал", "г. Москва"));
        entities.add( new Branch("Филиал", "г. Москва"));
        entities.add( new Branch("Дополнительный офис", "г. Краснодар"));
        entities.add( new Branch("Операционный офис", "г. Краснодар"));

        entities.add(new Account("\"Расчетный счет\"","40702810111111111111"));
        entities.add(new Account("\"Расчетный счет\"","40702810111111111111"));
        entities.add(new Account("\"Валютный счет\"","40702840222222222222"));
        entities.add(new Account("\"Депозитный счет\"","40702840222222222222"));


        for (Entity entity : entities){
            entity.validate();
        }
    }


}