public class Zadanie1 {
	public static void main(String[] args){
        long[] array = new long[10];
        for(int i = 0; i < array.length - 1; i++){
            array[i + 1] = array[i] + 1;
        }

        boolean isEverything = true;

        int firstIndex, secondIndex;
        long tmp;

        while(isEverything){
            firstIndex = (int)(Math.random()*array.length);
            secondIndex = (int)(Math.random()*array.length);
            tmp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = tmp;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i + 1] == array[i] + 1){
                    isEverything = true;
                    break;
                }else{
                    isEverything = false;
                }
            }
        }

        for(long i:array)
            System.out.print(i + " ");
	}
}
