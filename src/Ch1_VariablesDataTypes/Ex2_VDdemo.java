package Ch1_VariablesDataTypes;

public class Ex2_VDdemo {

    public static void main(String[] args) {
        int a = 10;
        double b = 23.24;
        char someChar = 'A';
        boolean isEarthFlat = false;

        String name = "Mateusz";
        String lastName = "Tadla";

        System.out.println(a);
        System.out.println(b);
        System.out.println(someChar);
        System.out.println(isEarthFlat);
        System.out.println(name);
        System.out.println(someChar);

        System.out.println(name + " Tadla");
        System.out.println(name + " " + lastName + isEarthFlat);


    }

    /*
Opis zadania:
1. Zadeklaruj zmienne następujących typów:
    - int
    - double
    - char
    - boolean
    - String

2. Przypisz im odpowiednie wartości. Na przykład:
    - int - dowolna liczba całkowita
    - double - dowolna liczba zmiennoprzecinkowa
    - char - dowolny znak
    - boolean - wartość true lub false
    - String - dowolny ciąg znaków

3. Użyj funkcji System.out.println do wydrukowania wartości każdej z zadeklarowanych zmiennych na ekran.


     */
}
