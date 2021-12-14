//IL DESIGN PATTERN SINGLETON PUO' ESSERE UTILIZZATO QUANDO VOGLIAMO ESSERE SICURI CHE DI UNA CLASSE NE ESISTA UNA E UNA SOLA ISTANZA
public class Singleton {

	// STEP 1: DICHIARAZIONE DI UNA VARIABILE DI TIPO DELLA CLASSE STESSA CHE
	// DEV'ESSERE STATICO E PRIVATO
	private static Singleton istanza = null;

	// STEP 2: DICHIARO UN COSTRUTTORE CHE NON ACCETTA PARAMETRI E PRIVATO
	private Singleton() {
	}

	// STEP 3: DEFINIRE IL METODO PRINCIPALE getInstance CHE DEV'ESSERE STATICO E
	// RITORNA UN OGGETTO DI TIPO DELLA CLASSE STESSA
	public static Singleton getIstance() {
		if (istanza == null) {
			istanza = new Singleton();
		}
		return istanza;
	}

	public void showMessage() {
		System.out.println("Hello world");
	}
}