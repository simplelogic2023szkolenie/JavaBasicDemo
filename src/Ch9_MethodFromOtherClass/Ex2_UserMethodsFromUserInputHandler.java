package Ch9_MethodFromOtherClass;

public class Ex2_UserMethodsFromUserInputHandler {
    public static void main(String[] args) {
        int number = Ex1_UserInputHelper.getNumberFromUser();
        String text = Ex1_UserInputHelper.getTextFromUser();

        System.out.println(number);
        System.out.println(text);
    }
}
