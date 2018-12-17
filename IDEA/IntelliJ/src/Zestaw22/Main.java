package Zestaw22;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        /*try{
            podniesArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        try{
            podniesFileNotFoundException();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            podniesException();
        }catch(Exception e){
            e.printStackTrace();
        }*/

        try{
        System.out.println(podajLiczbe("0b01"));
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

        Rakieta rakieta = new Rakieta("Falcon 5", 0);

        for(int i = 0; i < 10; i++)
            rakieta.zatankuj();

        try{
            rakieta.start();
        }catch(Exception e){
            e.printStackTrace();
        }


    }

    static void podniesArrayIndexOutOfBoundsException()throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException();
    }

    static void podniesFileNotFoundException() throws FileNotFoundException{
        throw new FileNotFoundException();
    }

    static void podniesException() throws Exception{
        throw new Exception();
    }

    static int podajLiczbe(String liczba) throws NumberFormatException{
        int nowaLiczba = 0;

        String nowyString = "";

        if(liczba.charAt(0) == '0' && liczba.charAt(1) == 'x'){
            for(int i = 2; i < liczba.length(); i++)
                nowyString += liczba.charAt(i);
            for(char i : nowyString.toCharArray()) {
                if ((i > '9' || i < '0') && (i < 'A' || i > 'F'))
                    throw new NumberFormatException("Zly format liczby");
            }
            for(int i = 0, j = nowyString.length()-1; i < nowyString.length(); i++, j--) {
                switch (nowyString.charAt(i)){
                    case 'A':
                        nowaLiczba += 10 * Math.pow(16, j);
                        break;
                    case 'B':
                        nowaLiczba += 11 * Math.pow(16, j);
                        break;
                    case 'C':
                        nowaLiczba += 12 * Math.pow(16, j);
                        break;
                    case 'D':
                        nowaLiczba += 13 * Math.pow(16, j);
                        break;
                    case 'E':
                        nowaLiczba += 14 * Math.pow(16, j);
                        break;
                    case 'F':
                        nowaLiczba += 15 * Math.pow(16, j);
                        break;
                    default:
                        nowaLiczba += (nowyString.charAt(i) - '0') * Math.pow(16, j);
                        break;
                }
            }

        }else if(liczba.charAt(0) == '0' && liczba.charAt(1) == 'b'){
            for(int i = 2; i < liczba.length(); i++) {
                nowyString += liczba.charAt(i);
            }
            for(char i : nowyString.toCharArray()) {
                if (i > '1' || i < '0')
                    throw new NumberFormatException("Zly format liczby");
            }
            for(int i = 0, j = nowyString.length()-1; i < nowyString.length(); i++, j--)
                nowaLiczba += (nowyString.charAt(i) - '0') * Math.pow(2, j);

        }else if(liczba.charAt(0) == '0'){
            for(char i : liczba.toCharArray()){
                if(i > '7' || i < '0')
                    throw new NumberFormatException("Zly format liczby");
            }
            for(int i = 1; i < liczba.length(); i++)
                nowyString += liczba.charAt(i);
            for(int i = 0, j = nowyString.length() - 1; i < nowyString.length(); i++, j--)
                nowaLiczba += (nowyString.charAt(i) - '0') * Math.pow(8, j);
        }else{
            throw new NumberFormatException("Zly format liczby");
        }

        return nowaLiczba;
    }
}
