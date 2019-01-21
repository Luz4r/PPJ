package Zestaw27;

public class WrongDataException extends Exception {
    WrongDataException(){}

    WrongDataException(String text){
        super(text);
    }
}
