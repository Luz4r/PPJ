package Zestaw24;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        /*int[] primeNumbers = generatePrime(20);

        try {
            FileWriter fileWriter = new FileWriter("file.txt");

            for(int i : primeNumbers)
                fileWriter.write(Integer.toString(i) + " ");

            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }*/

        //System.out.println(check("file.txt"));

        try{
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            int tmp;
            int i = 0;
            char[] array = new char[50];

            while((tmp = fileInputStream.read()) != -1){
                if(i == array.length){
                    char[] newArray = new char[array.length * 2];
                    for(int j = 0; j < array.length; j++)
                        newArray[j] = array[j];
                    array = newArray;
                }
                array[i++] = (char)tmp;
            }

            char[] checkedChars = new char[array.length];

            i = 0;
            fileInputStream.close();

            for(int j = 0; j < array.length; j++){
                boolean isAlreadyChecked = false;
                int howMany = 0;
                for(int k = 0; k < checkedChars.length; k++){
                    if(array[j] == checkedChars[k]) {
                        isAlreadyChecked = true;
                    }
                }
                if(!isAlreadyChecked){
                    for(int k = j; k < array.length; k++){
                        if(array[j] == array[k])
                            howMany++;
                    }
                    System.out.println("Znak: " + array[j] + " wystapil " + howMany + (howMany == 1? " raz":" razy"));
                    checkedChars[i++] = array[j];
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }


        /*try {
            int howMany = 4;
            Zadanie45.createFiles(howMany);
            Zadanie45.createOneBigFile(howMany);
        }catch(IOException e){
            e.printStackTrace();
        }*/

    }

    public static int[] generatePrime(int howMany){
        int n = 3;

        int[] primeNumbers = new int[howMany];
        int k = 0;

        while(k < howMany) {
            if (isPrime(n))
                primeNumbers[k++] = n++;
            else
                n++;
        }

        return primeNumbers;
    }

    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static boolean check(String filePath){
        try {
            FileReader fileReader = new FileReader(filePath);

            int tmp;
            StringBuilder sb = new StringBuilder();
            while((tmp = fileReader.read()) != -1){
                sb.append((char)tmp);
            }

            StringTokenizer st = new StringTokenizer(sb.toString());

            while(st.hasMoreTokens()){
                if(!isPrime(Integer.parseInt(st.nextToken())))
                    return false;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return true;
    }
}
