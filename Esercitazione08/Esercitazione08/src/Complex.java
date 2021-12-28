public class Complex extends Numero {

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

    @Override
    public Complex addizione(Numero c) { // Il tipo di ritorno nella sotto classe può essere diverso. E' sempre un
                                         // override
        if (!(c instanceof Complex)) {
            System.out.println("Parametro sbagliato");
            return null;
        }
        Complex r = (Complex) c; // Faccio un cast del numero c in Complex, in questo caso il cast è sicuro
                                 // perché ho già controllato che c sia un Complex
        int parteReale = getParteReale() + r.getParteReale();
        int parteImmaginaria = getParteImmaginaria() + r.getParteImmaginaria();

        return new Complex(parteReale, parteImmaginaria);
    }

    @Override
    public Complex sottrazione(Numero c) {
        if (!(c instanceof Complex)) {
            System.out.println("Parametro sbagliato");
            return null;
        }
        Complex r = (Complex) c;
        int parteReale = getParteReale() - r.getParteReale();
        int parteImmaginaria = getParteImmaginaria() - r.getParteImmaginaria();

        return new Complex(parteReale, parteImmaginaria);
    }

    @Override
    public Complex moltiplicazione(Numero c) {
        if (!(c instanceof Complex)) {
            System.out.println("Parametro sbagliato");
            return null;
        }
        Complex r = (Complex) c;
        System.out.println("Da implementare");
        return null;
    }

    @Override
    public Complex divisione(Numero c){
        if (!(c instanceof Complex)) {
            System.out.println("Parametro sbagliato");
            return null;
        }
        Complex r = (Complex) c;
        System.out.println("Da implementare");
        return null;
    }

    public String toString() {
        String out = "";
        if (parteImmaginaria > 0)
            out = "(" + parteReale + " + " + parteImmaginaria + "i)";
        else
            out = "(" + parteReale + " - " + (-parteImmaginaria) + "i)";
        return out;

    }
}
