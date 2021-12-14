import java.util.Scanner;

//IL DESIGN PATTERN SINGLETON PUO' ESSERE UTILIZZATO QUANDO VOGLIAMO ESSERE SICURI CHE DI UNA CLASSE NE ESISTA UNA E UNA SOLA ISTANZA
public class Singleton {

	// STEP 1: DICHIARAZIONE DI UNA VARIABILE DI TIPO DELLA CLASSE STESSA CHE
	// DEV'ESSERE STATICO E PRIVATO
	//private static Singleton istanza = null;
	private static Singleton istance;
	private Scanner input;

	// STEP 2: DICHIARO UN COSTRUTTORE CHE NON ACCETTA PARAMETRI E PRIVATO
	private Singleton() {
		input = new Scanner(System.in);
	}

	// STEP 3: DEFINIRE IL METODO PRINCIPALE getInstance CHE DEV'ESSERE STATICO E
	// RITORNA UN OGGETTO DI TIPO DELLA CLASSE STESSA
	public static Singleton getIstance() {
		if (istance== null) {
			istance = new Singleton();
		}
		return istance;
	}

	public String insertString(String prompt){
		System.out.print(prompt);
		String string = input.next();
		return string;
	}

	public int insertInteger(String prompt){
		System.out.print(prompt);
		int intInput = input.nextInt();
		return intInput;
	}

	public long insertLong(String prompt){
		System.out.print(prompt);
		long longInput = input.nextLong();
		return longInput;
	}
}