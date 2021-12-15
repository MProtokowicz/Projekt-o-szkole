package com.company;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Main
{

    public static void main(String[] args)
    {

        Uczen uczen = new Uczen();



        uczen.zawartoscdziennika();

        System.out.println("Spis uczniów");
        uczen.wprowadzucznia("Kowalski",4);
        uczen.wprowadzucznia("Nowak",5);
        uczen.wprowadzucznia("Adamowski",1);


        uczen.zawartoscdziennika();

        System.out.println(" ");
        System.out.println("Srednia Nowaka");

        uczen.podajsrednia("Nowak");

        System.out.println(" ");
        System.out.println("Zmiana średniej Adamowskiego");

        uczen.zamiensrednia("Adamowski", 3);

        uczen.zawartoscdziennika();



    }
}
