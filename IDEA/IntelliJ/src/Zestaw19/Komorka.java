package Zestaw19;

public class Komorka extends Telefon {
    protected String[] ostatnie10Polaczen;
    private int ktoryNumer;

    Komorka(){
        ostatnie10Polaczen = new String[10];
        ktoryNumer = 9;
    }

    @Override
    void zadzwon(String numer){
        super.zadzwon(numer);

        if(ktoryNumer < 0){
            for(int i = ostatnie10Polaczen.length - 1; i > 0; i--){
                ostatnie10Polaczen[i] = ostatnie10Polaczen[i-1];
            }
            ostatnie10Polaczen[0] = numer;
        }else
            ostatnie10Polaczen[ktoryNumer--] = numer;
    }

    @Override
    void wyswietlHistoriePolaczen(){
        for(int i = 0; i < ostatnie10Polaczen.length && ostatnie10Polaczen[i] != null; i++){
            System.out.println(ostatnie10Polaczen[i]);
        }
    }
}
