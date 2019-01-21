package Zestaw27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[1];

        /*try {
            for(int i = 0; i < people.length; i++){
                people[i] = new Person(scanner);
            }
        }catch(WrongDataException e){
            e.printStackTrace();
        }*/

        Person[] newPeople = new Person[3];
        try{
            //saveToBinary(people);
            newPeople = readFromBinary();
        }catch(IOException e){
            e.printStackTrace();
        }

        for(Person person : newPeople){
            System.out.println(person);
        }


    }

    static void saveToBinary(Person[] people)throws IOException{
        FileOutputStream fis = new FileOutputStream("People.bin");

        for(int i = 0; i < people.length; i++){
            String[] nameAndSurname = {people[i].name, people[i].surname};
            for(int k = 0; k < nameAndSurname.length; k++){
                char[] tmp = nameAndSurname[k].toCharArray();
                for(int j = 0; j < tmp.length; j++){
                    fis.write(tmp[j]);
                }
                fis.write(' ');
            }
            fis.write(people[i].yearOfBirth & 0b11111111);
            fis.write(people[i].yearOfBirth >> 8);
            fis.write(' ');
            fis.write(people[i].sex? 1:0);
            fis.write(' ');
            fis.write(people[i].postalCode & 0b11111111);
            fis.write(people[i].postalCode >> 8);
        }
        fis.close();
    }

    static Person[] readFromBinary() throws IOException{
        Person[] people = new Person[1];
        int i = 0;
        FileInputStream fis = new FileInputStream("People.bin");

        int tmp = fis.read();
        while(tmp != -1){
            String name = "";
            String surname = "";
            int yearOfBirth = 0;
            boolean sex;
            short postalCode = 0;
            while(tmp != ' ' && tmp != -1) {
                name += (char)tmp;
                tmp = fis.read();
            }
            tmp = fis.read();

            while(tmp != ' ' && tmp != -1) {
                surname += (char)tmp;
                tmp = fis.read();
            }

            yearOfBirth += fis.read() + (fis.read() << 8);
            fis.read();
            sex = fis.read() == 1;
            fis.read();
            postalCode += fis.read() + (fis.read() << 8);
            tmp = fis.read();
            people[i++] = new Person(name, surname, yearOfBirth, sex, postalCode);
        }

        fis.close();
        return people;
    }
}
