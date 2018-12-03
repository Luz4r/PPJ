package Zestaw17;

import Zestaw16.Kwadrat;
import Zestaw16.Walec;

public class KulaW {
    public int promien;

    KulaW(Walec walec){
        this.promien = (walec.promien > (walec.wysokosc/2))? walec.wysokosc / 2 : walec.promien;
    }

    KulaW(Kwadrat kwadrat){
        this.promien = kwadrat.bok / 2;
    }
}
