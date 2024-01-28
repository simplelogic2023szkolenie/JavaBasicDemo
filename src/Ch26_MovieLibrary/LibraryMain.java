package Ch26_MovieLibrary;

import Ch17_Salary.io.InputHelper;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
        Director frankDarabont = new Director("Frank", "Darabont");
        Director davidFincher = new Director("David", "Fincher");
        Director clintEastwood = new Director("Clint", "Eastwood");
        Director stevenSoderbergh = new Director("Steven", "Soderbergh");

        Actor timRobbins = new Actor("Tim", "Robbins");
        Actor morganFreeman = new Actor("Morgan", "Freeman");
        Actor bobGunton = new Actor("Bob", "Gunton");
        Actor bradPitt = new Actor("Brad", "Pitt");
        Actor gwynethPaltrow = new Actor("Gwyneth", "Paltrow");
        Actor edwardNorton = new Actor("Edward", "Norton");
        Actor georgeClooney = new Actor("George", "Clooney");
        Actor juliaRoberts = new Actor("Julia", "Roberts");
        Actor clintEastwoodActor = new Actor("Clint", "Eastwood");

        MovieLibrary movieLibrary = new MovieLibrary();

        Movie shawshankRedemption = new Movie(
                "The Shawshank Redemption", 1994, frankDarabont,
                Arrays.asList(timRobbins, morganFreeman, bobGunton));
        Movie seven = new Movie(
                "Seven", 1995, davidFincher,
                Arrays.asList(morganFreeman, bradPitt, gwynethPaltrow));
        Movie fightClub = new Movie(
                "Fight Club", 1999, davidFincher,
                Arrays.asList(bradPitt, edwardNorton));
        Movie unforgiven = new Movie(
                "Unforgiven", 1992, clintEastwood,
                Arrays.asList(clintEastwoodActor, morganFreeman));
        Movie oceansEleven = new Movie(
                "Ocean's Eleven", 2001, stevenSoderbergh,
                Arrays.asList(bradPitt, georgeClooney, juliaRoberts));

        movieLibrary.addMovie(shawshankRedemption);
        movieLibrary.addMovie(seven);
        movieLibrary.addMovie(fightClub);
        movieLibrary.addMovie(unforgiven);
        movieLibrary.addMovie(oceansEleven);


        while (true){
            printMenu();
            int option = InputHelper.getNumber("Podaj opcje");

            switch (option){
                case 1:
                    int startYear = InputHelper.getPositiveNumber("Podaj rok startowy");
                    int endYear = InputHelper.getPositiveNumber("Podaj rok końcowy");
                    movieLibrary.printMovieTitlesBetweenYears(startYear, endYear);

                case 2:
                    movieLibrary.printRandomMovie();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Podałeś liczbę z poza zakresu 1-4");

            }
        }


    }


    public static void printMenu(){
        System.out.println("1. Podaj dwie daty aby wyświetlić nazwy filmów nagranych pomiędzy tymi data");
        System.out.println("2. Wyświetl wszystkie informacje o losowym filmie");
        System.out.println("3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich grał");
        System.out.println("4. Zakończ program");
    }
}




/**
 *
 * Stwórz program o nazwie MovieLibrary. Powinien on przechowywać listę filmów.
 *
 * Każdy film powinien mieć: tytuł, rok wydania, reżysera oraz listę aktorów
 *
 * Reżyser oraz aktorzy powinni mieć oddzielnie imię i nazwisko.
 *
 * Zastosuj tutaj programowanie obiektowe – stwórz klasy MovieLibrary, Movie, Director, Actor wraz z potrzebnymi polami klasy i metodami.
 *
 * W metodzie main() stwórz obiekty 5 filmów - każdy z przynajmniej 3 aktorami (część aktorów powinna występować w więcej niż filmie) – i dodaj je do listy.
 *
 * Stwórz menu w programie, które będzie wyświetlane użytkownikowi w konsoli, wraz z obsługą wybranych przez niego opcji:
 *
 * 	1. Podaj dwie daty aby wyświetlić nazwy filmów nagranych pomiędzy tymi datami
 * 	2. Wyświetl wszystkie informacje o losowym filmie
 * 	3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich grał
 *
 *
 */
