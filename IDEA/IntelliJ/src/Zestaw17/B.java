package Zestaw17;

public class B {
    B(){
        System.out.println(this);
    }

    static void staticShowThis(){
        //System.out.println(this);
    }

    void nstaticShowThis(){
        System.out.println(this);
    }
}
