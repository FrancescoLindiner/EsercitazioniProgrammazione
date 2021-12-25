public class Razionale{

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

    public Razionale addizione(Razionale n){
        
        int num = this.num*n.getDen() + n.getNum()*this.den;
        int den = this.den*n.getDen();

        return new Razionale(num, den);
    }

    public Razionale sottrazione(Razionale n){

        int num = this.num*n.getDen() - n.getNum()*this.den;
        int den = this.den*n.getDen();

        return new Razionale(num, den);
    }

    public Razionale moltiplicazione(Razionale n1) {
    
        int num = n1.getNum()*this.num;
        int den = n1.getDen()*this.den;
        
        return new Razionale(num, den);
    }

    public Razionale divisione(Razionale n){
        
        int num = this.num*n.getDen();
        int den = this.den*n.getNum();

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
