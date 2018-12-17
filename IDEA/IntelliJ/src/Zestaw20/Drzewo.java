package Zestaw20;

public class Drzewo {
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString(){
        return "Drzewo: " + wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa;
    }

    public void zerwijOwoc()throws DrzewoBezOwocoweException{
        if(!this.getClass().equals(DrzewoOwocowe.class))
            throw new DrzewoBezOwocoweException("To drzewo nie ma owocow");
        else
            System.out.println("Zerwales owoc");
    }
}
