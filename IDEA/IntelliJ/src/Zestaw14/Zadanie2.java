package Zestaw14;

public class Zadanie2 {
    public static void main(String[] args){
        char[][] array = new char[5][4];

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = (char)(Math.random() * ('z' - 'a' + 1) + 'a');

        System.out.println(threeGreaterElements(array));
    }

    public static boolean threeGreaterElements(char[][] array){
        for(int i = 0; i < array.length; i += array.length - 1) {
            for(int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j - 1] < array[i][j] && array[i][j] < array[i][j + 1]) {
                    System.out.print(i == 0? "W pierwszym wierszu":"W ostatnim wierszu");
                    System.out.println();
                    return true;
                }
            }
        }
        for(int i = 0; i < array[0].length; i += array[0].length - 1){
            for(int j = 1; j < array.length - 1; j++) {
                if (array[j - 1][i] < array[j][i] && array[j][i] < array[j + 1][i]) {
                    System.out.print(i == 0? "W pierwszej kolumnie":"W drugiej kolumnie");
                    System.out.println();
                    return true;
                }
            }
        }
        return false;
    }
}
