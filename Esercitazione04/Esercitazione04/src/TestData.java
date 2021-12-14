public class TestData{
	public static void main(String args[]){
		Data d;
		
		d = new Data(26, 3, 2021);
		d.stampa1();
		d.stampa2();
		d.stampa3();
		
		System.out.println("-----------------------");
		d = new Data(289, 2021);
		d.stampa1();
		d.stampa2();
		d.stampa3();
		
		System.out.println("-----------------------");
		d = new Data(26, "Marzo", 2021);
		d.stampa1();
		d.stampa2();
		d.stampa3();
	}
}