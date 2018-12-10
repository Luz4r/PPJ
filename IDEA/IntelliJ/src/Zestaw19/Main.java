package Zestaw19;

public class Main {
    public static void main(String[] args) {
        Telefon[] telefony = new Telefon[]{new Telefon(), new Komorka(), new Smartfon()};
        String[] numery = new String[]{"000-000-000", "123-456-789", "111-111-111", "661-589-840", "222-222-222", "123-123-123", "333-333-333" , "601-640-343", "444-444-444", "321-654-987"};

        for(int i = 0; i < numery.length; i++){
            for(int j = 0; j < telefony.length; j++){
                telefony[j].zadzwon(numery[i]);
            }
            System.out.println();
        }
        for(Telefon i : telefony) {
            i.wyswietlHistoriePolaczen();
            System.out.println();
        }

        telefony[2].zadzwon("888-888-888");
        System.out.println();
        telefony[2].wyswietlHistoriePolaczen();
    }
}
