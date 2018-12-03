package Zestaw17;

public class Kukurydza {
    int iloscZiaren;

    Kukurydza(int iloscZiaren){
        this.iloscZiaren = iloscZiaren;
    }

    Popcorn[] zrobPopcorn(){
        Popcorn[] popcorns = new Popcorn[(int)(Math.random() * iloscZiaren+1)];
        for(int i = 0; i < popcorns.length; i++)
            popcorns[i] = new Popcorn();
        return popcorns;
    }
}
