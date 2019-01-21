package Zestaw27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    String name;
    String surname;
    int yearOfBirth;
    boolean sex;
    short postalCode;

    Person(Scanner scanner) throws WrongDataException{
        String tmp = scanner.next();
        char[] chars = tmp.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(!Character.isLetter(chars[i]))
                throw new WrongDataException("Must be a letter");
        }
        name = tmp;

        tmp = scanner.next();
        chars = tmp.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(!Character.isLetter(chars[i]))
                throw new WrongDataException("Must be a letter");
        }
        surname = tmp;

        try {
            yearOfBirth = scanner.nextInt();
            sex = scanner.nextBoolean();
            postalCode = scanner.nextShort();
        }catch(InputMismatchException e){
            throw new WrongDataException("Wrong data");
        }

        //System.out.println(name + " " + surname + " " + yearOfBirth + " " + sex + " " + postalCode);
    }

    Person(String name, String surname, int yearOfBirth, boolean sex, short postalCode){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.postalCode = postalCode;
    }

    public String toString(){
        return name + " " + surname + " " + yearOfBirth + " " + sex + " " + postalCode;
    }
}
