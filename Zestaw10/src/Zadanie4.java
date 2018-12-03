public class Zadanie4 {
    public static void main(String[] args){
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        for (int i = 0; i < intArray.length; i++)
            intArray[i] = (int)(Math.random()*150);

        for (int i = 0; i < doubleArray.length; i++)
            doubleArray[i] = Math.random()*150;

        int index = 0;
        int intTemp;
        double doubleTemp;

        for (int i = 0; i < intArray.length - 1; i++) {
            for(int j = i; j < intArray.length; j++) {
                if ((intArray[i] + doubleArray[i]) > (intArray[j] + doubleArray[j])) {
                    index = j;
                }
            }
            intTemp = intArray[index];
            doubleTemp = doubleArray[index];

            intArray[index] = intArray[i];
            doubleArray[index] = doubleArray[i];

        }
    }
}
