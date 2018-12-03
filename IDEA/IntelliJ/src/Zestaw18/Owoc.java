package Zestaw18;

public class Owoc {
    String nazwa;
    double waga;

    Owoc(String nazwa){
        this.nazwa = nazwa;
        waga = Math.random()*(0.9 - 0.5) + 0.5;
    }

    public void wypisz(){
        System.out.println(nazwa + " " + waga);
    }
}
