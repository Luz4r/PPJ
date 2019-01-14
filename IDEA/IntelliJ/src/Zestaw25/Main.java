package Zestaw25;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        try{
            BufferedReader br = new BufferedReader(new FileReader("zad1.txt"));
            String line = br.readLine();
            br.close();

            StringTokenizer st = new StringTokenizer(line);

            int sum = 0;
            while(st.hasMoreTokens())
                sum += Integer.parseInt(st.nextToken());

            System.out.println(sum);

        }catch(IOException e){
            e.printStackTrace();
        }


        //Exercise 2
        try{
            FileInputStream fr = new FileInputStream("z2_s18660.bin");

            String result = "";
            int[] numbers = new int[5];

            for(int i = 0; i < numbers.length; i++){
                for(int j = 0; j < 31; j+=8)
                    numbers[i] += (fr.read() << j);
            }

            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] < 255) {
                    result += numbers[i];
                    if(result.length() == 1)
                        result += ".";
                }
            }

            System.out.println(result);

        }catch(IOException e){
            e.printStackTrace();
        }


        //Exercise 3
        try{
            FileReader[] files = new FileReader[3];

            for(int i = 0; i < 3; i++)
                files[i] = new FileReader("zad3-" + (i+1) + ".txt");

            int first = files[0].read(), second = files[1].read(), third = files[2].read();

            while(first != -1 || second != -1 || third != -1){
                if(first != -1)
                    System.out.print((char)first);
                if(second != -1)
                    System.out.print((char)second);
                if(third != -1)
                    System.out.print((char)third);

                first = files[0].read();
                second = files[1].read();
                third = files[2].read();
            }

            System.out.println("\n");

        }catch(IOException e){
            e.printStackTrace();
        }


        //Exercise 4
        /*try{
            BufferedReader br = new BufferedReader(new FileReader("zad4.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("zad4.txt", true));

            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line);

            int number1, number2, result = 0;

            String operacja;

            while(st.hasMoreTokens()){
                number1 = Integer.parseInt(st.nextToken());
                operacja = st.nextToken();
                number2 = Integer.parseInt(st.nextToken());

                switch(operacja){
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                }


                String newLine = number1 + " " + operacja + " " + number2 + " = " + result;

                bw.write("\n");
                bw.write(newLine);

                line = br.readLine();
                if(line != null)
                    st = new StringTokenizer(line);
            }
            br.close();
            bw.close();

        }catch(IOException e){
            e.printStackTrace();
        }*/
    }
}
