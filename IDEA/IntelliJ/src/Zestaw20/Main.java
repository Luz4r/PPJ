package Zestaw20;

public class Main {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo(true, 10, "male");
        DrzewoIglaste drzewoIglaste = new DrzewoIglaste(true, 100, "duze", 500, 20);
        DrzewoLisciaste drzewoLisciaste = new DrzewoLisciaste(true, 200, "srednie", 50);
        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(true, 600, "duze", 25, "Jablko");

        Prostokat prostokat = new Prostokat(10, 10);
        Prostopadloscian prostopadloscian = new Prostopadloscian(10, 20, 5);
        Trojkat trojkat = new Trojkat(12);
        Ostroslup ostroslup = new Ostroslup(15, 22);
        Graniastolsup graniastolsup = new Graniastolsup(23, 12);

        System.out.println(drzewo + "\n");

        System.out.println(drzewoIglaste + "\n");

        System.out.println(drzewoLisciaste + "\n");

        System.out.println(drzewoOwocowe + "\n");

        System.out.println(prostokat + "\n");

        System.out.println(prostopadloscian + "\n");

        System.out.println(trojkat + "\n");

        System.out.println(ostroslup + "\n");

        System.out.println(graniastolsup + "\n");
    }
}
