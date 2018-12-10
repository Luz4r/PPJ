package Zestaw20;

public class Prostokat {
    private int bokA, bokB;

    Prostokat(int bokA, int bokB){
        this.bokA = bokA;
        this.bokB = bokB;
    }

    int getBokA(){
        return bokA;
    }

    int getBokB(){
        return bokB;
    }

    public String toString(){
        return "Pole powierzchni: " + bokA*bokB;
    }
}
