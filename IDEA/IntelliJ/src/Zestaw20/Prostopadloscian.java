package Zestaw20;

public class Prostopadloscian extends Prostokat {
    private int wysokosc;

    Prostopadloscian(int bokA, int bokB, int wysokosc){
        super(bokA, bokB);
        this.wysokosc = wysokosc;
    }

    public String toString(){
        return super.toString() + " Objetosc: " + getBokA()*getBokB()*wysokosc;
    }
}
