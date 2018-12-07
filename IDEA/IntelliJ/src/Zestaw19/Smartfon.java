package Zestaw19;

public class Smartfon extends Komorka {
    private Osoba[] znajomi;

    Smartfon(){
        znajomi = new Osoba[]{
                new Osoba("Jan", "Kowalski", "123-456-789"),
                new Osoba("Zosia", "Skassa", "321-654-987"),
                new Osoba("Rafal", "Piorek", "661-589-840"),
                new Osoba("Piotr", "Szulim", "123-123-123"),
                new Osoba("Lukasz", "Piorek", "601-640-343")
        };
    }

    @Override
    void wyswietlHistoriePolaczen(){
        for(int i = 0; i < ostatnie10Polaczen.length && ostatnie10Polaczen[i] != null; i++){
            boolean znalazlOsobe = false;
            for(int j = 0; j < znajomi.length; j++){
                if(ostatnie10Polaczen[i].equals(znajomi[j].getNumer())){
                    System.out.println(znajomi[j].getImieNazwisko() + " " + znajomi[j].getNumer());
                    znalazlOsobe = true;
                }
            }
            if(!znalazlOsobe)
                System.out.println(ostatnie10Polaczen[i]);
        }
    }
}
