package Zestaw18;

public class Dzem {
    String smak;
    double waga;

    Dzem(String smak, double waga){
        this.smak = smak;
        this.waga = waga;
    }

    Dzem(String smak){
        this(smak, 100.0);
    }

    Dzem(double waga){
        this("No name", waga);
    }
}
