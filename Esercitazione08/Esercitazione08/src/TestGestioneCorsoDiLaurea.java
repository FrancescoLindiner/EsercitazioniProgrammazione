public class TestGestioneCorsoDiLaurea {
    public static void main(String[] args) {
        GestioneCorsoLaurea corso = new GestioneCorsoLaurea();

        Studente studente1 = new Studente("Francesco", "Lindiner", 20, new Data(5, "Luglio", 2001), new Data(20, "Settembre", 2020), 718289, "Ingegneria Informatica", 150.0);
        corso.aggiungi(studente1);
        Studente studente2 = new Studente("Fra", "Lindi", 20, new Data(5, "Luglio", 2001), new Data(20, "Settembre", 2020), 718289, "Ingegneria Informatica", 200.0);
        corso.aggiungi(studente2);
        StudenteMagistrale studenteMagistrale = new StudenteMagistrale("Fra", "Lindi", 20, new Data(5, "Luglio", 2001), new Data(20, "Settembre", 2020), 718289, "Ingegneria Informatica", 200.0, "Liceo Scientifico", "Ingegneria informatica");
        corso.aggiungi(studenteMagistrale);

        Professore professore1 = new Professore("Mario", "Rossi", 55, new Data(5, "Agosto", 1963), new Data(23, "Maggio", 2000), "Professore", "Matematica e fisica", 2000.0);
        corso.aggiungi(professore1);
        Professore professore2 = new Professore("Luigi", "Neri", 45, new Data(5, "Agosto", 1963), new Data(23, "Maggio", 2000), "Professore", "Matematica e fisica", 1900.0);
        corso.aggiungi(professore2);
        
        corso.stampa();

        System.out.println(corso.ricavo());
        System.out.println(corso.costoSalari());

    }
}
