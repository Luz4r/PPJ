package Zestaw14;

public class Zadanie3 {
    public static void main(String[] args){
        int[][] firstArray = new int[5][5], secondArray = new int[5][5];

        System.out.println(jestRowna(firstArray, secondArray));
    }

    public static boolean jestRowna(int[][] firstArray, int[][] secondArray){
        if(firstArray.length == secondArray.length){
            for(int i = 0; i < firstArray.length; i++)
                if(firstArray[i].length != secondArray[i].length)
                    return false;
            for(int i = 0; i < firstArray.length; i++){
                for(int j = 0; j < firstArray[i].length; j++){
                    if(firstArray[i][j] != secondArray[i][j])
                        return false;
                }
            }
        }
        else
            return false;
        return true;
    }
}
