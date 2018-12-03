package Zestaw13;

public class Zadanie5 {
    public static void main(String[] args){
        char[] array = "kajak".toCharArray();

        System.out.println(isPalindrome(array, 0));
    }

    static boolean isPalindrome(char[] array, int whichPosition){
        if(whichPosition == array.length - (1 + whichPosition))
            return true;
        if(array[whichPosition] == array[array.length - 1 - whichPosition])
            return isPalindrome(array, ++whichPosition);
        return false;
    }
}
