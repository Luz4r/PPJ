package Zestaw24;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie45 {

    public static void createFiles(int howMany) throws IOException {
        int[] randomNumbers = new int[10];

        for(int i = 1; i <= howMany; i++) {
            for (int j = 0; j < randomNumbers.length; j++)
                randomNumbers[j] = (int) (Math.random() * 10001);

            for(int j = 0; j < randomNumbers.length - 1; j++){
                int index = j;
                for(int k = j + 1; k < randomNumbers.length; k++){
                    if(randomNumbers[index] > randomNumbers[k]){
                        index = k;
                    }
                }
                int tmp = randomNumbers[index];
                randomNumbers[index] = randomNumbers[j];
                randomNumbers[j] = tmp;
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("inputData" + i + ".txt"));

            StringBuilder sb = new StringBuilder();
            for (int k : randomNumbers)
                sb.append(k).append(" ");

            bw.write(sb.toString());
            bw.close();
        }
    }

    public static void createOneBigFile(int howMany) throws IOException{
        FileReader[] files = new FileReader[howMany];

        StringBuilder newNumbers = new StringBuilder();

        for(int i = 0; i < files.length; i++){
            files[i] = new FileReader("inputData" + (i+1) + ".txt");
        }

        int[] numbers = new int[howMany];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = loadNumber(files[i]);

        for(int i = 0; i < 10 * howMany; i++) {
            int index = getTheLowestNumberIndex(numbers);
            newNumbers.append(numbers[index]).append(" ");
            numbers[index] = loadNumber(files[index]);
        }

        BufferedWriter oneBigFile = new BufferedWriter(new FileWriter("allInputData.txt"));
        oneBigFile.write(newNumbers.toString());
        oneBigFile.close();

        for(FileReader i : files){
            i.close();
        }
    }

    private static int loadNumber(FileReader fileReader) throws IOException{
        int tmp;
        String number = "";

        while((tmp = fileReader.read()) != ' '){
            if(tmp == -1)
                return Integer.MAX_VALUE;
            number += (char)tmp;
        }

        return Integer.parseInt(number);
    }

    private static int getTheLowestNumberIndex(int[] numbers){
        int index = 0;

        for(int i = 1; i < numbers.length; i++){
            if(numbers[index] > numbers[i])
                index = i;
        }

        return index;
    }
}
