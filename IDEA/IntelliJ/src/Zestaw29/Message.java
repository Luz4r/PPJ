package Zestaw29;

public class Message {
    int day, month, year;
    String time;
    String user;
    String ip;
    String text;

    Message(int day, int month, int year, String time, String user, String ip, String text){
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.user = user;
        this.ip = ip;
        this.text = text;
    }

    public String toString(){
        return day + "." + month + "." + year + " O godzinie: " + time + " Uzytkownik: " + user + " Adres ip: " + ip + " Wiadomosc: " + text;
    }
}
