package Zestaw20;

public class Drzewo {
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString(){
        return "Drzewo: " + wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa;
    }
}
