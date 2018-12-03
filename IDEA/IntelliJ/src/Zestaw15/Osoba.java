package Zestaw15;

public class Osoba {
    String imie;
    String nazwisko;
    int rokUrodzenia;

    Osoba(){}

    Osoba(String imie, String nazwisko, int rokUrodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    void show(){
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Rok urodzenia: " + rokUrodzenia);
    }
}
