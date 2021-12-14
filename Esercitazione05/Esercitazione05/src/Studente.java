import java.util.Scanner;

public class Studente {
    Scanner input = new Scanner(System.in);
    private String nome, cognome;
    private Data dataDiNascita;
    private long matricola;

    public Studente(String n, String c, long m, Data d){
        setNome(n);
        setCognome(c);
        setDataDiNascita(d);
        setMatricola(m);
    }

    public Studente(){
        ;
    }
    
    public Studente(String nome, String cognome, long matricola, int giornoNascita, int meseNascita, int annoNascita){
		this(nome, cognome, matricola, new Data(giornoNascita, meseNascita, annoNascita));
	}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public Data getDataDiNascita() {
        return dataDiNascita;
    }
    public void setDataDiNascita(Data dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    public long getMatricola() {
        return matricola;
    }
    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public String toString(){
		return matricola + ": " + nome + " " + cognome + "("+ dataDiNascita +")";
	}
    
}
