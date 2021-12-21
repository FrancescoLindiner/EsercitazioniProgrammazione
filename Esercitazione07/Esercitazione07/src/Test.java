public class Test {
    public static void main(String[] args) {
        Singleton input = Singleton.getIstance();
        Studente studente = new Studente();

        while (true) {
            System.out.println("1)Menu' studente\n2) Menu' professore");
            int opzione = input.insertInteger("Inserisci un'opzione: ");
            switch(opzione){
                case 1:
                    System.out.println("1) Inserisci studente\n2) Elimina studente in base alla matricola\n3) Stampa");
                    int opzioneStudenti = input.insertInteger("Inserisci opzione: ");
                    switch (opzioneStudenti) {
                        case 1:
                            studente.insertStudent();
                        break;
                        case 2:
                            studente.deleteStudent();
                        break;
                        case 3:
                            studente.stampa();
                        break;
                        default:
                            break;
                    }
                case 2:
                    System.out.println("1) Inserisci professore\n2) Elimina professore in base al nome\n3) Stampa");
                    int opzioneProfessore = input.insertInteger("Inserisci opzione: ");
                    Professore professore = new Professore();
                    switch (opzioneProfessore) {
                        case 1:
                            
                            break;
                    
                        default:
                            break;
                    }
                    
            }
        }

    }
}