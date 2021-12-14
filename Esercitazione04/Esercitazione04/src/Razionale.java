public class Razionale {
    private int numeratore, denominatore;

    public Razionale(int numeratore, int denominatore){
        this.numeratore=numeratore;
        this.denominatore = (denominatore!=0 ? denominatore : 1);
    }

    public Razionale(){
        this.numeratore=0;
        this.denominatore=1;
    }

    public int getNumeratore(){
        return numeratore;
    }

    public int getDenominatore(){
        return denominatore;
    }

    public void setNumeratore(int numeratore){
        this.numeratore=numeratore;
    }

    public void setDenominatore(int denominatore){
        this.denominatore=denominatore;
    }

    public Razionale somma(Razionale altro){
		int risNum, risDen;
		risNum = this.numeratore*altro.denominatore + this.denominatore*altro.numeratore;
		risDen = this.denominatore*altro.denominatore;
		return new Razionale(risNum, risDen);
	}
    
    public Razionale moltiplica(Razionale altro){
		int risNum, risDen;		
		risNum = this.numeratore * altro.numeratore;
		risDen = this.denominatore * altro.denominatore;
		return new Razionale(risNum, risDen);
	}
}