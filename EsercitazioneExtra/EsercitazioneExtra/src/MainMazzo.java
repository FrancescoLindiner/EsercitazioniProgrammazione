public class MainMazzo{
	public static void main(String[] args){
		Mazzo mazzo = new Mazzo();
		
		mazzo.riempi();
		
		mazzo.shuffle();
		
		mazzo.stampa();
	}
}
