package Zestaw15;

public class MethodCurrier {
    public void setValue(int value){
        System.out.println(value);
        value += 2;
        System.out.println(value);
    }

    public void setValue(float value){
        System.out.println(value);
        value += 2;
        System.out.println(value);
    }

    public void setValue(Number number){
        number.showVal();
        number.setVal(5);
        number.showVal();
    }
}
