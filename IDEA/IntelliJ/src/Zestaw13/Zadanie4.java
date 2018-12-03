package Zestaw13;

public class Zadanie4 {
	public static void main(String[] args){
		int[] firstArray = new int[15], secondArray = new int[10];
        int[] result;

        for(int i = 0; i < firstArray.length; i++)
            firstArray[i] = (int)(Math.random() * 50);

        for(int i : firstArray)
            System.out.print(i + " ");
        System.out.println("\n");

        for(int i = 0; i < secondArray.length; i++)
            secondArray[i] = (int)(Math.random() * 50);

        for(int i : secondArray)
            System.out.print(i + " ");
        System.out.println("\n\n\n");


        result = vodkaMethod(firstArray, secondArray, -1);
        for(int i : result)
            System.out.print(i + " ");
        System.out.println("\n");

        result = vodkaMethod(firstArray, secondArray, 1);
        for(int i : result)
            System.out.print(i + " ");
        System.out.println("\n");

    }

    static int[] vodkaMethod(int[] firstArray, int[] secondArray, int param){
	    int[] newArray;
        int length = (firstArray.length > secondArray.length)? secondArray.length : firstArray.length;

        if(param < 0){
            newArray = new int[length];
            for(int i = 0; i < length; i++){
                newArray[i] = firstArray[i] + secondArray[i];
            }
            return newArray;
        }else if(param > 0){
            int[] longerArray = (firstArray.length < secondArray.length? secondArray : firstArray);
            int restOfArray = Math.abs(firstArray.length - secondArray.length);
            newArray = new int[restOfArray];
            for(int i = length, j = 0; i < longerArray.length; i++, j++){
                newArray[j] = longerArray[i];
            }
            return newArray;
        }else if(firstArray.length == secondArray.length){
	        return null;
        }
        return null;
    }
}
