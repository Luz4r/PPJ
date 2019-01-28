package Zestaw29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[][] data = new String[100][3];
        try{
            BufferedReader br = new BufferedReader(new FileReader("serverLog.txt"));
            String line;
            while((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        Pattern date = Pattern.compile("(\\d|\\d{2})/(\\d|\\d{2})/\\d{4} (\\d|\\d{2}):\\d{2}:\\d{2} [AP]M");
        Pattern ip = Pattern.compile("\\(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\)");
        Pattern message = Pattern.compile("> .+\\n");

        Matcher matcherDate = date.matcher(sb.toString());
        Matcher matcherIP = ip.matcher(sb.toString());
        Matcher matcherMessage = message.matcher(sb.toString());

        int i = 0;
        while(matcherDate.find()) {
            data[i++][2] = matcherDate.group();
            //System.out.println(matcherDate.group());
            if(i == 100)
                break;
        }

        i = 0;
        while(matcherIP.find()) {
            data[i++][0] = matcherIP.group();
            //System.out.println(matcherIP.group());
            if(i == 100)
                break;
        }

        i = 0;
        while(matcherMessage.find()) {
            data[i++][1] = matcherMessage.group();
            //System.out.print(data[i-1][1]);
            if(i == 100)
                break;
        }
    }
}
