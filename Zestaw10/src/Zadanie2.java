public class Zadanie2 {
    public static void main(String[] args){
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++)
            array[i] = (int)((Math.random()*256) - 128);

        for(int i:array)
            System.out.print(i + " ");

        int firstIndex = 0, secondIndex = 1;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(Math.abs(array[firstIndex] + array[secondIndex]) > Math.abs(array[i] + array[j])){
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }

        System.out.println();
        System.out.println(array[firstIndex] + array[secondIndex]);
    }
}
