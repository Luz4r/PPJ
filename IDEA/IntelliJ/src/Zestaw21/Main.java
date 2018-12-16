package Zestaw21;

import Zestaw20.*;

public class Main {
    public static void main(String[] args) {
        int[][] tab = new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}
        };

        try {
            sprawdz(tab);
        }catch(Exception e){
            System.out.println(e);
        }

        Drzewo[] las = new Drzewo[]{
                new DrzewoIglaste(false, 200, "srednie", 800, 20),
                new DrzewoLisciaste(true, 400, "duze", 800),
                new DrzewoOwocowe(true, 150, "male", 50, "Jablko")
        };

        for(int i = 0; i < las.length; i++){
            System.out.println(las[i]);
        }

        for(int i = 0; i < las.length; i++){
            try {
                las[i].zerwijOwoc();
            }catch(DrzewoBezOwocoweException e){
                System.out.println(e);
            }
        }
    }

    public static void sprawdz(int[][] tab) throws Exception{
        int[][] bledyWTablicy = new int[tab.length * tab[0].length][2];
        int ktoraPozycja = 0;
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if(i != j){
                    if(tab[i][j] != 0){
                        bledyWTablicy[ktoraPozycja][0] = i;
                        bledyWTablicy[ktoraPozycja][1] = j;
                        ktoraPozycja++;
                    }
                }
            }
        }

        String wiadomosc = "Tablica nie spelnia wymagan, bledy na pozycjach ";
        for(int i = 0; i < ktoraPozycja; i++){
            wiadomosc += "[" + bledyWTablicy[i][0] + ", " + bledyWTablicy[i][1] + "], ";
        }

        throw new Exception(wiadomosc);
    }
}
