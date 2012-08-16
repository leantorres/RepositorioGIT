package Entidades;

public class Prueba1 implements InterfazOperaciones {
    private int numero1 = 0;
    private int numero2 = 1;

    public Prueba1() {

    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double dividir() {
        double result = 0.0;
        if (numero2 == 0){
           result = -9999;
        }else{
           result = numero1/numero2;
        }
        return result;
    }

    public double multiplicar() {
        double m = numero1 * numero2;
        return m;
    }

    public double restar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double sumar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
