package Ch27_HashMap;

import java.util.HashMap;

public class Ex1_HashMapIntDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> users = new HashMap<>();

        users.put(15, "admin");
        users.put(2, "guest");
        users.put(33, "super_admin");

        System.out.println(users);

        users.put(80,"admin");
        System.out.println(users);

        users.put(15,"customer");
        System.out.println(users);

        System.out.println(users.get(33));
    }
}
