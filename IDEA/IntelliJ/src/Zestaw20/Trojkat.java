package Zestaw20;

public class Trojkat {
    private int bok;

    Trojkat(int bok){
        this.bok = bok;
    }

    int getBok(){
        return bok;
    }

    public String toString(){
        return "Pole powierzchni: " + Math.pow(bok, 2)*Math.sqrt(3)/4;
    }
}
