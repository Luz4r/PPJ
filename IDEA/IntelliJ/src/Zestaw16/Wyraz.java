package Zestaw16;

public class Wyraz {
    char[] word;
    int howManyChars;

    Wyraz(){
        word = new char[100];
        howManyChars = 0;
    }

    public void dodajZnak(char character){
        if(howManyChars == word.length){
            char[] newArray = new char[howManyChars+10];
            for(int i = 0; i < word.length; i++){
                newArray[i] = word[i];
            }
            word = newArray;
        }
        word[howManyChars] = character;
        howManyChars++;
    }

    public void wyswietl(){
        for(int i = 0; i < howManyChars; i++)
            System.out.print(word[i]);
        System.out.println();
    }

    public int length(){
        return howManyChars;
    }
}
