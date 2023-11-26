package Ch05_Excepions;

public class Ex5_TryCatchArray {
    public static void main(String[] args) {
        int[] tab = new int[5];

        for (int i = 0; i < 10; i++) {
            System.out.println("wartosc i: " + i);
            try {
                tab[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unfortunately you are out of range of the array");
                System.out.println("wychodze z petli");
                break;
            }
        }
        System.out.println("THE END");
    }

}

/*
Napisz program, w którym zadeklarujesz i uzupełnisz pięcioelementową tablicę o nazwie 'numbers'.

Stwórz pętlę iterującą od 0 do 10, gdzie w każdym powtórzeniu pętli wypiszesz do konsoli numbers[i]
(dla i = 5 zostanie wyrzucony błąd ponieważ nie ma elementu o indeksie 5)

Zaobserwuj jaki wyjątek wyrzuci program

Obsłuż ten wyjątek, aby program zamiast niego wypisał tekst:
	Unfortunately you are out of range of the array


 */
