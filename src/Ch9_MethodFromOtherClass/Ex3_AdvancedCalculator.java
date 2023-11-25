package Ch9_MethodFromOtherClass;

import Ch7_MethodsWithParameters.Ex4_SimpleCalculator;

public class  Ex3_AdvancedCalculator {
    public static void main(String[] args) {
        int a = Ex1_UserInputHelper.getNumberFromUser();
        int b = Ex1_UserInputHelper.getNumberFromUser();
        String selectedOption = Ex1_UserInputHelper.getOptionFromUser();

        switch (selectedOption) {
            case "add":
                System.out.println("Wynik dodawania " + a + "+" + b + "=" + Ex4_SimpleCalculator.add(a,b));
                break;
            case "subtract":
                System.out.println("Wynik odejmowania " + a + "-" + b + "=" + Ex4_SimpleCalculator.subtract(a, b));
                break;
            case "divide":
                System.out.println("Wynik dzielenia " + a + "/" + b + "=" + Ex4_SimpleCalculator.divide(a, b));
                break;
            case "multiply":
                System.out.println("Wynik mnozenia " + a + "*" + b + "=" + Ex4_SimpleCalculator.multiply(a, b));
                break;
            default:
                System.out.println("Niestety wybrales opcje spoza zakresu: " + selectedOption);
        }

    }
}
/*
1. Stwórz klasę o nazwie UserInputHandler:
- stwórz metodę getNumber() która wypisze tekst "podaj liczbe"
     następnie pobierze i zwróci liczbę podaną przez użytkownika
- stwórz metodę getMethematicalOperation() która wypisze tekst "podaj operacje matematyczną"
    następnie pobierze i zwróci tekst podany przez użytkownika

2. Stwórz klasę o nazwie AdvancedCalculator:
- w metodzie main:
  - stwórz zmienne int a oraz int b -> użyj metody getNumber() z klasy UserInputHandler aby uzupełnić je liczbami
  - stwórz zmienną String operation -> użyj metody getMethematicalOperation() z klasy UserInputHandler aby uzupełnić ją tekstem

nastęnie nadal w metodzie main:
- zrób switch(oparation) który obsłuży przypadki:
	case "add":
	        int result = SimpleCalc.add(a,b)
	        sout(result)
	case "subtract"
	case "divide"
	case "multiply"
	default powininen wydrukować 'podałeś niewspieraną operację matemtyczną'

poszczególne case powinny uruchamić odpowiednią metodę z klasy SimpleCalculator z poprzedniego zadania
 */