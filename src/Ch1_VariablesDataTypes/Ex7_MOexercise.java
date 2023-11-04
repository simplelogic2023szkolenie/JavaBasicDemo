package Ch1_VariablesDataTypes;

public class Ex7_MOexercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int sum = a+b;
        int diff = a-b;
        int multiplication = a*b;
        int division = a/b;

        System.out.println("wynik dodawania " + sum);
        System.out.println("wynik odejmowania " + diff);
        System.out.println("wynik mnozenia " + multiplication);
        System.out.println("wynik dzielenia " + division);
    }
}

/*
1. Zadeklaruj dwie zmienne typu `int` i przypisz im dowolne wartości.
2. Dla każdej z operacji: dodawania, odejmowania, mnożenia i dzielenia, zadeklaruj osobną zmienną, w której zapiszesz wynik danej operacji.
3. Wykorzystując operatory matematyczne (`+`, `-`, `*`, `/`), oblicz wyniki dla zadeklarowanych wcześniej zmiennych.
4. Wydrukuj wyniki operacji w następującym formacie: "Wynik [nazwa operacji]: [wynik]".

 */