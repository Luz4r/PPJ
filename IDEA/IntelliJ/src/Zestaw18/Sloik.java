package Zestaw18;

public class Sloik {
    Dzem dzem;
    private boolean czyOtwarty;

    Sloik(Dzem dzem){
        czyOtwarty = false;
        otworz();
        this.dzem = dzem;
        zamknij();
    }

    void otworz(){
        czyOtwarty = true;
    }

    void zamknij(){
        czyOtwarty = false;
    }
}
