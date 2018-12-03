package Zestaw14;

public class Zadanie1 {
    public static void main(String[] args){
        drawSquare(4, 'o');
    }

    public static void drawSquare(int sizeOfSquare, char whichCharToStart){
        char anotherChar = whichCharToStart != 'x'? 'x':'o';
        for(int i = 0; i < sizeOfSquare; i++){
            for(int j = 0; j < sizeOfSquare; j++){
                System.out.print((j%2 == 0? whichCharToStart:anotherChar) + " ");
            }
            if(sizeOfSquare%2 != 0){
                char temp = whichCharToStart;
                whichCharToStart = anotherChar;
                anotherChar = temp;
            }
            System.out.println();
        }
    }
}
