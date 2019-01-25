package Zestaw28;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-c]+h");

        Matcher matcher = pattern.matcher(
                //"aaaabbcch"
                //"bbaaaacch"
                //"ccaaacch"
                //"bbaaaabbh"
                "abch"
        );

        System.out.println(matcher.matches());

        try{
            FileInputStream fis = new FileInputStream("1.txt");
            StringBuilder sb = new StringBuilder();

            int tmp;
            while((tmp = fis.read()) != -1){
                sb.append((char)tmp);
            }

            Pattern p = Pattern.compile("[a-zA-Z]+");
            Matcher m = p.matcher(sb.toString());
            int count = 0;
            while(m.find())
                count++;

            System.out.println(count);

            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        String text = ": wieś w Polsce położona w województwie wielkopolskim, w powiecie kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w województwie konińskim";

        Pattern p = Pattern.compile("[0-9]{1,4}-[0-9]{1,4}");
        Matcher m = p.matcher(text);
        int count = 0;

        while(m.find()){
            count++;
        }
        System.out.println(count);

        try{
            BufferedReader br = new BufferedReader(new FileReader("telFormat.txt"));

            p = Pattern.compile("(\\+\\d{2})?(\\((\\d{2}|\\.?)\\))?\\d{7,9}|(1 )?\\d{3}-\\d{3}|\\d{4}-\\d{3}|\\d{3} \\d{3} \\d{3}|\\d{3}[-_]\\d{3}[-_]\\d{3}");

            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
