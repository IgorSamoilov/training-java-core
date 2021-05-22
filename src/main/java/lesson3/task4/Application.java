package lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mihail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human aleksandr = new Human("Александр");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");


        sergey.addFriends(valeriy);
        sergey.addFriends(grigoriy);
        stanislav.addFriends(valeriy);
        stanislav.addFriends(mihail);
        aleksandr.addFriends(grigoriy);
        aleksandr.addFriends(mihail);
        egor.addFriends(aleksandr);
        egor.addFriends(grigoriy);


        System.out.println(friends(sergey, grigoriy));
        System.out.println(friends(sergey, aleksandr));
        System.out.println(friends(stanislav, mihail));
        System.out.println(friends(mihail, valeriy));
    }

    static boolean friends(Human first, Human second) {
        for (Human firstFriend : first.friends)
            if (firstFriend == second) return true;
        return false;
    }
}



