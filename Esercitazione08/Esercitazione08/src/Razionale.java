public class Razionale extends Numero{

    private int num, den;

    public Razionale(){
        this(0, 1);
    }

    public Razionale(int num, int den){
        this.num=num;
        this.den=(den != 0 ? den : 1);
        semplifica();
    }

    public int getDen() {
        return den;
    }

    public int getNum() {
        return num;
    }

    @Override
    public Razionale addizione(Numero n){
        if(!(n instanceof Razionale)){
            System.out.println("Parametro sbagliato");
            return null;
        }
        Razionale r = (Razionale)n;
        int num = this.num*r.getDen() + r.getNum()*this.den;
        int den = this.den*r.getDen();

        return new Razionale(num, den);
    }

    @Override
    public Razionale sottrazione(Numero n){
        if(!(n instanceof Razionale)){
            System.out.println("Parametro sbagliato");
            return null;
        }
        Razionale r = (Razionale)n;
        int num = this.num*r.getDen() - r.getNum()*this.den;
        int den = this.den*r.getDen();

        return new Razionale(num, den);
    }

    @Override
    public Razionale moltiplicazione(Numero n) {
        if(!(n instanceof Razionale)){
            System.out.println("Parametro sbagliato");
            return null;
        }
        Razionale r = (Razionale)n;
        int num = r.getNum()*this.num;
        int den = r.getDen()*this.den;
        
        return new Razionale(num, den);
    }

    @Override
    public Razionale divisione(Numero n){
        if(!(n instanceof Razionale)){
            System.out.println("Parametro sbagliato");
            return null;
        }
        Razionale r = (Razionale)n;
        int num = this.num*r.getDen();
        int den = this.den*r.getNum();

        return new Razionale(num, den);
    }

    private void semplifica(){
        for(int i = 10; i > 1; i--) {
			if(num % i == 0 && den % i == 0) {
				num = num / i;
				den = den / i;
			}
		}
    }

    public String toString(){
        return getNum()+"/"+getDen();
    }
}
