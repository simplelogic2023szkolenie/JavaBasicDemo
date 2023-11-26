package Ch15_List;

import java.util.ArrayList;
import java.util.List;

public class Ex2_CustomTypeList {
    public static void main(String[] args) {

        List<Ex2_PersonWithToString> listOfObjectsThat_HAVE_ToString = new ArrayList<>();

        Ex2_PersonWithToString jan = new Ex2_PersonWithToString("jan", 20);
        Ex2_PersonWithToString adam = new Ex2_PersonWithToString("adam", 30);

        listOfObjectsThat_HAVE_ToString.add(jan);
        listOfObjectsThat_HAVE_ToString.add(adam);

        System.out.println("tutaj lista obiektw gdzie toSting() zostało nadpisane");
        System.out.println(listOfObjectsThat_HAVE_ToString);


        List<Ex2_PersonMissingToString> listOfObjectsThat_DO_NOT_HAVE_toString = new ArrayList<>();

        Ex2_PersonMissingToString kasia = new Ex2_PersonMissingToString("kasia", 20);
        Ex2_PersonMissingToString basia = new Ex2_PersonMissingToString("basia", 30);

        listOfObjectsThat_DO_NOT_HAVE_toString.add(kasia);
        listOfObjectsThat_DO_NOT_HAVE_toString.add(basia);

        System.out.println("tutaj lista obiektw gdzie toSting() NIE zostało nadpisane");
        System.out.println(listOfObjectsThat_DO_NOT_HAVE_toString);

    }
}
