package Ch9_MethodFromOtherClass;

public class Ex3_AdvancedCalculator {
    public static void main(String[] args) {

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
	case "add"
	case "subtract"
	case "divide"
	case "multiply"
	default powininen wydrukować 'podałeś niewspieraną operację matemtyczną'

poszczególne case powinny uruchamić odpowiednią metodę z klasy SimpleCalculator z poprzedniego zadania
 */