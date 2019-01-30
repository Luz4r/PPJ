package Zestaw26;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //Color color = new Color(255, 125, 25);

        //System.out.println(color);

        Color[] colors = new Color[10000];

        for(int i = 0; i < colors.length; i++){
            colors[i] = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
        }

        try{
            //saveToTxt(colors);
            //saveToBinary(colors);       //Commented so as not to generate files each time program runs
            readFromTxt();
            readFromBinary();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static void saveToTxt(Color[] colors) throws IOException {
        long startTime = System.currentTimeMillis();

        BufferedWriter br = new BufferedWriter(new FileWriter("stringColors.txt"));

        for(Color color : colors){
            StringBuilder sb = new StringBuilder();

            sb  .append(color.getValue() & 0b11111111).append(" ")
                .append(color.getValue() >> 8 & 0b11111111).append(" ")
                .append(color.getValue() >> 16 & 0b11111111).append("\n");
            br.write(sb.toString());
            //br.write(color.toString() + "\n");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        br.close();
    }

    static void saveToBinary(Color[] colors) throws IOException{
        long startTime = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream("byteColors.rafal");

        for(Color color : colors){
            fos.write(color.getValue() & 0b11111111);
            fos.write(color.getValue() >> 8 & 0b11111111);
            fos.write(color.getValue() >> 16 & 0b11111111);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        fos.close();
    }

    static Color[] readFromTxt() throws IOException{
        long startTime = System.currentTimeMillis();
        Color[] colors = new Color[10000];
        int i = 0;

        BufferedReader br = new BufferedReader(new FileReader("stringColors.txt"));

        String line =  br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        while(st.hasMoreTokens()){
            int red = Integer.parseInt(st.nextToken());
            int green = Integer.parseInt(st.nextToken());
            int blue = Integer.parseInt(st.nextToken());
            colors[i++] = new Color(red, green, blue);

            line = br.readLine();
            if(line != null){
                st = new StringTokenizer(line);
            }
        }

        br.close();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return colors;
    }

    static Color[] readFromBinary() throws IOException{
        long startTime = System.currentTimeMillis();

        Color[] colors = new Color[10000];
        int i = 0;

        FileInputStream fis = new FileInputStream("byteColors.rafal");

        int tmp = fis.read();

        while(tmp != -1){
            int[] rgb = new int[3];
            for(int j = 0; j < 3; j++){
                rgb[j] = tmp;
                tmp = fis.read();
            }
            colors[i++] = new Color(rgb[0], rgb[1], rgb[2]);
        }

        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return colors;
    }
}
