package Zestaw16;

public class Kwadrat {
    public int bok;
    Walec walec;

    public Kwadrat(int bok){
        this.bok = bok;
        walec = new Walec(bok/2, bok);
    }

    public void show(){
        int polePowierzchni = bok*bok;
        System.out.println("Pole powierzchni kwadratu: " + polePowierzchni);

        System.out.println("Objetosc szescianu: " + polePowierzchni*bok);

        walec.show();
    }
}
