package Zestaw22;

public class Rakieta {
    String nazwa;
    int wagaPaliwa;

    Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    void zatankuj(){
        wagaPaliwa += (int)(Math.random() * 200);
    }

    void start() throws Exception{
        if(wagaPaliwa < 1000)
            throw new Exception("start anulowany - za malo paliwa");

        System.out.println("Pomyslnie wystartowano");
    }
}
