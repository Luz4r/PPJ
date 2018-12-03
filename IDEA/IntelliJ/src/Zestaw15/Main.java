package Zestaw15;

public class Main {
    public static void main(String[] args){
        //=============Zadanie1, 2
        MethodCurrier methodCurrier = new MethodCurrier();

        Number number = new Number();

        number.setVal(10);

        methodCurrier.setValue(10);
        methodCurrier.setValue(10f);
        methodCurrier.setValue(number);

        //=============Zadanie3

        Osoba osoba = new Osoba();

        osoba.imie = "Jakub";
        osoba.nazwisko = "Kowalski";
        osoba.rokUrodzenia = 2000;

        //=============Zadanie4

        Osoba osoba2 = new Osoba("Rafal", "Piorek", 1999);

        osoba2.show();

        //=============Zadanie5

        Cp1x firstNumber = new Cp1x(10, 15);
        Cp1x secondNumber = new Cp1x(25, 44);
        Cp1x thirdNumber = new Cp1x(3, 11);

        firstNumber.add(secondNumber);
        firstNumber.show();

        secondNumber.mul(thirdNumber);
        secondNumber.show();

        thirdNumber.sub(secondNumber);
        thirdNumber.show();

        firstNumber.inc();
        firstNumber.show();
    }
}
