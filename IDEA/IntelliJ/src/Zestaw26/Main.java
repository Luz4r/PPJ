package Zestaw26;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Color color = new Color(255, 125, 25);

        System.out.println(color);

        Color[] colors = new Color[10000];

        for(int i = 0; i < colors.length; i++){
            colors[i] = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
        }

        try{
            //saveToTxt(colors);
            saveToBinary(colors);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static void saveToTxt(Color[] colors) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("stringColors.txt"));

        for(Color color : colors){
            br.write(color.toString() + "\n");
        }

        br.close();
    }

    static void saveToBinary(Color[] colors) throws IOException{
        FileOutputStream fos = new FileOutputStream("byteColors.rafal");

        for(Color color : colors){
            fos.write(color.getValue() & 0b11111111);
            fos.write(color.getValue() >> 8 & 0b11111111);
            fos.write(color.getValue() >> 16 & 0b11111111);
        }

        fos.close();
    }
}
