package com.company;
import java.util.*;

public class Uczen
{

    private String nazwisko;
    private List<Integer> dzienniczek= new ArrayList<>();
    private static HashMap <String, Float> dziennik = new HashMap<>();


    public Uczen()
    {
        this.dziennik = new HashMap();
    }

    public void wprowadzucznia(String nazwisko, float srednia)
    {

        if(srednia>=1 && srednia<= 6)
        {
            dziennik.put(nazwisko,srednia);

        }

    }

    public static void zawartoscdziennika()
    {
        System.out.println(dziennik);
    }


    public void zamiensrednia( String nazwisko, float srednia)
    {
        if(srednia>=1 && srednia<= 6)
        {
            dziennik.replace (nazwisko,srednia);
        }
    }

    public static void  podajsrednia(String nazwisko)
    {
        if(dziennik.containsKey(nazwisko))
        {
            System.out.println(dziennik.get(nazwisko));
        }
    }
}
