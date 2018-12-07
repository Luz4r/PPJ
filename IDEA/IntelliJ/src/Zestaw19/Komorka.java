package Zestaw19;

public class Komorka extends Telefon {
    protected String[] ostatnie10Polaczen;
    private int ktoryNumer;

    Komorka(){
        ostatnie10Polaczen = new String[10];
        ktoryNumer = 0;
    }

    @Override
    void zadzwon(String numer){
        super.zadzwon(numer);
        if(ktoryNumer == ostatnie10Polaczen.length){
            for(int i = 0; i < ostatnie10Polaczen.length - 1; i++){
                ostatnie10Polaczen[i] = ostatnie10Polaczen[i+1];
            }
            ostatnie10Polaczen[ostatnie10Polaczen.length - 1] = numer;
        }else
            ostatnie10Polaczen[ktoryNumer++] = numer;
    }

    @Override
    void wyswietlHistoriePolaczen(){
        for(int i = 0; i < ostatnie10Polaczen.length && ostatnie10Polaczen[i] != null; i++){
            System.out.println(ostatnie10Polaczen[i]);
        }
    }
}
