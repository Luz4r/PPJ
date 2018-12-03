package Zestaw15;

public class Cp1x {
    private double rzeczywista;
    private double urojona;

    Cp1x(double rzeczywista, double urojona){
        this.rzeczywista = rzeczywista;
        this.urojona = urojona;
    }

    public void add(Cp1x liczbaZespolona){
        rzeczywista += liczbaZespolona.rzeczywista;
        urojona += liczbaZespolona.urojona;
    }

    public void sub(Cp1x liczbaZespolona){
        rzeczywista -= liczbaZespolona.rzeczywista;
        urojona -= liczbaZespolona.urojona;
    }

    public void mul(Cp1x liczbaZespolona){
        double rzeczywista = this.rzeczywista;
        double urojona = this.urojona;
        this.rzeczywista = rzeczywista*liczbaZespolona.rzeczywista - urojona*liczbaZespolona.urojona;
        this.urojona = rzeczywista*liczbaZespolona.urojona + urojona*liczbaZespolona.rzeczywista;
    }

    public void inc(){
        rzeczywista++;
    }

    public void show(){
        System.out.println(rzeczywista + " + " + urojona + "i");
    }
}
