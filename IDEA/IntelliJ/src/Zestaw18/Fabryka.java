package Zestaw18;

public class Fabryka {
    private double masaOwocow;

    Fabryka(){
        masaOwocow = 0;
    }

    void przyjmij(Owoc owoc){
        masaOwocow += owoc.waga;
        if(masaOwocow >= 10){
            masaOwocow -= 10;
            for(int i = 0; i < 10; i++){
                Dzem dzem = new Dzem(owoc.nazwa);
                Sloik sloik = new Sloik(dzem);
                System.out.println(i+1 + " sloik wypelniony " + sloik.dzem.smak + "m dzemem");
            }
        }
    }
}
