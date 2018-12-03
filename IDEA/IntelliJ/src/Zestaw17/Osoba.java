package Zestaw17;

public class Osoba {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia){
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba(String imie){
        this.imie = imie;
        rokUrodzenia = 1990;
    }

    public String dostarczImie(){
        return imie;
    }

    public int dostarczWiek(){
        return rokUrodzenia;
    }

    public static Osoba zwrocStarszaOsobe(Osoba pierwszaOsoba, Osoba drugaOsoba){
        return pierwszaOsoba.rokUrodzenia < drugaOsoba.rokUrodzenia? pierwszaOsoba:drugaOsoba;
    }

    public static Osoba zwrocNajstarszaOsobe(Osoba[] osoby){
        Osoba najstarszaOsoba = osoby[0];
        for(int i = 1; i < osoby.length; i++){
            if(najstarszaOsoba.rokUrodzenia > osoby[i].rokUrodzenia)
                najstarszaOsoba = osoby[i];
        }
        return najstarszaOsoba;
    }
}
