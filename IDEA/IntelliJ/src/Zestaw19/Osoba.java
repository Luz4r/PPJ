package Zestaw19;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String numer;

    Osoba(String imie, String nazwisko, String numer){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    String getImieNazwisko(){
        return imie + " " + nazwisko;
    }

    String getNumer(){
        return numer;
    }
}
