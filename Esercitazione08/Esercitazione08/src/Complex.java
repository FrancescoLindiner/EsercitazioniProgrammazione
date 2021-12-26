public class Complex {

    private int parteReale, parteImmaginaria;

    public Complex(int pR, int pI) {
        this.parteReale = pR;
        this.parteImmaginaria = pI;
    }

    public Complex() {
        this(0, 0);
    }

    public int getParteImmaginaria() {
        return parteImmaginaria;
    }

    public int getParteReale() {
        return parteReale;
    }

    public Complex somma(Complex c) {
        int parteReale = getParteReale() + c.getParteReale();
        int parteImmaginaria = getParteImmaginaria() + c.getParteImmaginaria();

        return new Complex(parteReale, parteImmaginaria);
    }

    public Complex sottrazione(Complex c){
        int parteReale = getParteReale() - c.getParteReale();
        int parteImmaginaria = getParteImmaginaria() - c.getParteImmaginaria();

        return new Complex(parteReale, parteImmaginaria);
    }

    public Complex moltiplicazione(Complex c){
        return null;
    }

    public String toString()
    {
        String out="";
        if (parteImmaginaria > 0) out="(" +parteReale + " + " + parteImmaginaria +"i)";
        else out="(" +parteReale+ " - " + (-parteImmaginaria) +"i)";
        return out;
        
    }
}
