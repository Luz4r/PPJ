package Zestaw20;

public class Ostroslup extends Trojkat {
    private int wysokosc;

    Ostroslup(int bok, int wysokosc){
        super(bok);
        this.wysokosc = wysokosc;
    }

    public String toString(){
        double hScianyBocznej = Math.sqrt(Math.pow(getBok()*Math.sqrt(3) / 2 / 3, 2) + Math.pow(wysokosc, 2));
        double polePowierzchniBocznej = 3 * (hScianyBocznej*getBok() / 2);
        double polePodstawy = Math.pow(getBok(), 2) * Math.sqrt(3) / 4;

        return "Pole powierzchni bryly: " + (polePowierzchniBocznej + polePodstawy) +
                " Objetosc: " + Math.pow(getBok(), 2) * Math.sqrt(3) / 4 * wysokosc / 3;
    }
}
