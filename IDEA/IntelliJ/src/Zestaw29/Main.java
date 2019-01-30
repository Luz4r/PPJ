package Zestaw29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[][] data = new String[100][4];
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
        Pattern ip = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Pattern message = Pattern.compile("> .+\n");
        Pattern user = Pattern.compile("- [()\\w ]+ ");

        Matcher matcherDate = date.matcher(sb.toString());
        Matcher matcherIP = ip.matcher(sb.toString());
        Matcher matcherMessage = message.matcher(sb.toString());
        Matcher matcherUser = user.matcher(sb.toString());

        int i = 0;
        while(matcherDate.find()) {
            data[i++][2] = matcherDate.group();
            if(i == 100)
                break;
        }

        i = 0;
        while(matcherIP.find()) {
            data[i++][0] = matcherIP.group();
            if(i == 100)
                break;
        }

        i = 0;
        while(matcherMessage.find()) {
            data[i++][1] = matcherMessage.group();
            if(i == 100)
                break;
        }

        i = 0;
        while(matcherUser.find()) {
            data[i++][3] = matcherUser.group();
            if(i == 100)
                break;
        }

        Message[] array = createMessagesFromFile(data);

        for(Message message1:array)
            System.out.println(message1);
    }

    static Message[] createMessagesFromFile(String[][] data){
        Message[] messages = new Message[data.length];

        for(int i = 0; i < data.length; i++){
            String ip = data[i][0];

            Pattern message = Pattern.compile("[^> ].+\n");
            Matcher matcherMessage = message.matcher(data[i][1]);
            String text = "";
            if(matcherMessage.find())
                text = matcherMessage.group();

            StringTokenizer st = new StringTokenizer(data[i][2]);
            String date = st.nextToken();
            String time = st.nextToken();

            st = new StringTokenizer(date, "/");
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            Pattern user = Pattern.compile("[^- ][\\w() ]+");
            Matcher matcherUser = user.matcher(data[i][3]);
            String userName = "";
            if(matcherUser.find())
                userName = matcherUser.group();

            messages[i] = new Message(day, month, year, time, userName, ip, text);
        }

        return messages;
    }
}
