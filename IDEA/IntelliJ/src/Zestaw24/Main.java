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

        /*try{
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            int tmp;
            int i = 0;
            char[] array = new char[26];
            char[] checkedChars = new char[array.length];

            while((tmp = fileInputStream.read()) != -1){
                array[i++] = (char)tmp;
            }

            for(int j = 0; j < array.length; j++){
                for(int k = 0; k < checkedChars.length; k++){


                }
                for(int l = j; l < array.length; l++){

                }
            }

            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }*/


        try {
            int howMany = 4;
            Zadanie45.createFiles(4);
            Zadanie45.createOneBigFile(4);
        }catch(IOException e){
            e.printStackTrace();
        }

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
