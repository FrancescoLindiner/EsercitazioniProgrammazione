public class Data {
	private int giorno, mese, anno;
	private String nomiMesi[] = { "", "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto",
			"Settembre", "Ottobre", "Novembre", "Dicembre" };

	public Data(int g, int a) {
		;
	}

	public Data(int g, int m, int a) {
		setGiorno(g);
		setMese(m);
		setAnno(a);
	}

	public Data(int g, String m, int a) {
		int mese = 0;
		for (int i = 1; i < nomiMesi.length; ++i)
			if (m.equals(nomiMesi[i]))
				mese = i;
		setGiorno(g);
		setMese(mese);
		setAnno(a);
	}

	public void stampa1() {
		;
	}

	public void stampa2() {
		System.out.println(giorno + "/" + mese + "/" + anno);
	}

	public void stampa3() {
		System.out.println(toString());
	}

	public String toString() {
		return giorno + " " + nomiMesi[mese] + " " + anno;
	}

	public int getGiorno() {
		return giorno;
	}

	public int getMese() {
		return mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

}