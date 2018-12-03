package Zestaw14;

public class Zadanie4 {
    public static void main(String[] args){
        double[][] array = new double[10][2];

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = Math.random() * 101;

        someMethod(array);
    }

    public static void someMethod(double[][] array){
        double average = 0;

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                average += array[i][j];
        average /= 20;

        System.out.println(average + "\n");

        for(int i = 0; i < array.length; i++){
            if(array[i][0] < average && array[i][1] > average){
                System.out.println(array[i][0] + " " + array[i][1]);
                System.out.println();
            }
        }
    }
}
