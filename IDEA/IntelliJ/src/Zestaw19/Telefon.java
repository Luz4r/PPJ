package Zestaw19;

import java.awt.Color;

public class Telefon {
    private String interfejsKomunikacyjny;
    private Color color;

    Telefon(){
        interfejsKomunikacyjny = "";
        color = Color.RED;
    }

    void zadzwon(String numer){
        System.out.println(numer);
    }

    void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}
