package Zestaw26;

public class Color {
    private int value;

    Color(int red, int green, int blue){
        value = red + (green << 8) + (blue << 16);
    }

    public String toString(){
        return super.toString() + " red: " + (value & 0b11111111) + " green: " + (value >> 8 & 0b11111111) + " blue: " + (value >> 16 & 0b11111111);
    }

    public int getValue(){
        return value;
    }
}
