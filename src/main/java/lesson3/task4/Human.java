package lesson3.task4;

public class Human {
    String name;
    Human[] friends = new Human[4];

    Human(String name) {
        this.name = name;
    }

    public void addFriends(Human friend) {
        int i = 0;
        while (friends[i] != null) {
            if (friends[i] == friend) return;
            i++;
        }
        friends[i] = friend;
        friend.addFriends(this);
    }
}

