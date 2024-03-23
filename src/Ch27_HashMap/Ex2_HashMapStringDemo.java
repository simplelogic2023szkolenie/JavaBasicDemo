package Ch27_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex2_HashMapStringDemo {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();

        users.put("asd", "admin");
        users.put("qwe", "guest");

        System.out.println(users);
        System.out.println(users.get("asd"));

        System.out.println("petle przechodzaca przez nasz cały hashset");

        for (Map.Entry<String, String> user: users.entrySet()){
            System.out.println(user.getKey());
            System.out.println(user.getValue());
        }
    }
}
