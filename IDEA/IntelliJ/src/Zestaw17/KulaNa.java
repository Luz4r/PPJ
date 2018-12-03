package Zestaw17;

import Zestaw16.Kwadrat;
import Zestaw16.Walec;

public class KulaNa {
    int promien;

    KulaNa(Walec walec){
        int y2 = (int)(Math.pow(walec.promien*2, 2) + Math.pow(walec.wysokosc, 2));
        this.promien = (int)(Math.sqrt(y2)/2);
    }

    KulaNa(Kwadrat kwadrat){
        int y2 = (int)(Math.pow(kwadrat.bok*Math.sqrt(2), 2) + Math.pow(kwadrat.bok
        , 2));
        this.promien = (int)(Math.sqrt(y2)/2);
    }
}
