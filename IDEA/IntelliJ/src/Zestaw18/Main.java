package Zestaw18;

public class Main {
    public static void main(String[] args) {
        Owoc owoc = new Owoc("Jablko");
        owoc.wypisz();

        System.out.println();

        Fabryka fabryka = new Fabryka();
        for(int i = 0; i < 15; i++)
            fabryka.przyjmij(new Owoc("Truskawkowy"));
    }
}
