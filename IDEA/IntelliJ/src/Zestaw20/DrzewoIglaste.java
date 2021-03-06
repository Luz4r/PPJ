package Zestaw20;

public class DrzewoIglaste extends Drzewo {
    protected int iloscIgiel;
    protected double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString(){
        return super.toString() + " " + iloscIgiel + " " + dlugoscSzyszki;
    }
}
