package Ch15_List;

import java.util.ArrayList;
import java.util.List;

public class Ex4_CableProgram {
    public static void main(String[] args) {
        List<Ex4_Cable> cables = new ArrayList<>();

        Ex4_Cable hdmi = new Ex4_Cable("hdmi");
        Ex4_Cable usb2 = new Ex4_Cable("usb2");
        Ex4_Cable usb3 = new Ex4_Cable("usb3");
        Ex4_Cable dvi = new Ex4_Cable("dvi");
        Ex4_Cable jack = new Ex4_Cable("jack");

        cables.add(hdmi);
        cables.add(usb2);
        cables.add(usb3);
        cables.add(dvi);
        cables.add(jack);

        for (Ex4_Cable cable : cables) {
            cable.print();
        }
    }
}

/**
 * Stwórz klasę o nazwie Cable (wraz z konstruktorem) zawierającą:
 * Pole: String type
 * Metodę: public void print() drukującą tekst: "Jest to kabel typu xxx"
 * <p>
 * Stwórz klasę  CableProgram z metodą main() stwórz listę:
 * List<Cable> cables = new ArrayList<>();
 * <p>
 * Stwórz 5 obiektów klasy Cable, a następnie dodaj je do listy używając metody cables.add(xxxx)
 * Na koniec przy pomocy pętli for-each przeiteruj po liście cables i dla każdego z elementów uruchom metodę print().
 * Na koniec programu wydrukuj do konsoli ile elementów zawiera lista
 */