package Zestaw16;

public class Walec {
    public int promien;
    public int wysokosc;

    public Walec(int promien, int wysokosc){
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show(){
        int polePowierzhcniPodstawy = (int)(Math.PI*promien*promien);

        System.out.println("Pole powierzchni podstawy walca: " + polePowierzhcniPodstawy);

        System.out.println("Objetosc walca: " + polePowierzhcniPodstawy*wysokosc);
    }
}
