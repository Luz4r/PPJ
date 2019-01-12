package Zestaw23;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream strumienWe = System.in;

        try {
            do{
                int wartosc = strumienWe.read();
                System.out.println((char)wartosc + " " + wartosc);
            }while(strumienWe.available() > 1);
        }catch(IOException e){
            e.printStackTrace();
        }



    }
}
