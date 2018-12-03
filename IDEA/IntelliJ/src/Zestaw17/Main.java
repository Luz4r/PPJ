package Zestaw17;

import Zestaw16.Kwadrat;
import Zestaw16.Walec;

public class Main {
    public static void main(String[] args){
        Kukurydza kukurydza = new Kukurydza(10);

        System.out.println(kukurydza.zrobPopcorn().length);

        B b = new B();
        b.nstaticShowThis();
        B.staticShowThis();

        KulaW kulaWKwadracie = new KulaW(new Kwadrat(10));
        KulaW kulaWWalcu = new KulaW(new Walec(10, 10));

        System.out.println(kulaWKwadracie.promien);
        System.out.println(kulaWWalcu.promien);

        KulaNa kulaNaWalcu = new KulaNa(new Walec(5, 10));
        KulaNa kulaNaKwadracie = new KulaNa(new Kwadrat(10));

        System.out.println(kulaNaWalcu.promien);
        System.out.println(kulaNaKwadracie.promien);

        Osoba pierwszaOsoba = new Osoba("Alek");
        Osoba drugaOsoba = new Osoba("Krzysztof", 1999);
        Osoba trzeciaOsoba = new Osoba("Mariusz", 1890);

        Osoba[] osoby = {pierwszaOsoba, drugaOsoba, trzeciaOsoba};

        Osoba najstarszaOsoba = Osoba.zwrocNajstarszaOsobe(osoby);
        System.out.println(najstarszaOsoba.dostarczImie());

        Osoba starszaOsoba = Osoba.zwrocStarszaOsobe(pierwszaOsoba, drugaOsoba);
        System.out.println(starszaOsoba.dostarczImie());
    }
}
