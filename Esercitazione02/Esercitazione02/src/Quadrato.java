package it.unipa.prg.es02;
/**
 * @author Francesco
 * @version 1.0
 */
public class Quadrato {
    private int lato;

    /**
     * 
     * @param lato: lato del quadrato
     */
    public Quadrato(int lato){
        this.lato=lato;
    }
    /**
     * 
     * @return perimetro del quadrato
     */

    public int perimetro(){
        return lato*4;
    }
    /**
     *
     * @return area del quadrato
     */

    public double area(){
        return lato*lato;
    }
}
