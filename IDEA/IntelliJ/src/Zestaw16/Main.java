package Zestaw16;

public class Main {
    public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(10);
        kwadrat.show();

        Walec walec = new Walec(10,5);
        walec.show();

        Wyraz wyraz = new Wyraz();

        wyraz.dodajZnak('a');
        wyraz.dodajZnak('l');
        wyraz.dodajZnak('a');

        wyraz.wyswietl();
        System.out.println("Dlugosc wyrazu: " + wyraz.length());
    }
}
